<!DOCTYPE html>
<html>
<head>
    <title>Library Book Entry and Search</title>
    <style>
        body {
            font-family: Arial;
            text-align: center;
            margin-top: 30px;
        }
        form {
            margin-bottom: 30px;
        }
        input, button {
            padding: 10px;
            margin: 5px;
        }
        table {
            margin: auto;
            border-collapse: collapse;
            width: 80%;
        }
        th, td {
            border: 1px solid #444;
            padding: 10px;
        }
        th {
            background-color: #007bff;
            color: white;
        }
    </style>
</head>
<body>

<h2>Enter Book Information</h2>
<form method="POST">
    <input type="number" name="accession_no" placeholder="Accession No" required><br>
    <input type="text" name="title" placeholder="Title" required><br>
    <input type="text" name="authors" placeholder="Authors" required><br>
    <input type="text" name="edition" placeholder="Edition" required><br>
    <input type="text" name="publisher" placeholder="Publisher" required><br>
    <button type="submit" name="add">Add Book</button>
</form>

<h2>Search Book by Title</h2>
<form method="GET">
    <input type="text" name="search_title" placeholder="Enter title to search" required>
    <button type="submit">Search</button>
</form>

<?php
// DB connection
$conn = new mysqli("localhost", "root", "", "library");

if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Add Book
if (isset($_POST['add'])) {
    $accession_no = $_POST['accession_no'];
    $title = $_POST['title'];
    $authors = $_POST['authors'];
    $edition = $_POST['edition'];
    $publisher = $_POST['publisher'];

    $sql = "INSERT INTO books (accession_no, title, authors, edition, publisher)
            VALUES ('$accession_no', '$title', '$authors', '$edition', '$publisher')";

    if ($conn->query($sql) === TRUE) {
        echo "<p style='color: green;'>Book added successfully!</p>";
    } else {
        echo "<p style='color: red;'>Error: " . $conn->error . "</p>";
    }
}

// Search Book
// Search Book
if (isset($_GET['search_title'])) {
    $search = $_GET['search_title'];
    $sql = "SELECT * FROM books WHERE title LIKE '%$search%'";
    $result = $conn->query($sql);

    if ($result->num_rows > 0) {
        echo "<h3>Search Results:</h3>";
        echo "<table>
                <tr>
                    <th>Accession No</th>
                    <th>Title</th>
                    <th>Authors</th>
                    <th>Edition</th>
                    <th>Publisher</th>
                </tr>";
        while ($row = $result->fetch_assoc()) {
            echo "<tr>
                    <td>{$row['accession_no']}</td>
                    <td>{$row['title']}</td>
                    <td>{$row['authors']}</td>
                    <td>{$row['edition']}</td>
                    <td>{$row['publisher']}</td>
                  </tr>";
        }
        echo "</table>";
    } else {
        echo "<script>alert('Book not found!');</script>";
    }
}


$conn->close();
?>

</body>
</html>
