# Fungsi sederhana
def Selamat_Pagi():
    print("Selamat Pagi")

Selamat_Pagi()

# Fungsi dengan parameter
def sapa(nama):
    print(f"Hai, {nama}")

sapa("Andi")
sapa("Budi")

# Fungsi dengan parameter dan nilai kembalian
import math

def luas_lingkaran():
    jari_jari = float(input('Masukkan jari-jari lingkaran: '))
    luas = math.pi * jari_jari ** 2
    return luas

luas = luas_lingkaran()
print(f'Luas lingkaran: {luas}')

# Fungsi dengan parameter dan dengan nilai kembali
def jumlahkan(a, b):
    return a+b

haisl_jumlah =jumlahkan(10, 20)
print(f'hasik penjumlahan: {haisl_jumlah}')

# Fungsi dengan parameter dan nilai default
def sapa(nama="John Doe"):
    print(f'Hai, {nama}')

sapa('Andi')
sapa() #Tanpa parameter, nama kaan mengguanakan nilai default

# Fungsi dengan parameter dan argumen keyword
def info(nama, usia):
    print(f'Nama: {nama}, Usia: {usia}')

# Memanggil fungsi dengan argumen keyword
info(nama='Budi', usia=25)
info(usia=30, nama='Cici') #Urutan argumen tidak masalah


# tugas 
def dataMahasiswa():
    jumlahMahasiswa = int(input('Masukkan jumlah mahasiswa: '))
    data_mahasiswa = []
    for i in range(jumlahMahasiswa):
        nim = input('Masukkan NIM mahasiswa ke-%d: ' % (i + 1)) # %d adalah menggantikan dari variabel 
        nama = input('Masukkkan nama mahasiswa ke-%d: ' % (i + 1)) 
        asal = input('Masukkan daerah asal mahasiswa ke-%d: ' % (i +1))

        data_mahasiswa.append([nim, nama, asal])

    print('Data Mahasiswa: ')
    for i in range(jumlahMahasiswa):
        print('-'*20)
        print("NIM :", data_mahasiswa[i][0])
        print("Nama :", data_mahasiswa[i][1])
        print("Asal daerah :", data_mahasiswa[i][2])

dataMahasiswa()

