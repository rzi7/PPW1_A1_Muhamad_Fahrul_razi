<!DOCTYPE html>
<html lang='en'>
<head>
    <meta charset='UTF-8'>
    <meta name='viewport' content='width=device-width, initial-scale=1.0'>
    <title>Akses array dengan looping</title>
</head>
<body>
    <?php
        $cars = array("Volvo", "BMW", "Toyota");
        $arrlength = count($cars);
        for ($x = 0; $x < $arrlength; $x++) {
            echo $cars[$x];
            echo "<br>";
        }
    ?>
</body>
</html>