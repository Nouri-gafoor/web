<!DOCTYPE html>
<html>
<head>
    <title>Indian Cricket Players</title>
    <style>
        table {
            width: 40%;
            border-collapse: collapse;
            margin: 20px auto;
        }
        th, td {
            padding: 10px;
            border: 1px solid #000;
            text-align: center;
        }
        th {
            background-color: #f2a900;
        }
    </style>
</head>
<body>

<?php
// PHP array of Indian Cricket players
$players = array(
    "M S Dhoni",
    "Ravindra Jadeja",
    "Shivam Dupe",
    "Virat Kohli",
    "Shubman Gill",
    "Ravichandran Ashwin"
);

// Display in HTML table
echo "<table>";
echo "<tr><th>Sl. No</th><th>Player Name</th></tr>";

for ($i = 0; $i < count($players); $i++) {
    echo "<tr><td>" . ($i + 1) . "</td><td>" . $players[$i] . "</td></tr>";
}

echo "</table>";
?>

</body>
</html>
