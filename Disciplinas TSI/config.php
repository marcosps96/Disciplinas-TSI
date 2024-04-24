<?php

// host
$host = 'http://localhost/sistema_livros/';

// db
$db_name = 'biblioteca';
$db_host = 'localhost';
$db_user = 'root';
$db_pass = '';

try {
    $conn = mysqli_connect($db_host, $db_user, $db_pass, $db_name);
} catch (\Throwable $th) {
    throw $th;
}