public class Pasien extends Orang {
    private static int idCounter = 0;
    private String idPasien;
    private String pekerjaan;
    private String alamat;

    public Pasien(String nama, String tanggalLahir, JENIS_KELAMIN jenisKelamin, String pekerjaan, String alamat) {
        super(nama, tanggalLahir, jenisKelamin);
        this.pekerjaan = pekerjaan;
        this.alamat = alamat;
        this.idPasien = generateIdPasien();
    }

    private String generateIdPasien() {
        return "PAS" + (++idCounter);
    }

    public void daftar(RumahSakit rumahSakit, String keluhan, String namaDokter, Antrian.TIPE_PASIENS tipePasien) {
        Dokter dokter = getDokterByNama(rumahSakit, namaDokter);

        if (dokter != null) {
            String nomorAntrian = generateNomorAntrian(rumahSakit, dokter);
            Antrian antrian = new Antrian(nomorAntrian, this.getNama(), keluhan, dokter, tipePasien);
            rumahSakit.tambahAntrianPasien(antrian);
            dokter.tambahAntrian(antrian);
            System.out
                    .println("SUKSES");
        } else {
            System.out.println("Dokter " + namaDokter + " tidak ditemukan.");
        }
    }

    private Dokter getDokterByNama(RumahSakit rumahSakit, String namaDokter) {
        return rumahSakit.getListDokter().stream()
                .filter(d -> d.getNama().equalsIgnoreCase(namaDokter))
                .findFirst()
                .orElse(null);
    }

    private String generateNomorAntrian(RumahSakit rumahSakit, Dokter dokter) {
        return "D_" + dokter.getSpesialisasi() + "_" + (rumahSakit.getListAntrianPasien().size() + 1);
    }

    public void periksa(RumahSakit rumahSakit) {
        Antrian antrian = getAntrianByNama(rumahSakit, this.getNama());

        if (antrian != null) {
            rumahSakit.hapusAntrianPasien(antrian);
            antrian.getDokter().hapusAntrian(antrian);
            System.out.println(
                    "SUKSES");
        } else {
            System.out.println("BELUM DAFTAR");
        }
    }

    private Antrian getAntrianByNama(RumahSakit rumahSakit, String namaPasien) {
        return rumahSakit.getListAntrianPasien().stream()
                .filter(a -> a.getNamaPendaftar().equalsIgnoreCase(namaPasien))
                .findFirst()
                .orElse(null);
    }

    public String getIdPasien() {
        return idPasien;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public String getAlamat() {
        return alamat;
    }
}
