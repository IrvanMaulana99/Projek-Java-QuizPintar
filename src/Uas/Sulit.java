
package Uas;

import java.util.Scanner;
/**
 *
 * @author Seishuu
 */

public class Sulit {
    public static final String MERAH = "\u001b[31m";
    public static final String BIRU = "\u001b[34m";
    
    void sulit(){
    String hasil, JwBn = "Jawaban Anda Benar", JwSl = "Jawaban Anda Salah";
        int Benar = 1, Salah = 1, totbenar, totsalah, bnr1 = 0, bnr2 = 0, bnr3 = 0, bnr4 = 0, bnr5 = 0, bnr6 = 0, bnr7 = 0, bnr8 = 0, bnr9 = 0, bnr10 = 0, bnr11 = 0, bnr12 = 0, bnr13 = 0, bnr14 = 0, bnr15 = 0, bnr16 = 0, bnr17 = 0, bnr18 = 0, bnr19 = 0, bnr20 = 0, bnr21 = 0, bnr22 = 0, bnr23 = 0, bnr24 = 0, bnr25 = 0, bnr26 = 0, bnr27 = 0, bnr28 = 0, bnr29 = 0, bnr30 = 0,bnr31 = 0, bnr32 = 0, bnr33 = 0, bnr34 = 0, bnr35 = 0, bnr36 = 0, bnr37 = 0, bnr38 = 0, bnr39 = 0, bnr40 = 0;;
        int Slh1 =0, Slh2 = 0, Slh3 = 0, Slh4 = 0, Slh5 = 0, Slh6 = 0, Slh7 = 0, Slh8 = 0, Slh9 = 0, Slh10 = 0, Slh11 = 0, Slh12 = 0, Slh13 = 0, Slh14 = 0, Slh15 = 0, Slh16 = 0, Slh17 = 0, Slh18 = 0, Slh19 = 0, Slh20 = 0, Slh21 = 0, Slh22 = 0, Slh23 = 0, Slh24 = 0, Slh25 = 0, Slh26 = 0, Slh27 = 0, Slh28 = 0, Slh29 = 0, Slh30 = 0,Slh31 = 0,Slh32 = 0,Slh33 = 0,Slh34 = 0, Slh35 = 0, Slh36 = 0, Slh37 = 0, Slh38 = 0, Slh39 = 0,Slh40 = 0;
        String[] b = new String[6];
        System.out.println(BIRU+"===========================");
        System.out.println(MERAH+"| Tingkat Kesulitan Sulit |");
        System.out.println(MERAH+"|  Jumlah Soal = 40 Soal  |");
        System.out.println(BIRU+"===========================");
        System.out.println("--- Selamat Mengerjakan ---");
        b[0] = "Siapa Presiden Amerika Serikat yang pertama?";
        b[1] = "John Adams";
        b[2] = "Benjamin Franklin";
        b[3] = "Thomas Jefferson";
        b[4] = "George Washington";
        b[5] = "Abraham Lincoln";
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
                case "d":
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
                System.out.println("kunci jawaban = d");
                totbenar = bnr1;
                 System.out.println("Jawaban Benar: " + bnr1);
                 totsalah = Slh1;
                System.out.println("Jawaban Salah: " + Slh1); 
                break;
            case "c":
                System.out.println(JwSl);
                Slh1 = Salah;
                System.out.println("kunci jawaban = d");
                totbenar = bnr1;
                 System.out.println("Jawaban Benar: " + bnr1);
                 totsalah = Slh1;
                System.out.println("Jawaban Salah: " + Slh1); 
                break;
            case "a":
                System.out.println(JwSl);
                Slh1 = Salah;
                System.out.println("kunci jawaban = d");
                totbenar = bnr1;
                 System.out.println("Jawaban Benar: " + bnr1);
                 totsalah = Slh1;
                System.out.println("Jawaban Salah: " + Slh1); 
                break;
            case "e":
                System.out.println(JwSl);
                Slh1 = Salah;
                System.out.println("kunci jawaban = d");
                totbenar = bnr1;
                 System.out.println("Jawaban Benar: " + bnr1);
                 totsalah = Slh1;
                System.out.println("Jawaban Salah: " + Slh1);              
                break;
        }
        System.out.println("");
        b[0] = "Jenis otot apa yang selalu aktif dan bekerja secara otomatis di luar kesadaran manusia?";
        b[1] = "Otot Bisep";
        b[2] = "Otot Polos";
        b[3] = "Otot Lurik";
        b[4] = "Otot Trisep";
        b[5] = "Otot Perut";
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
        b[0] = "Danau terdalam di dunia adalah?";
        b[1] = "Danau Baikal";
        b[2] = "Danau Tanganyika";
        b[3] = "Danau Kaspia";
        b[4] = "Danau Nyasa";
        b[5] = "Danau Malawi";
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
            case "a":
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
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh3 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh3 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh3 = Salah;
                System.out.println("kunci jawaban = a");
                totbenar = bnr1 + bnr2 + bnr3;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Mata uang negara Jepang adalah?";
        b[1] = "Peso";
        b[2] = "Yen";
        b[3] = "Yuan";
        b[4] = "Dollar";
        b[5] = "Baht";
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
            case "b":
                System.out.println(JwBn);
                bnr4 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh4 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh4 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh4 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh4 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Anjing Pittbull berasal dari negara?";
        b[1] = "Jerman";
        b[2] = "Amerika Serikat";
        b[3] = "Belanda";
        b[4] = "Inggris";
        b[5] = "Jepang";
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
            case "d":
                System.out.println(JwBn);
                bnr5 = Benar;
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh5 = Salah;
                System.out.println("kunci jawaban = d");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh5 = Salah;
                System.out.println("kunci jawaban = d");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5;
                System.out.println("Jawaban yang salah : " + totsalah );         
                break;
            case "c":
                System.out.println(JwSl);
                Slh5 = Salah;
                System.out.println("kunci jawaban = d");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh5 = Salah;
                System.out.println("kunci jawaban = d");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
    }
        System.out.println("");
        b[0] = "Kota paling boros listrik di dunia adalah kota?";
        b[1] = "New York";
        b[2] = "Paris";
        b[3] = "Moskow";
        b[4] = "Tokyo";
        b[5] = "Madrid";
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
            case "d":
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
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + + Slh5 + Slh6;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh6 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + + Slh5 + Slh6;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh6 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + + Slh5 + Slh6;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh6 = Salah;
                System.out.println("kunci jawaban = d");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + + Slh5 + Slh6;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Skala Mohs dari Berlian adalah?";
        b[1] = "7";
        b[2] = "8";
        b[3] = "9";
        b[4] = "10";
        b[5] = "6";
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
            case "d":
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
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh7 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh7 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh7 = Salah;
                System.out.println("kunci jawaban = d");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Jumlah lubang pintu sebenarnya dari lawang sewu adalah?";
        b[1] = "400";
        b[2] = "600";
        b[3] = "724";
        b[4] = "972";
        b[5] = "429";
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
            case "e":
                System.out.println(JwBn);
                bnr8 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh8 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh8 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh8 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh8 = Salah;
                System.out.println("kunci jawaban = e");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Penghargaan (Award) untuk insan dan industri musik di amerika adalah?";
        b[1] = "Oscar Award";
        b[2] = "Emmy Award";
        b[3] = "Grammy Award";
        b[4] = "Nobel Award";
        b[5] = "Purtlizer";
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
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh9 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh9 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh9 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh9 = Salah;
                System.out.println("kunci jawaban = c");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Istilah Homerun adalah berasal dari olahraga?";
        b[1] = "Basket";
        b[2] = "Voli";
        b[3] = "Rugby";
        b[4] = "Baseball";
        b[5] = "Bulu Tangkis";
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
            case "d":
                System.out.println(JwBn);
                bnr10 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh10 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh10 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh10 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh10 = Salah;
                System.out.println("kunci jawaban = d");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Jumlah Provinsi di Indonesia Sekarang adalah?";
        b[1] = "32";
        b[2] = "33";
        b[3] = "34";
        b[4] = "35";
        b[5] = "36";
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
            case "d":
                System.out.println(JwBn);
                bnr11 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh11 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh11 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh11 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh11 = Salah;
                System.out.println("kunci jawaban = d");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Pusat peringatan tsunami internasional didirikan di ?";
        b[1] = "Amerika Serikat";
        b[2] = "Hawaii";
        b[3] = "Jerman";
        b[4] = "Jepang";
        b[5] = "Indonesia";
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
            case "b":
                System.out.println(JwBn);
                bnr12 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh12 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh12 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh12 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh12 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Ancaman Militer yang berusaha memata matai negara lain adalah?";
        b[1] = "Agresi";
        b[2] = "Sabotase";
        b[3] = "Teror";
        b[4] = "Perang saudara";
        b[5] = "Spionase";
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
            case "e":
                System.out.println(JwBn);
                bnr13 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh13 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh13 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh13 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh13 = Salah;
                System.out.println("kunci jawaban = e");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Benua Kuning adalah sebuatan bagi benua ?";
        b[1] = "Asia";
        b[2] = "Eropa";
        b[3] = "Afrika";
        b[4] = "Amerika";
        b[5] = "Australia";
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
            case "a":
                System.out.println(JwBn);
                bnr14 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh14 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh14 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh14 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh14 = Salah;
                System.out.println("kunci jawaban = a");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Suku Bugis berasal dari?";
        b[1] = "Sulawesi Utara";
        b[2] = "Sulawesi Selatan";
        b[3] = "Nusa tenggara timur";
        b[4] = "Maluku";
        b[5] = "Sumatra Utara";
        System.out.println("15. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a15 = new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "b":
                System.out.println(JwBn);
                bnr15 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh15 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh15 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh15 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh15 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Tanggal 14 Agustus diperingati sebagai hari ?";
        b[1] = "Sumpah Pemuda";
        b[2] = "Kesaktian Pancasila";
        b[3] = "Pramuka";
        b[4] = "Palang Merah Indonesia";
        b[5] = "Hari Guru";
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
            case "c":
                System.out.println(JwBn);
                bnr16 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh16 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh16 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh16 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh16 = Salah;
                System.out.println("kunci jawaban = c");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Benua Biru sebutan bagi benua?";
        b[1] = "Asia";
        b[2] = "Eropa";
        b[3] = "Afrika";
        b[4] = "Amerika";
        b[5] = "Australia";
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
            case "b":
                System.out.println(JwBn);
                bnr17 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh17 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh17 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh17 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh17 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Kitab Ramayana dikarang oleh mpu ?";
        b[1] = "Walmiki";
        b[2] = "Hamura";
        b[3] = "Darmaja";
        b[4] = "Sedah";
        b[5] = "Prapanca";
        System.out.println("18. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a18 = new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "a":
                System.out.println(JwBn);
                bnr18 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh18 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh18 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh18 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh18 = Salah;
                System.out.println("kunci jawaban = a");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Perubahan benda padat menjadi gas disebut?";
        b[1] = "Menyublim";
        b[2] = "Menguap";
        b[3] = "Mengkristal";
        b[4] = "Mencair";
        b[5] = "Mengembun";
        System.out.println("19. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a19 = new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "a":
                System.out.println(JwBn);
                bnr19 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh19 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh19 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh19 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh19 = Salah;
                System.out.println("kunci jawaban = a");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Alat pernapasan tumbuhan yang berada di batang adalah?";
        b[1] = "Stomata";
        b[2] = "Klorofil";
        b[3] = "Kambium";
        b[4] = "Lentisel";
        b[5] = "Floem";
        System.out.println("20. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a20 = new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "d":
                System.out.println(JwBn);
                bnr20 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh20 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh20 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh20 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh20 = Salah;
                System.out.println("kunci jawaban = d");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Angka 123321 merupakan contoh bilangan?";
        b[1] = "Avogadro";
        b[2] = "Kuadrat";
        b[3] = "Prima";
        b[4] = "Palindrom";
        b[5] = "Imajiner";
        System.out.println("21. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a21 = new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "d":
                System.out.println(JwBn);
                bnr21 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh21 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh21 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+bnr21;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh21 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh21 = Salah;
                System.out.println("kunci jawaban = d");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Cabang ilmu biologi yang mempelajari tentang jamur dan strukturnya yaitu?";
        b[1] = "Evolusi";
        b[2] = "Botani";
        b[3] = "Vitologi";
        b[4] = "Ornitologi";
        b[5] = "Mikologi";
        System.out.println("22. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a22 = new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "e":
                System.out.println(JwBn);
                bnr22 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh22 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh22 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh22 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh22 = Salah;
                System.out.println("kunci jawaban = e");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Rumah adat tongkonan berasal dari ?";
        b[1] = "Papua ";
        b[2] = "Sulawesi Utara";
        b[3] = "Kalimantan Timur";
        b[4] = "Sulawesi Selatan";
        b[5] = "Kalimantan Barat";
        System.out.println("23. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a23 = new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "d":
                System.out.println(JwBn);
                bnr23 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh23 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh23 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh23 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh23 = Salah;
                System.out.println("kunci jawaban = d");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Daging domba dalam bahasa jepang disebut?";
        b[1] = "Baniku";
        b[2] = "Butaniku";
        b[3] = "Usagi Niku";
        b[4] = "Gyuniku";
        b[5] = "Ramu niku";
        System.out.println("24. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a24 = new Scanner(System.in);
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
            case "b":
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
            case "a":
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
        b[0] = "Motto Kesehatan adalah?";
        b[1] = "Pengayoman";
        b[2] = "Nabara Dana Raksa";
        b[3] = "Bhakti Husada";
        b[4] = "Tut Wuri Handayani";
        b[5] = "Ikhlas Beramal";
        System.out.println("25. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a25 = new Scanner(System.in);
        System.out.print("Jawab (a/b/c/d/e): ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "c":
                System.out.println(JwBn);
                bnr25 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh25 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh25 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh25 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh25 = Salah;
                System.out.println("kunci jawaban = c");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Bunga Tulip berasal dari negara?";
        b[1] = "Turki";
        b[2] = "Meksiko";
        b[3] = "Jepang";
        b[4] = "Eropa";
        b[5] = "China";
        System.out.println("26. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a26 = new Scanner(System.in);
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
            case "b":
                System.out.println(JwSl);
                Slh26 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh26 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh26 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh26 = Salah;
                System.out.println("kunci jawaban = a");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Patung Liberty dibuat di negara ?";
        b[1] = "Amerika";
        b[2] = "Francis";
        b[3] = "Inggris";
        b[4] = "Jerman";
        b[5] = "Belanda";
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
            case "e":
                System.out.println(JwSl);
                Slh27 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh27 = Salah;
                System.out.println("kunci jawaban = ");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh27 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh27 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Badan Kesehatan dunia adalah?";
        b[1] = "ILO";
        b[2] = "FAO";
        b[3] = "IMF";
        b[4] = "WHO";
        b[5] = "NATO";
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
            case "e":
                System.out.println(JwSl);
                Slh28 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh28 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh28 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh28 = Salah;
                System.out.println("kunci jawaban = d");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Mukjizat Nabi Ibrahim adalah?";
        b[1] = "Membelah lautan";
        b[2] = "Membelah Bulan";
        b[3] = "Dibakar Tidak Mempan";
        b[4] = "Berbicara Dengan Binatang";
        b[5] = "Al-Qur'an";
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
            case "c":
                System.out.println(JwBn);
                bnr29 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh29 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh29 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh29 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh29 = Salah;
                System.out.println("kunci jawaban = c");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
                System.out.println("");
        b[0] = "Taman Nasional Bunaken terletak di?";
        b[1] = "Sulawesi Utara";
        b[2] = "Kalimantan Selatan";
        b[3] = "Maluku";
        b[4] = "Sumatera Barat";
        b[5] = "Sulawesi Tenggara";
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
            case "a":
                System.out.println(JwBn);
                bnr30 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh30 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh30 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh30 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh30 = Salah;
                System.out.println("kunci jawaban = a");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Organisasi PBB yang bergerak dalam bidang kemanusiaan adalah?";
        b[1] = "WHO";
        b[2] = "ILO";
        b[3] = "UNHCR";
        b[4] = "UNESCO";
        b[5] = "ASEAN";
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
        b[0] = "Pemerintah darurat RI pernah memindahkan ibukota indonesia ke kota?";
        b[1] = "Bukit Tinggi";
        b[2] = "Bandung";
        b[3] = "Surabaya";
        b[4] = "Semarang";
        b[5] = "Yogyakarta";
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
            case "e":
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
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh32 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh32 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh32 = Salah;
                System.out.println("kunci jawaban = e");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Nama Penghargaan di bidang perdamainan adalah?";
        b[1] = "Oscar";
        b[2] = "Norbert Winner";
        b[3] = "Nobel";
        b[4] = "Emmy";
        b[5] = "Purtlizer";
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
            case "c":
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
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh33 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh33 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh33 = Salah;
                System.out.println("kunci jawaban = c");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Nama maskot piala dunia di afrika selatan tahunj 2010 adalah?";
        b[1] = "Strikes";
        b[2] = "Zakumi";
        b[3] = "Ciao";
        b[4] = "Willy";
        b[5] = "Footix";
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
            case "b":
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
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh34 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh34 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh34 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Karena nilai pancasila tetap tidak mengalami perubahan maka pancasila tergolong pada ideologi yang?";
        b[1] = "Kaku";
        b[2] = "Progresif";
        b[3] = "Terbuka";
        b[4] = "Kontemporer";
        b[5] = "Inovatif";
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
            case "a":
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
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh35 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh35 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh35 = Salah;
                System.out.println("kunci jawaban = a");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Sumber tertib hukum pembentukan negara kesatuan republik indonesia adalah?";
        b[1] = "Pancasila";
        b[2] = "Proklamasi 17 Agustus 1945";
        b[3] = "Batang tubuh UUD 1945";
        b[4] = "Pembukaan UUD 1945";
        b[5] = "Tap MPR";
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
            case "b":
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
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh36 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh36 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh36 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Unsur domisili merupakan syarat utama bagi setiap orang yang disebut sebagai ?";
        b[1] = "Orang Asing";
        b[2] = "Warga Negara";
        b[3] = "Negara";
        b[4] = "Wisatawan Asing";
        b[5] = "Penduduk Negara";
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
            case "e":
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
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh37 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh37 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh37 = Salah;
                System.out.println("kunci jawaban = e");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Bahan bakar untuk pesawat adalah ?";
        b[1] = "Diesel";
        b[2] = "Batu Bara";
        b[3] = "Avtur";
        b[4] = "Premium";
        b[5] = "Solar";
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
            case "c":
                System.out.println(JwBn);
                bnr38 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37+bnr38;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37+Slh38;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh38 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37+bnr38;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37+Slh38;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh38 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37+bnr38;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37+Slh38;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh38 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37+bnr38;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37+Slh38;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh38 = Salah;
                System.out.println("kunci jawaban = c");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37+bnr38;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37+Slh38;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Pusat Keuangan di Amerika terdapat di ?";
        b[1] = "Washington DC";
        b[2] = "Los Angeles";
        b[3] = "Chicago";
        b[4] = "New York";
        b[5] = "Las Vegas";
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
            case "d":
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
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37+bnr38+bnr39;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37+Slh38+Slh39;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh39 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37+bnr38+bnr39;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37+Slh38+Slh39;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh39 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37+bnr38+bnr39;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37+Slh38+Slh39;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh39 = Salah;
                System.out.println("kunci jawaban = d");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37+bnr38+bnr39;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37+Slh38+Slh39;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
         System.out.println("");
        b[0] = "Negara Terkaya di dunia Adalah?";
        b[1] = "Saudi Arabia";
        b[2] = "Turki";
        b[3] = "Iran";
        b[4] = "Qatar";
        b[5] = "Iraq";
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
            case "d":
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
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37+bnr38+bnr39+bnr40;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37+Slh38+Slh39+Slh40;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh40 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37+bnr38+bnr39+bnr40;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37+Slh38+Slh39+Slh40;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh40 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30+bnr31+bnr32+bnr33+bnr34+bnr35+bnr36+bnr37+bnr38+bnr39+bnr40;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30+Slh31+Slh32+Slh33+Slh34+Slh35+Slh36+Slh37+Slh38+Slh39+Slh40;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh40 = Salah;
                System.out.println("kunci jawaban = d");
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