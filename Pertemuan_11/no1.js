var root = document.getElementById('root');

let bil1 = prompt("Masukkan bilangan pertama");
let bil2 = prompt("Masukkan bilangan kedua");

if (bil1 > bil2) {
    root.innerHTML = `<p>${bil1} lebih besar dari ${bil2}</p>`;
} else if (bil1 < bil2) {
    root.innerHTML = `<p>${bil1} lebih kecil dari ${bil2}</p>`;
} else {
    root.innerHTML = `<p>${bil1} sama dengan ${bil2}</p>`
}