
package Uas;
import java.util.Scanner;
/**
 *
 * @author Seishuu
 */
public class Mudah {
    public static final String BIRU = "\u001b[34m";
    public static final String MERAH = "\u001b[31m";


    void mudah(){
    String hasil, JwBn = "Jawaban Anda Benar", JwSl = "Jawaban Anda Salah";
        int Benar = 1, Salah = 1, totbenar, totsalah, bnr1 = 0, bnr2 = 0, bnr3 = 0, bnr4 = 0, bnr5 = 0, bnr6 = 0, bnr7 = 0, bnr8 = 0, bnr9 = 0, bnr10 = 0, bnr11 = 0, bnr12 = 0, bnr13 = 0, bnr14 = 0, bnr15 = 0, bnr16 = 0, bnr17 = 0, bnr18 = 0, bnr19 = 0, bnr20 = 0, bnr21 = 0, bnr22 = 0, bnr23 = 0, bnr24 = 0, bnr25 = 0, bnr26 = 0, bnr27 = 0, bnr28 = 0, bnr29 = 0, bnr30 = 0,bnr31 = 0, bnr32 = 0, bnr33 = 0, bnr34 = 0, bnr35 = 0, bnr36 = 0, bnr37 = 0, bnr38 = 0, bnr39 = 0, bnr40 = 0;; 
        int Slh1 =0, Slh2 = 0, Slh3 = 0, Slh4 = 0, Slh5 = 0, Slh6 = 0, Slh7 = 0, Slh8 = 0, Slh9 = 0, Slh10 = 0, Slh11 = 0, Slh12 = 0, Slh13 = 0, Slh14 = 0, Slh15 = 0, Slh16 = 0, Slh17 = 0, Slh18 = 0, Slh19 = 0, Slh20 = 0, Slh21 = 0, Slh22 = 0, Slh23 = 0, Slh24 = 0, Slh25 = 0, Slh26 = 0, Slh27 = 0, Slh28 = 0, Slh29 = 0, Slh30 = 0,Slh31 = 0,Slh32 = 0,Slh33 = 0,Slh34 = 0, Slh35 = 0, Slh36 = 0, Slh37 = 0, Slh38 = 0, Slh39 = 0,Slh40 = 0; ; 
        String[] b = new String[6];
        System.out.println(BIRU+"===========================");
        System.out.println(MERAH+"| Tingkat Kesulitan Mudah |");
        System.out.println(MERAH+"| Jumlah Soal = 40 Soal   |");
        System.out.println(BIRU+"===========================");
        System.out.println("--- Selamat Mengerjakan ---");
        b[0] = "Di Planet Manakah Kita Tinggal?";
        b[1] = "Bumi";
        b[2] = "Merkuri";
        b[3] = "Venus";
        b[4] = "Mars";
        b[5] = "Saturnus";
        System.out.println("1. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a1 = new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
            switch (hasil) {
                case "a":
                System.out.println(JwBn);
                bnr1 = Benar;
                totbenar = bnr1;
                 System.out.println("Jawaban Benar: " + bnr1);
                 totsalah = Slh1;
                System.out.println("Jawaban Salah: " + Slh1); 
                break;
            case "b":
                System.out.println(JwSl);
                Slh1 = Salah;
                System.out.println("kunci jawaban = a");
                totbenar = bnr1;
                 System.out.println("Jawaban Benar: " + bnr1);
                 totsalah = Slh1;
                System.out.println("Jawaban Salah: " + Slh1); 
                break;
            case "c":
                System.out.println(JwSl);
                Slh1 = Salah;
                System.out.println("kunci jawaban = a");
                totbenar = bnr1;
                 System.out.println("Jawaban Benar: " + bnr1);
                 totsalah = Slh1;
                System.out.println("Jawaban Salah: " + Slh1); 
                break;
            case "d":
                System.out.println(JwSl);
                Slh1 = Salah;
                System.out.println("kunci jawaban = a");
                totbenar = bnr1;
                 System.out.println("Jawaban Benar: " + bnr1);
                 totsalah = Slh1;
                System.out.println("Jawaban Salah: " + Slh1); 
                break;
            case "e":
                System.out.println(JwSl);
                Slh1 = Salah;
                System.out.println("kunci jawaban = a");
                totbenar = bnr1;
                 System.out.println("Jawaban Benar: " + bnr1);
                 totsalah = Slh1;
                System.out.println("Jawaban Salah: " + Slh1);              
                break;
        }
        System.out.println("");
        b[0] = "Samudera Manakah Yang Terbesar Di Dunia?";
        b[1] = "Samudera Atlantik";
        b[2] = "Samudera Pasifik";
        b[3] = "Samudera Hindia";
        b[4] = "Samudera Arktik";
        b[5] = "Samudera Antartika";
        System.out.println("2. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a2 = new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e) : ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "b":
                System.out.println(JwBn);
                bnr2 = Benar;
                 totbenar = bnr1 + bnr2;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh2 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh2 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh2 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh2 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bnr1 + bnr2;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Angka Romawi Berapakah Ini IX ?";
        b[1] = "7";
        b[2] = "100";
        b[3] = "9";
        b[4] = "11";
        b[5] = "10";
        System.out.println("3. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a3 = new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "c":
                System.out.println(JwBn);
                bnr3 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh3 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh3 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh3 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh3 = Salah;
                System.out.println("kunci jawaban = c");
                totbenar = bnr1 + bnr2 + bnr3;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Bilangan prima apa yang terkecil ?...";
        b[1] = "0";
        b[2] = "1";
        b[3] = "-1";
        b[4] = "2";
        b[5] = "Tidak Tahu";
        System.out.println("4. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a4 = new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "d":
                System.out.println(JwBn);
                bnr4 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh4 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh4 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh4 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh4 = Salah;
                System.out.println("kunci jawaban = d");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Apakah 'Hari' Itu ?...";
        b[1] = "Periode rotasi bumi relatif terhadap matahari";
        b[2] = "Satu periode orbital";
        b[3] = "Setengah dari periode rotasi bumi relatif terhadap matahari";
        b[4] = "Setengah periode orbital";
        b[5] = "Tidak Tahu";
        System.out.println("5. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a5 = new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "b":
                System.out.println(JwBn);
                bnr5 = Benar;
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh5 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh5 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5;
                System.out.println("Jawaban yang salah : " + totsalah );         
                break;
            case "d":
                System.out.println(JwSl);
                Slh5 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh5 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
    }
        System.out.println("");
        b[0] = "Berapa Suhu Tubuh Manusia Normal ?...";
        b[1] = "37 C";
        b[2] = "31 C";
        b[3] = "42,6 C";
        b[4] = "17 C";
        b[5] = "Tidak Tahu";
        System.out.println("6. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a6 = new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "a":
                System.out.println(JwBn);
                bnr6 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh6 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + + Slh5 + Slh6;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh6 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + + Slh5 + Slh6;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh6 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + + Slh5 + Slh6;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh6 = Salah;
                System.out.println("kunci jawaban = a");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + + Slh5 + Slh6;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Apa Rumus Kimia Untuk Air ?...";
        b[1] = "HO2";
        b[2] = "H2O2";
        b[3] = "H2O";
        b[4] = "H3O2";
        b[5] = "Tidak Tahu";
        System.out.println("7. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a7 = new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "c":
                System.out.println(JwBn);
                bnr7 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh7 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh7 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh7 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh8 = Salah;
                System.out.println("kunci jawaban = c");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Siapa Penemu Arus Bolak-Balik (DC) ?...";
        b[1] = "Thomas Alva Edison";
        b[2] = "Elon Musk";
        b[3] = "Nikola Tesla";
        b[4] = "Isaac Newton";
        b[5] = "Tidak Tahu";
        System.out.println("8. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a8 = new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "c":
                System.out.println(JwBn);
                bnr8 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh8 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh8 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh8 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh8 = Salah;
                System.out.println("kunci jawaban = c");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Anda berkendara dengan kecepatan 90 km/jam di jalan ,Berapa lama Waktu Yang Dibutuhkan Untuk berkendara sejauh 45 km ?...";
        b[1] = "1 Jam";
        b[2] = "2 Jam";
        b[3] = "30 Menit";
        b[4] = "45 Menit";
        b[5] = "2 Jam 30 Menit";
        System.out.println("9. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a9 = new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "c":
                System.out.println(JwBn);
                bnr9 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh9 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh9 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh9 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh9 = Salah;
                System.out.println("kunci jawaban = c");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Apakah Ibukota Australia ?...";
        b[1] = "Sydney";
        b[2] = "Canberra";
        b[3] = "Melbourne";
        b[4] = "Adelaide";
        b[5] = "Perth";
        System.out.println("10. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a10 = new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "b":
                System.out.println(JwBn);
                bnr10 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh10 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh10 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh10 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh10 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Luas Segitiga yang diberikan 20cm dan dasarnya 5cm , Berapa Tingginya ?...";
        b[1] = "8 cm";
        b[2] = "6 cm";
        b[3] = "4 cm";
        b[4] = "2 cm";
        b[5] = "10 cm";
        System.out.println("11. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a11 = new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "a":
                System.out.println(JwBn);
                bnr11 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh11 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh11 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh11 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh11 = Salah;
                System.out.println("kunci jawaban = a");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Bahasa mana yang diucapkan oleh mayoritas orang di Amerika Serikat ?...";
        b[1] = "Inggris";
        b[2] = "Perancis";
        b[3] = "Spanyol";
        b[4] = "Belanda";
        b[5] = "Tidak Tahu";
        System.out.println("12. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a12 = new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "a":
                System.out.println(JwBn);
                bnr12 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh12 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh12 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh12 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh12 = Salah;
                System.out.println("kunci jawaban = a");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Siapakah Penemu Benua Amerika ?...";
        b[1] = "Vasco Da Gama";
        b[2] = "Bartholomeus Diaz";
        b[3] = "James Cook";
        b[4] = "Christopher Columbus";
        b[5] = "Kristofer Olimpic";
        System.out.println("13. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a13 = new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "d":
                System.out.println(JwBn);
                bnr13 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh13 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh13 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh13 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh13 = Salah;
                System.out.println("kunci jawaban = d");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Pegunungan Tertinggi Di Dunia Adalah ?...";
        b[1] = "Pegunungan Alpen";
        b[2] = "Pegunungan Andes";
        b[3] = "Pegunungan Dhaulagiri";
        b[4] = "Pegunungan Karakoram";
        b[5] = "Pegunungan Himalaya";
        System.out.println("14. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a14 = new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "e":
                System.out.println(JwBn);
                bnr14 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh14 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh14 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh14 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh14 = Salah;
                System.out.println("kunci jawaban = e");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Berasal dari bahasa apa nama maluku ?...";
        b[1] = "Bahasa Arab";
        b[2] = "Bahasa Yunani";
        b[3] = "Bahasa Sansekerta";
        b[4] = "Bahasa inggris";
        b[5] = "Bahasa Madura";
        System.out.println("15. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a15= new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "a":
                System.out.println(JwBn);
                bnr15 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh15 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh15 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh15 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh15 = Salah;
                System.out.println("kunci jawaban = a");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
    System.out.println("");
        b[0] = "Dinasti apakah yang membangun Candi Prambanan??...";
        b[1] = "Dinasti Sanjaya";
        b[2] = "Dinasti Syailendra";
        b[3] = "Dinasti Candra";
        b[4] = "Dinasti Ikswaku";
        b[5] = "Dinasti Surya";
        System.out.println("16. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a16 = new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "a":
                System.out.println(JwBn);
                bnr16 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh16 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh16 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh16 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh16 = Salah;
                System.out.println("kunci jawaban = c");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Berapa tahun masa jabatan dari seorang bupati ?...";
        b[1] = "1 tahun";
        b[2] = "2 tahun";
        b[3] = "3 tahun";
        b[4] = "4 tahun";
        b[5] = "5 tahun";
        System.out.println("17. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a17 = new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "e":
                System.out.println(JwBn);
                bnr17 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh17 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh17 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh17 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh17 = Salah;
                System.out.println("kunci jawaban = c");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Apa nama pakaian tradisional Korea ?...";
        b[1] = "Saree";
        b[2] = "bunad";
        b[3] = "Dirndl";
        b[4] = "Kimono";
        b[5] = "Hanbok";
        System.out.println("18. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a18= new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "e":
                System.out.println(JwBn);
                bnr18 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh18 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh18 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh18 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh18 = Salah;
                System.out.println("kunci jawaban = e");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Disebut apakah teknik permainan bola basket sehingga menghasilkan skor 3 angka?...";
        b[1] = "Lay up";
        b[2] = "Three Point";
        b[3] = "Alley oop";
        b[4] = "Slam dunk";
        b[5] = "Dribbling";
        System.out.println("19. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a19= new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "b":
                System.out.println(JwBn);
                bnr19 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh19 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh19 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh19 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 ;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh19 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 ;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Dimana Letak Gunung Rinjani?...";
        b[1] = "Nusa Tenggara Timur";
        b[2] = "Nusa Tenggara Barat";
        b[3] = "Flores";
        b[4] = "Jawa Timur";
        b[5] = "Lombok";
        System.out.println("20. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a20= new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "e":
                System.out.println(JwBn);
                bnr20 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh20 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh20 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh20 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh20 = Salah;
                System.out.println("kunci jawaban = e");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Upacara Pembakaran Mayat di Bali disebut ?...";
        b[1] = "Kerta Sima";
        b[2] = "Ngaben";
        b[3] = "Geguat";
        b[4] = "Perarem";
        b[5] = "Awig-awig";
        System.out.println("21. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a21= new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "b":
                System.out.println(JwBn);
                bnr21 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh21 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh21 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh21 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh21 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Burung apakah yang sarangnya biasa dijual sebagai obat ?...";
        b[1] = "Gagak";
        b[2] = "Burung Hantu";
        b[3] = "Burung Walet";
        b[4] = "Burung Merpati";
        b[5] = "Burung pipit";
        System.out.println("22. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a22= new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "c":
                System.out.println(JwBn);
                bnr22 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh22 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh22 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh22 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh22 = Salah;
                System.out.println("kunci jawaban = c");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Lambang Pramuka Adalah ?...";
        b[1] = "Burung Garuda";
        b[2] = "Tunas Kelapa";
        b[3] = "Pohon Beringin";
        b[4] = "Bintang";
        b[5] = "Macan";
        System.out.println("23. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a23= new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "b":
                System.out.println(JwBn);
                bnr23 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh23 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh23 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh23 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh23 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Presiden negara Indonesia yang paling lama memimpin adalah presiden ?...";
        b[1] = "Soekarno";
        b[2] = "Gusdur";
        b[3] = "Joko Widodo";
        b[4] = "Susilo Bambang Yudhoyono";
        b[5] = "Soeharto";
        System.out.println("24. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a24= new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "e":
                System.out.println(JwBn);
                bnr24 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh24 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh24 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh24 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh24 = Salah;
                System.out.println("kunci jawaban = e");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Masyarakat yang terkecil adalah ?...";
        b[1] = "RT";
        b[2] = "Keluarga";
        b[3] = "RW";
        b[4] = "Desa";
        b[5] = "Kota";
        System.out.println("25. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a25= new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "b":
                System.out.println(JwBn);
                bnr25 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh25 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh25 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh25 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh25 = Salah;
                System.out.println("kunci jawaban = e");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Pramuka Siaga Dimulai Dari kelas ?";
        b[1] = "1 - 3 SD";
        b[2] = "4 - 6 SD";
        b[3] = "1 - 3 SMP";
        b[4] = "1 - 3 SMA";
        b[5] = "Perguruan Tinggi";
        System.out.println("26. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a26= new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "a":
                System.out.println(JwBn);
                bnr26 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh26 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh26 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh26 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh26 = Salah;
                System.out.println("kunci jawaban = e");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Negara yang pernah dijatuhi bom atom oleh amerika adalah ?...";
        b[1] = "Jerman";
        b[2] = "Jepang";
        b[3] = "Korea";
        b[4] = "Australia";
        b[5] = "China";
        System.out.println("27. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a27= new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "b":
                System.out.println(JwBn);
                bnr27 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh27 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh27 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh27 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh27 = Salah;
                System.out.println("kunci jawaban = e");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Jumlah warna pelangi adalah?...";
        b[1] = "4";
        b[2] = "5";
        b[3] = "8";
        b[4] = "7";
        b[5] = "6";
        System.out.println("28. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a28= new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "d":
                System.out.println(JwBn);
                bnr28 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh28 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh28 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh28 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh28 = Salah;
                System.out.println("kunci jawaban = e");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Sumpah palapa diucapkan oleh ?";
        b[1] = "Raden Agung";
        b[2] = "Gadjah Mada";
        b[3] = "Mulawarman";
        b[4] = "Raden Saleh";
        b[5] = "Hayam Wuruk";
        System.out.println("29. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a29= new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "b":
                System.out.println(JwBn);
                bnr29 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh29 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh29 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh29 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh29 = Salah;
                System.out.println("kunci jawaban = e");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Jumlah Tangan Ayam adalah ?";
        b[1] = "2";
        b[2] = "4";
        b[3] = "6";
        b[4] = "8";
        b[5] = "Semua Salah";
        System.out.println("30. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a30= new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "e":
                System.out.println(JwBn);
                bnr30 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh30 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh30 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh30 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh30 = Salah;
                System.out.println("kunci jawaban = e");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Berapa jumlah surat dalam al-quran?";
        b[1] = "6236 Surat";
        b[2] = "144 Surat";
        b[3] = "114 Surat";
        b[4] = "141 Surat";
        b[5] = "208 Surat";
        System.out.println("31. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a31= new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "c":
                System.out.println(JwBn);
                bnr31 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh31 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh31 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh31 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh31 = Salah;
                System.out.println("kunci jawaban = c");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Kepanjangan dari SMS adalah?";
        b[1] = "Suka Makan Siomay";
        b[2] = "Service Message Short";
        b[3] = "Short Mesaage Service";
        b[4] = "Short Main Service";
        b[5] = "Sort Main Service";
        System.out.println("32. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a32= new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "c":
                System.out.println(JwBn);
                bnr32 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh32 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh32 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh32 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh32 = Salah;
                System.out.println("kunci jawaban = c");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Karate adalah olahraga yang berasal dari?";
        b[1] = "Spanyol";
        b[2] = "Jepang";
        b[3] = "Amerika";
        b[4] = "Philiphina";
        b[5] = "Korea";
        System.out.println("33. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a33= new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "b":
                System.out.println(JwBn);
                bnr33 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh33 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh33 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh33 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh33 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Bahasa Tagalog adalah?";
        b[1] = "Bahasa Kuno";
        b[2] = "Bahasa Spanyol";
        b[3] = "Bahasa Philiphina";
        b[4] = "Bahasa Laos";
        b[5] = "Bahasa Cina";
        System.out.println("34. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a34= new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "c":
                System.out.println(JwBn);
                bnr34 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh34 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh34 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh34 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh34 = Salah;
                System.out.println("kunci jawaban = c");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Istilah Knot digunakan untuk mengukur?";
        b[1] = "Arus Listrik";
        b[2] = "Senyawa Kimia";
        b[3] = "Kecepatan Kapal";
        b[4] = "Dalamnya Laut";
        b[5] = "Tingkat Suhu";
        System.out.println("35. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a35= new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "c":
                System.out.println(JwBn);
                bnr35 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh35 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh35 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh35 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh35 = Salah;
                System.out.println("kunci jawaban = c");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Visa adalah ?";
        b[1] = "Mata Uang";
        b[2] = "Buah-buahan";
        b[3] = "Bangunan ";
        b[4] = "Sayuran";
        b[5] = "Surat Izin";
        System.out.println("36. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a36= new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "e":
                System.out.println(JwBn);
                bnr36 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh36 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh36 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh36 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh36 = Salah;
                System.out.println("kunci jawaban = e");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Polka dalah semacam ?";
        b[1] = "Lomba Lari";
        b[2] = "Pakaian";
        b[3] = "Tarian";
        b[4] = "Minuman Keras";
        b[5] = "Lagu";
        System.out.println("37. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a37= new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "c":
                System.out.println(JwBn);
                bnr37 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh37 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh37 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh37 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh37 = Salah;
                System.out.println("kunci jawaban = c");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Spike dipakai untuk ?";
        b[1] = "Atletik";
        b[2] = "Alat Teknik";
        b[3] = "Alat Pertanian";
        b[4] = "Percikan Api";
        b[5] = "Alat Masak";
        System.out.println("38. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a38= new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "a":
                System.out.println(JwBn);
                bnr38 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37+bnr38;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37+Slh38;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh38 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37+bnr38;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37+Slh38;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh38 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37+bnr38;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37+Slh38;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh38 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37+bnr38;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37+Slh38;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh38 = Salah;
                System.out.println("kunci jawaban = a");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37+bnr38;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37+Slh38;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Perdata adalah istilah dalam ?";
        b[1] = "Perdagangan";
        b[2] = "Kehakiman";
        b[3] = "Pembangunan";
        b[4] = "Pertunjukkan";
        b[5] = "Perfilman";
        System.out.println("39. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a39= new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "b":
                System.out.println(JwBn);
                bnr39 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37+bnr38+bnr39;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37+Slh38+Slh39;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh39 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37+bnr38+bnr39;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37+Slh38+Slh39;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh39 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37+bnr38+bnr39;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37+Slh38+Slh39;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh39 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37+bnr38+bnr39;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37+Slh38+Slh39;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh39 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37+bnr38+bnr39;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37+Slh38+Slh39;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
         System.out.println("");
        b[0] = "Tarian Tor-tor berasal dari ?";
        b[1] = "Jawa Timur";
        b[2] = "Maluku";
        b[3] = "Sumatra";
        b[4] = "Bali";
        b[5] = "Kalimantan";
        System.out.println("40. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a40= new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "c":
                System.out.println(JwBn);
                bnr40 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37+bnr38+bnr39+bnr40;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37+Slh38+Slh39+Slh40;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh40 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37+bnr38+bnr39+bnr40;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37+Slh38+Slh39+Slh40;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh40 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37+bnr38+bnr39+bnr40;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37+Slh38+Slh39+Slh40;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh40 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37+bnr38+bnr39+bnr40;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37+Slh38+Slh39+Slh40;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh40 = Salah;
                System.out.println("kunci jawaban = c");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37+bnr38+bnr39+bnr40;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37+Slh38+Slh39+Slh40;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("\n");
        System.out.println("Hasil Akhir");
        totbenar = bnr1+bnr2+bnr3+bnr4+bnr5+bnr6+bnr7+bnr8+bnr9+bnr10+bnr11+bnr12+bnr13+bnr14+bnr15+bnr16+bnr17+bnr18+bnr19+bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37+bnr38+bnr39+bnr40;
        System.out.println("Jawaban yang benar adalah : " + totbenar);
        totsalah = Slh1+Slh2+Slh3+Slh4+Slh5+Slh6+Slh7+Slh8+Slh9+Slh10+Slh11+Slh12+Slh13+Slh14+Slh15+Slh16+Slh17+Slh18+Slh19+Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37+Slh38+Slh39+Slh40;
        System.out.println("Jawaban yang salah adalah : " + totsalah);
        System.out.println("Total nilai adalah : " + (totbenar *2.5));
        String nG;
        
         if (totbenar *2.5 >= 100){
           nG = "A";
       } else if (totbenar * 2.5>= 80){
           nG = "B";
       } else if (totbenar * 2.5>= 60){
           nG = "C";
       } else if (totbenar * 2.5>= 40){
           nG = "D";
       } else if (totbenar * 2.5>= 20){
           nG = "E";
       } else {
           nG = "input salah";
       } 
       if (nG == "input salah"){
           System.out.println(nG);
       } else {
           System.out.println("Nilai huruf :" + nG);
    }
    }
}