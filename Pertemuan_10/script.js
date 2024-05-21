document.getElementById('submit').addEventListener('click', function(event){
    event.preventDefault();
    var nama = document.getElementById("nama").value;
    var teks = document.getElementById('teks');

    teks.innerHTML = 'Terima Kasih Telah Mengisi Kawan'
    alert("Terima kasih " + nama +" telah melakukan submit");
    setTimeout(function() {
        document.write('Halo ' + nama + ", terimakasih telah mengisi form");
    }, 2000);
    console.log(nama);
}) 
