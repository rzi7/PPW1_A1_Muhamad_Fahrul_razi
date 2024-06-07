<!DOCTYPE html>
<html lang='en'>
<head>
    <meta charset='UTF-8'>
    <meta name='viewport' content='width=device-width, initial-scale=1.0'>
    <title>Multidimensi array</title>
    <style>
        table {
            width: 50%;
            border-collapse: collapse;
            margin: 20px 0;
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <?php
        $mahasiswa = array(
            array("nim" => "786234", "nama" => "Akbar"),
            array("nim" => "239879", "nama" => "Akmal"),
            array("nim" => "984271", "nama" => "Adznan"),
            array("nim" => "000000", "nama" => "Uvuvuevue"),
        );

        echo "<table>";
        echo "<tr>
            <th>NIM</th>
            <th>NAMA</th>
            <th>Ket</th>
        </tr>";

        foreach($mahasiswa as $mhs) {
            echo "<tr>";
            echo "<td>" . $mhs['nim'] . "</td>";
            echo "<td>" . $mhs['nama'] . "</td>";
            if ($mhs['nama'] == "Uvuvuevue") {
                echo "<td>Ini baru mahasiswa saya</td>";
            } else {
                echo "<td>Ini bukan mahasiswa saya</td>";
            echo "</tr>";
            }
        }
        echo "</table>";
    ?>
</body>
</html>