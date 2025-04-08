<?php
// Step 1: Create an array of student names
$students = array("Zara", "Amit", "John", "Bella", "Mohan");

// Step 2: Display the original array
echo "<h3>Original Student List:</h3>";
echo "<pre>";
print_r($students);
echo "</pre>";

// Step 3: Sort in ascending order using asort (maintains index association)
asort($students);
echo "<h3>Sorted Student List (Ascending using asort):</h3>";
echo "<pre>";
print_r($students);
echo "</pre>";

// Step 4: Sort in descending order using arsort (maintains index association)
arsort($students);
echo "<h3>Sorted Student List (Descending using arsort):</h3>";
echo "<pre>";
print_r($students);
echo "</pre>";
?>
