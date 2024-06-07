<!DOCTYPE html>
<html lang='en'>
<head>
    <meta charset='UTF-8'>
    <meta name='viewport' content='width=device-width, initial-scale=1.0'>
    <title>array</title>
</head>
<body>
    <?php
        $data = array("apel", "jeruk", "mangga", "pisang", "semangka");

        foreach ($data as $buah) {
            if ($buah == "mangga") {
                echo "Saya suka mangga!<br>";
            } else {
                echo "Ini adalah $buah.<br>";
            }
        }
    ?>
</body>
</html>