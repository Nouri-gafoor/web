<!DOCTYPE html>
<html>
<head>
    <title>Cricket Players</title>
    <style>
        table {
            width: 50%;
            border-collapse: collapse;
            margin: 30px auto;
        }
        th, td {
            padding: 12px;
            border: 1px solid #333;
            text-align: center;
        }
        th {
            background-color:rgb(99, 171, 248);
            color: white;
        }
    </style>
</head>
<body>

<?php

$servername = "localhost";
$username = "root"; 
$password = "";    
$dbname = "cricket";


$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("<p>Connection failed: " . $conn->connect_error . "</p>");
}

$sql = "SELECT id, name, role FROM players";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
    echo "<table>";
    echo "<tr><th>ID</th><th>Player Name</th><th>Role</th></tr>";

    while($row = $result->fetch_assoc()) {
        echo "<tr>
                <td>" . $row["id"] . "</td>
                <td>" . $row["name"] . "</td>
                <td>" . $row["role"] . "</td>
              </tr>";
    }

    echo "</table>";
} else {
    echo "<p>No records found.</p>";
}

$conn->close();
?>

</body>
</html>
