public class Antrian {
    enum TIPE_PASIENS {
        BPJS, MANDIRI
    }

    private String nomorAntrian;
    private String namaPendaftar;
    private String keluhan;
    private Dokter dokter;
    private TIPE_PASIENS tipePasien;

    public Antrian(String nomorAntrian, String namaPendaftar, String keluhan, Dokter dokter, TIPE_PASIENS tipePasien) {
        this.nomorAntrian = nomorAntrian;
        this.namaPendaftar = namaPendaftar;
        this.keluhan = keluhan;
        this.dokter = dokter;
        this.tipePasien = tipePasien;
    }

    // Getter and Setter
    public String getNomorAntrian() {
        return nomorAntrian;
    }

    public String getNamaPendaftar() {
        return namaPendaftar;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public Dokter getDokter() {
        return dokter;
    }

    public TIPE_PASIENS getTipePasien() {
        return tipePasien;
    }

}
