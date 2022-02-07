public class Pekerjaan {
    //deklarasi variabel 
    private String idKerja;
    private PosisiKerja posisiKerja;
    private String alamatKerja;

    public Pekerjaan() {
    }

    public String getIdKerja() {
        return this.idKerja;
    }

    public void setIdKerja(String idKerja) {
        this.idKerja = idKerja;
    }

    public PosisiKerja getPosisiKerja() {
        return this.posisiKerja;
    }

    public void setPosisiKerja(PosisiKerja posisiKerja) {
        this.posisiKerja = posisiKerja;
    }

    public String getAlamatKerja() {
        return this.alamatKerja;
    }

    public void setAlamatKerja(String alamatKerja) {
        this.alamatKerja = alamatKerja;
    }

    public void print() {
        String nomor = this.idKerja;
        System.out.println("ID Pekerjaan : " + nomor + ", Alamat Pekerjaan " + this.alamatKerja + ", ID Posisi Pekerjaan : " + this.posisiKerja.getIdPosisiKerja() + ", Nama Posisi Pekerjaan : " + this.posisiKerja.getNamaPosisiKerja());
    }
}