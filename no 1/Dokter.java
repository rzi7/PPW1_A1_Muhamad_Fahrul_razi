import java.util.ArrayList;
import java.util.List;

public class Dokter extends Orang {
    private static int idCounter = 0;
    private String idDokter;
    private String nomorSTR;
    private String spesialisasi;
    private List<Antrian> antrianPasien;

    public Dokter(String nama, String tanggalLahir, JENIS_KELAMIN jenisKelamin, String nomorSTR, String spesialisasi) {
        super(nama, tanggalLahir, jenisKelamin);
        this.nomorSTR = nomorSTR;
        this.spesialisasi = spesialisasi;
        this.antrianPasien = new ArrayList<>();
    }

    public void daftar(RumahSakit rumahSakit) {
        if (!rumahSakit.getListDokter().contains(this)) {
            this.idDokter = "DOK" + (++idCounter);
            rumahSakit.tambahDokter(this);
            System.out.println("SUKSES");
        } else {
            System.out.println("DOKTER SUDAH TERDAFTAR");
        }
    }

    // Getter and Setter
    public String getIdDokter() {
        return idDokter;
    }

    public String getNomorSTR() {
        return nomorSTR;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public List<Antrian> getAntrianPasien() {
        return antrianPasien;
    }

    public void tambahAntrian(Antrian antrian) {
        this.antrianPasien.add(antrian);
    }

    public void hapusAntrian(Antrian antrian) {
        this.antrianPasien.remove(antrian);
    }
}