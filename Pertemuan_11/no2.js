var root = document.getElementById('root');
var nama = document.getElementById('nama');
var nim = document.getElementById('NIM');
var year = document.getElementById('angkatan');

var isTrue = confirm("Apakah anda praktikan PPW1?")

if (isTrue) {
    var userName = prompt("Masukkan nama anda");
    var userNIM = prompt("Masukkan NIM anda");
    var userAngkatan = prompt("Angkatan berapa anda");
    
    nama.innerHTML = `<p>${userName}</p>`;
    nim.innerHTML = `<p>${userNIM}</p>`;
    year.innerHTML = `<p>${userAngkatan}</p>`;
} else {
    root.innerHTML = "Anda bukan praktikan PPW1";
}