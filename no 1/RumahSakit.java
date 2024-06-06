import java.util.ArrayList;
import java.util.List;

public class RumahSakit {
    private String nama;
    private String alamat;
    private String noTelepon;
    private List<Dokter> listDokter;
    private List<Antrian> listAntrianPasien;

    public RumahSakit(String nama, String alamat, String noTelepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
        this.listDokter = new ArrayList<>();
        this.listAntrianPasien = new ArrayList<>();
    }

    public void tambahDokter(Dokter dokter) {
        this.listDokter.add(dokter);
    }

    public List<Dokter> getListDokter() {
        return listDokter;
    }

    public void cekListDokter() {
        if (listDokter.isEmpty()) {
            System.out.println("BELUM ADA DOKTER TERSEDIA SAAT INI");
        } else {
            System.out.println("LIST DOKTER YANG TERSEDIA SAAT INI");
            System.out.println("======================================");
            int i = 1;
            for (Dokter dokter : listDokter) {
                System.out.println(
                        i + ". Nama dokter : " + dokter.getNama() + ", Dokter Spesialis : " + dokter.getSpesialisasi());
                i++;
            }
        }
    }

    public void tambahAntrianPasien(Antrian antrian) {
        this.listAntrianPasien.add(antrian);
    }

    public void cekAntrianPasien() {
        System.out.println("ANTRIAN RUMAH SAKIT SAAT INI");
        System.out.println("================================");
        for (Dokter d : listDokter) {
            System.out.println("DR. " + d.getNama());
            boolean ada = false;
            for (Antrian antrian : listAntrianPasien) {
                if (d.getNama().equals(antrian.getDokter().getNama())) {
                    ada = true;
                    if (ada) {
                        System.out.println("ID Antrain : " + antrian.getNomorAntrian() + ", Atas Nama : "
                                + antrian.getNamaPendaftar());
                    }
                }
            }

            if (!ada) {
                System.out.println("ANTRIAN KOSONG");
            }
            System.out.println("======================================");
        }
    }

    public void hapusAntrianPasien(Antrian antrian) {
        this.listAntrianPasien.remove(antrian);
    }

    public List<Antrian> getListAntrianPasien() {
        return listAntrianPasien;
    }
}