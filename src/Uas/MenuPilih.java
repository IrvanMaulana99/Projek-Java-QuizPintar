package Uas;
import java.util.Scanner;

public class MenuPilih {
    Scanner in = new Scanner(System.in);
    int plh;
    public static final String HIJAU = "\u001b[32m";
    public static final String MERAH = "\u001b[31m";
    public static final String BIRU = "\u001b[34m";
   
    void menu(){
        System.out.println(BIRU+ "************************************************************");
        System.out.println(BIRU+"         __________SELAMAT_______DATANG__________           ");
        System.out.println(BIRU+"____________________________Tes_____________________________");
        System.out.println(BIRU+"--------------------Tes Pengetahuan Umum--------------------");
        System.out.println(BIRU+ "============================================================");
        System.out.println(HIJAU+" Kelompok :                         Irvan Maulana - 18111167");
        System.out.println(HIJAU+"                                    Wildan Ma'ruf - 18111170");
        System.out.println(BIRU+ "============================================================");
        System.out.println(BIRU+ "============================================================");
        System.out.println("                     Kategori Kesulitan                     ");
        System.out.println(BIRU+ "============================================================");
        System.out.println("  |  1. Mudah      |   2. Menengah       |   3. Sulit    |  ");
        System.out.println(BIRU+ "------------------------------------------------------------");
        do{
        System.out.printf("Masukkan kategori pilihan anda(1/2/3) : ");
        try{
        plh = in.nextInt();
        }
        catch(Exception e)
        {
            System.out.println(MERAH+"Input hanya boleh angka");
            in.nextLine();
        }
        }while(plh>3);
    }
    void pilih(){
        switch (plh) {
            case 1:
                System.out.print("Apakah anda yakin ingin mencoba tes Tingkat Mudah(y/t)? ");
                Scanner pil1U = new Scanner(System.in);
                String p1U = pil1U.nextLine();
                if (p1U.equalsIgnoreCase("T")){
                    menu();
                    pilih();
                }
                Mudah soal = new Mudah();
                soal.mudah();
                System.out.println("=====================================");
                System.out.print("Apakah anda ingin mencoba kembali tes Mudah ini(y/t)? ");
                Scanner pil1 = new Scanner(System.in);
                String p1 = pil1.nextLine();
                if (p1.equalsIgnoreCase("Y")){
                    soal.mudah();
                }
                System.out.println("Apakah anda ingin kembali  ke menu utama(y/t)");
                Scanner pilq = new Scanner(System.in);
                String p2 = pil1.nextLine();
                if (p2.equalsIgnoreCase("Y")){
                    menu();
                    pilih();
                }
                System.out.println("Apakah anda ingin kembali  ke menu utama(y/t)");
                Scanner pilq2 = new Scanner(System.in);
                String p2a = pil1.nextLine();
                if (p2a.equalsIgnoreCase("Y")){
                    menu();
                    pilih();
                }
                break;
            case 2:
                System.out.print("Apakah anda yakin ingin mencoba tes Tingkat Menengah(y/t)? ");
                Scanner pil2U = new Scanner(System.in);
                String p2U = pil2U.nextLine();
                if (p2U.equalsIgnoreCase("T")){
                    menu();
                    pilih();
                }
                System.out.println("Tingkat Kesulitan Menengah");
                Medium soal1 = new Medium();
                soal1.medium();
                System.out.println("=====================================");
                System.out.print("Apakah anda ingin mencoba kembali tes Menengah ini(y/t)? ");
                Scanner pil2 = new Scanner(System.in);
                String pm1 = pil2.nextLine();
                if (pm1.equalsIgnoreCase("Y")){
                    soal1.medium();
                }
                System.out.println("Apakah anda ingin kembali  ke menu utama(y/t)");
                Scanner pilw = new Scanner(System.in);
                String pme2 = pil2.nextLine();
                if (pme2.equalsIgnoreCase("Y")){
                    menu();
                    pilih();
                }
                System.out.println("Apakah anda ingin kembali  ke menu utama(y/t)");
                Scanner pilwe = new Scanner(System.in);
                String pme2b = pil2.nextLine();
                if (pme2b.equalsIgnoreCase("Y")){
                    menu();
                    pilih();
                }
                break;
            case 3:
                System.out.print("Apakah anda yakin ingin mencoba tes Tingkat Sulit(y/t)? ");
                Scanner pil3U = new Scanner(System.in);
                String p3U = pil3U.nextLine();
                if (p3U.equalsIgnoreCase("T")){
                    menu();
                    pilih();
                }
                System.out.println("Tingkat Kesulitan Sulit");
                Sulit soal2 = new Sulit();
                soal2.sulit();
                System.out.println("=====================================");
                System.out.print("Apakah anda ingin mencoba kembali tes Menengah ini(y/t)? ");
                Scanner pil3 = new Scanner(System.in);
                String ps1 = pil3.nextLine();
                if (ps1.equalsIgnoreCase("Y")){
                    soal2.sulit();
                }
                System.out.println("Apakah anda ingin kembali  ke menu utama(y/t)");
                Scanner pilr = new Scanner(System.in);
                String psu3 = pil3.nextLine();
                if (psu3.equalsIgnoreCase("Y")){
                    menu();
                    pilih();
                }
                System.out.println("Apakah anda ingin kembali  ke menu utama(y/t)");
                Scanner pilrr = new Scanner(System.in);
                String psu3c = pil3.nextLine();
                if (psu3c.equalsIgnoreCase("Y")){
                    menu();
                    pilih();
                }
                break;
            default:
                  System.out.println(MERAH+"pilihan yang anda pilih tidak ada");
                System.out.print(MERAH+"Masukan pilihan Yng Tersedia : ");
                plh = in.nextInt();
                pilih();  
                break;
        }
    }
}
