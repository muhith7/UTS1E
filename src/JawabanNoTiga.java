import java.util.Scanner;

class JawabanNoTiga {
    JawabanNoTiga() {
    }

    public static void main(String[] args) {
        while(true) {
            JawabanNoTiga.CheckNumber.NIK();
        }
    }

    public class CheckNumber {
        static int kategoriTop = 0;
        static int kategoriMiddle = 0;
        static int kategoriReguler = 0;
        static int kategoriStaff = 0;
        static boolean success = false;

        public CheckNumber(JawabanNoTiga this$0) {
        }

        public static void main(String[] args) {
            String[] var10000 = new String[]{"01-TopLevel", "02-MiddleLevel", "03-RegularStaff", "04-Staff"};

            for(int i = 0; i < 200; ++i) {
                NIK();
            }

        }

        static void cekNIKKaryawan(String nik) {
            if (nik.length() <= 10) {
                if (nik.contains("C01")) {
                    success = true;
                    ++kategoriTop;
                } else if (nik.contains("J02")) {
                    success = true;
                    ++kategoriMiddle;
                } else if (nik.contains("N03")) {
                    success = true;
                    ++kategoriReguler;
                } else if (nik.contains("P04")) {
                    success = true;
                    ++kategoriStaff;
                } else {
                    success = false;
                    System.out.println("Failed, Tolong cek kembali data registrasi anda");
                }
            } else {
                success = false;
                System.out.println("Failed, Pastikan NIK anda benar dan tidak kurang atau lebih dari 10");
            }

        }

        static void NIK() {
            Scanner inputRegistrasi = new Scanner(System.in);
            System.out.println("Masukan NIK untuk Registrasi bus");
            String nik = inputRegistrasi.nextLine();
            cekNIKKaryawan(nik);
            if (success) {
                printResult();
            }

        }

        static void printResult() {
            System.out.println("Jumlah penumpang di bus 01-TopLevel = " + kategoriTop);
            System.out.println("Jumlah penumpang di bus 02-MiddleLevel = " + kategoriMiddle);
            System.out.println("Jumlah penumpang di bus 03-RegulerStaff = " + kategoriReguler);
            System.out.println("Jumlah penumpang di bus 04-Staff = " + kategoriStaff);
            System.out.println();
        }
    }
}
