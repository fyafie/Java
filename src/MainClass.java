//import array list, list, scanner, stream collectors
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//main class
public class MainClass {
    public MainClass() {
    }

    public static void main(String[] args) {
        //deklarasi array list dan scanner
        ArrayList<Pekerjaan> pekerjaan = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        //melakukan loop dengan while
        while(true) {
            //print tampilan menu
            System.out.println("==============Cariin Kerja==============");
            System.out.println("1. Tambah Pekerjaan Baru");
            System.out.println("2. Cetak Semua Pekerjaan");
            System.out.println("3. Hapus Pekerjaan");
            System.out.println("4. Keluar");
            System.out.println("Silahkan Pilih 1/ 2/ 3/ 4: ");
            //variabel input untuk memilih menu
            String input = scan.nextLine();

            //variabel id pekerjaan
            String idKerja;
            //pilihan menu 1, input pekerjaan
            if (input.equalsIgnoreCase("1")) {
                System.out.println("Format pengisian : [id pekerjaan],[alamat pekerjaan],[id pekerjaan],[nama posisi]");
                idKerja = scan.nextLine();
                String[] split = idKerja.split(",");
                if (split.length == 4) {
                    Pekerjaan newPekerjaan = new Pekerjaan();
                    newPekerjaan.setIdKerja(split[0]);
                    newPekerjaan.setAlamatKerja(split[1]);
                    PosisiKerja posisiKerja = new PosisiKerja();
                    posisiKerja.setIdPosisiKerja(Integer.parseInt(split[2]));
                    posisiKerja.setNamaPosisiKerja(split[3]);
                    newPekerjaan.setPosisiKerja(posisiKerja);
                    pekerjaan.add(newPekerjaan);
                    System.out.println("Berhasil Menambahkan pekerjaan");
                } else {
                    System.out.println("Format salah");
                }
             //pilihan menu 2, mencetak list pekerjaan
            } else if (input.equalsIgnoreCase("2")) {
                System.out.println("List Pekerjaan : ");
                pekerjaan.forEach((job) -> {
                    job.print();
                });
             //pilihan menu 3, menghapus data
            } else if (input.equalsIgnoreCase("3")) {
                System.out.println("Masukan ID pekerjaan untuk menghapus : ");
                idKerja = scan.nextLine();
                List<Pekerjaan> collect = (List)pekerjaan.stream().filter((job) -> {
                    return job.getIdKerja().equalsIgnoreCase(idKerja);
                }).collect(Collectors.toList());
                //jika data pekerjaan tidak ada
                if (collect.isEmpty()) {
                    System.out.println("Pekerjaan dengan ID " + idKerja + " tidak ada");
                } else {
                    //jika data pekerjaan ada
                    pekerjaan.removeAll(collect);
                    System.out.println("Berhasil menghapus pekerjaan dengan ID " + idKerja);
                }
            }
            //pilihan menu 4, keluar dari aplikasi
            if (input.equalsIgnoreCase("4")) {
                return;
            }
        }
    }
}
