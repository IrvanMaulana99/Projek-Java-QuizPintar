
package Uas;

import java.util.Scanner;

public class Medium {
    public static final String BIRU = "\u001b[34m";
    public static final String MERAH = "\u001b[31m";


    void medium(){
    String hasil, JwBn = "Jawaban Anda Benar", JwSl = "Jawaban Anda Salah";
        int Benar = 1, Salah = 1, totbenar, totsalah, bnr1 = 0, bnr2 = 0, bnr3 = 0, bnr4 = 0, bnr5 = 0, bnr6 = 0, bnr7 = 0, bnr8 = 0, bnr9 = 0, bnr10 = 0, bnr11 = 0, bnr12 = 0, bnr13 = 0, bnr14 = 0, bnr15 = 0, bnr16 = 0, bnr17 = 0, bnr18 = 0, bnr19 = 0, bnr20 = 0, bnr21 = 0, bnr22 = 0, bnr23 = 0, bnr24 = 0, bnr25 = 0, bnr26 = 0, bnr27 = 0, bnr28 = 0, bnr29 = 0, bnr30 = 0, bnr31 = 0, bnr32 = 0, bnr33 = 0, bnr34 = 0, bnr35 = 0, bnr36 = 0, bnr37 = 0, bnr38 = 0, bnr39 = 0, bnr40 = 0;
        int Slh1 =0, Slh2 = 0, Slh3 = 0, Slh4 = 0, Slh5 = 0, Slh6 = 0, Slh7 = 0, Slh8 = 0, Slh9 = 0, Slh10 = 0, Slh11 = 0, Slh12 = 0, Slh13 = 0, Slh14 = 0, Slh15 = 0, Slh16 = 0, Slh17 = 0, Slh18 = 0, Slh19 = 0, Slh20 = 0, Slh21 = 0, Slh22 = 0, Slh23 = 0, Slh24 = 0, Slh25 = 0, Slh26 = 0, Slh27 = 0, Slh28 = 0, Slh29 = 0, Slh30 = 0,Slh31 = 0,Slh32 = 0,Slh33 = 0,Slh34 = 0, Slh35 = 0, Slh36 = 0, Slh37 = 0, Slh38 = 0, Slh39 = 0,Slh40 = 0; 
        String[] b = new String[6];
        System.out.println(BIRU+"==============================");
        System.out.println(MERAH+"| Tingkat Kesulitan Menengah |");
        System.out.println(MERAH+"|    Jumlah Soal = 40 Soal   |");
        System.out.println(BIRU+"==============================");
        System.out.println("--- Selamat Mengerjakan ---");
        b[0] = "Berapa banyak tulang yang dimiliki pria dewasa / wanita dewasa yang sehat?";
        b[1] = "206";
        b[2] = "308";
        b[3] = "102";
        b[4] = "509";
        b[5] = "50";
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
        b[0] = "Dimana Albert Einstein lahir?";
        b[1] = "Amerika Serikat";
        b[2] = "Jerman";
        b[3] = "Swiss";
        b[4] = "Austria";
        b[5] = "Jepang";
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
        b[0] = "Manakah planet yang terdekat dengan bumi?";
        b[1] = "Venus";
        b[2] = "Merkurius";
        b[3] = "Mars";
        b[4] = "Jupiter";
        b[5] = "Saturnus";
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
        b[0] = "Kakak laki-lakimu memakan pizzamu, apa itu kata 'mu'?";
        b[1] = "Kata Benda";
        b[2] = "Kata Ganti";
        b[3] = "Kata Sifat";
        b[4] = "Kata Keterangan";
        b[5] = "Kata bantu";
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
        b[0] = "Di mana letak benteng Malborough?";
        b[1] = "Semarang";
        b[2] = "DIY Yogyakarta";
        b[3] = "Bengkulu";
        b[4] = "Bukit Tinggi";
        b[5] = "Banten";
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
            case "c":
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
                System.out.println("kunci jawaban = c");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh5 = Salah;
                System.out.println("kunci jawaban = c");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5;
                System.out.println("Jawaban yang salah : " + totsalah );         
                break;
            case "d":
                System.out.println(JwSl);
                Slh5 = Salah;
                System.out.println("kunci jawaban = c");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh5 = Salah;
                System.out.println("kunci jawaban = c");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
    }
        System.out.println("");
        b[0] = "Apa nama organisasi pergerakan nasional yang didirikan tiga serangkai?";
        b[1] = "BPUPKI";
        b[2] = "Fujinkai";
        b[3] = "PPKI";
        b[4] = "Indische Partij";
        b[5] = "Jawa Hokokai";
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
        b[0] = "Komisi Palang Merah sedunia adalah?";
        b[1] = "Nasa";
        b[2] = "ILO";
        b[3] = "ICRC";
        b[4] = "UNO";
        b[5] = "VOA";
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
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh7 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh7 = Salah;
                System.out.println("kunci jawaban = c");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Bangunan Tertinggi di indonesia adalah ?";
        b[1] = "Tugu Selamat Datang";
        b[2] = "Menara Saidah";
        b[3] = "Candi Borobudur";
        b[4] = "Jam Gadang";
        b[5] = "Tugu Monas";
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
        b[0] = "Dipulau Apakah terdapat patung Moai raksasa?";
        b[1] = "Pulau Maldives";
        b[2] = "Pulau Hawaii";
        b[3] = "Pulau Moracay";
        b[4] = "Pulau Paskah";
        b[5] = "Pulau Komodo";
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
            case "d":
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
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh9 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh9 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh9 = Salah;
                System.out.println("kunci jawaban = d");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Disebut apa istilah kembang api dalam bahasa jepang?";
        b[1] = "Hanabi";
        b[2] = "Shima";
        b[3] = "Ogoe de";
        b[4] = "Sora";
        b[5] = "Tsuki";
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
            case "a":
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
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh10 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh10 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh10 = Salah;
                System.out.println("kunci jawaban = a");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Dimana letak proses penyaringan darah pada tubuh manusia?";
        b[1] = "Lambung";
        b[2] = "Ginjal";
        b[3] = "Hati";
        b[4] = "Usus";
        b[5] = "Paru-paru";
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
            case "b":
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
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh11 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh11 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh11 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Timor leste memisahkan diri dari indonesia pada tahun?";
        b[1] = "1997";
        b[2] = "1999";
        b[3] = "2000";
        b[4] = "1992";
        b[5] = "1995";
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
        b[0] = "Hutan yang berfungsi sebagai pelindung flora dan fauna disebut hutan?";
        b[1] = "Hutan Lindung";
        b[2] = "Hutan Suaka alam";
        b[3] = "Hutan Produksi";
        b[4] = "Hutan Homogen";
        b[5] = "Hutan Heterogen";
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
            case "b":
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
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh13 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh13 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh13 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Nama bapak pramuka dunia bernama ?";
        b[1] = "Suharto";
        b[2] = "Lodbonden Fowowel";
        b[3] = "Henri Dunand";
        b[4] = "Plato";
        b[5] = "Moh.Hatta";
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
            case "b":
                System.out.println(JwBn);
                bnr14 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh14 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh14 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh14 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh14 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Danau terluas di indonesia adalah?";
        b[1] = "Danau Toba";
        b[2] = "Danau Singkarak";
        b[3] = "Danau Matano";
        b[4] = "Danau Maninjau";
        b[5] = "Danau Sentani";
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
            case "a":
                System.out.println(JwBn);
                bnr15 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh15 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh15 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh15 = Salah;
                System.out.println("kunci jawaban = a");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh15 = Salah;
                System.out.println("kunci jawaban = a");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Agama Buddha berasal dari ?";
        b[1] = "Saudi Arabia";
        b[2] = "Pakistan";
        b[3] = "Italia";
        b[4] = "India";
        b[5] = "Kamboja";
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
            case "d":
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
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh16 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh16 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh16 = Salah;
                System.out.println("kunci jawaban = d");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Sungai Terpanjang di dunia adalah?";
        b[1] = "Sungai Nil";
        b[2] = "Sungai Amazon";
        b[3] = "Sungai Panjang";
        b[4] = "Sungai Kuning";
        b[5] = "Sungai Parana";
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
        b[0] = "Terusan Suez berada di negara ?";
        b[1] = "Kolombia";
        b[2] = "India";
        b[3] = "Iran";
        b[4] = "China";
        b[5] = "Mesir";
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
            case "e":
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
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh18 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh18 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh18 = Salah;
                System.out.println("kunci jawaban = e");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Primata paling cerdas adalah?...";
        b[1] = "Lemur";
        b[2] = "Kukang";
        b[3] = "Langus";
        b[4] = "Tarsius";
        b[5] = "Simpanse";
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
            case "e":
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
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh19 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh19 = Salah;
                System.out.println("kunci jawaban = e");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh19 = Salah;
                System.out.println("kunci jawaban = e");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Buah yang mendapat julukan rajanya buah adalah?";
        b[1] = "Semangka";
        b[2] = "Durian";
        b[3] = "Nanas";
        b[4] = "Mangga";
        b[5] = "Jeruk";
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
            case "b":
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
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh20 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh20 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh20 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Hewan dengan kecepatan lari tercepat adalah?";
        b[1] = "Rusa Thomson";
        b[2] = "Singa";
        b[3] = "Kijang";
        b[4] = "Cheetah";
        b[5] = "Antelop";
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
        b[0] = "Bunga nasional negara indonesia adalah?...";
        b[1] = "Bunga mawar";
        b[2] = "Bunga Matahari";
        b[3] = "Bunga Edelweiss";
        b[4] = "Bunga Melati";
        b[5] = "Bunga Tulip";
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
            case "d":
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
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh22 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh22 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh22 = Salah;
                System.out.println("kunci jawaban = d");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Ilmu yang mempelajari tata surya adalah?";
        b[1] = "Ekonomi";
        b[2] = "Astronomi";
        b[3] = "Antropologi";
        b[4] = "Ekologi";
        b[5] = "Mikologi";
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
            case "b":
                System.out.println(JwBn);
                bnr23 = Benar;
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
            case "c":
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
            case "a":
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
        b[0] = "Alat pengukur tegangan listrik adalah?";
        b[1] = "Termometer";
        b[2] = "Spherometer";
        b[3] = "Voltmeter";
        b[4] = "Mikrometer";
        b[5] = "Stopwatch";
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
            case "c":
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
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh24 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh24 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh24 = Salah;
                System.out.println("kunci jawaban = c");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
    System.out.println("");
        b[0] = "Planet dalam tata surya kita berjumlah?";
        b[1] = "10";
        b[2] = "15";
        b[3] = "20";
        b[4] = "11";
        b[5] = "8";
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
            case "e":
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
                System.out.println("kunci jawaban = e");
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
            case "d":
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
        }
        System.out.println("");
        b[0] = "Planet terkecil dalam tata surya kita adalah?...";
        b[1] = "Venus";
        b[2] = "Mars";
        b[3] = "Merkurius";
        b[4] = "Bumi";
        b[5] = "Saturnus";
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
            case "c":
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
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh26 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh26 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh26 = Salah;
                System.out.println("kunci jawaban = c");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = " Olahraga yang memanfaatkan gaya pegas adalah ?";
        b[1] = "Lari";
        b[2] = "renang";
        b[3] = "Voli";
        b[4] = "Basket";
        b[5] = "Panahan";
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
            case "e":
                System.out.println(JwBn);
                bnr27 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh27 = Salah;
                System.out.println("kunci jawaban = e");
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
            case "d":
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
        }
        System.out.println("");
        b[0] = "Planet yang sering disebut bintang fajar / bintang merah adalah?...";
        b[1] = "Mars";
        b[2] = "Venus";
        b[3] = "Saturnus";
        b[4] = "Pluto";
        b[5] = "Jupiter";
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
            case "b":
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
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh28 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh28 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh28 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Indonesia dibagi menjadi berapa zona waktu?";
        b[1] = "1";
        b[2] = "2";
        b[3] = "3";
        b[4] = "4";
        b[5] = "5";
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
        b[0] = " Nama Selat antara pulau jawa dan madura adalah?";
        b[1] = "Selat Sunda";
        b[2] = "Selat Madura";
        b[3] = "Selat Alas";
        b[4] = "Selat Karimata";
        b[5] = "Selat Malaka";
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
            case "b":
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
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh30 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh30 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh30 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5 + bnr6 + bnr7 + bnr8 + bnr9 + bnr10 + bnr11 + bnr12 + bnr13 + bnr14 + bnr15 + bnr16 + bnr17 + bnr18 + bnr19 + bnr20+bnr21+bnr22+bnr23+bnr24+bnr25+bnr26+bnr27+bnr28+bnr29+bnr30;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5 + Slh6 + Slh7 + Slh8 + Slh9 + Slh10 + Slh11 + Slh12 + Slh13 + Slh14 + Slh15 + Slh16 + Slh17 + Slh18 + Slh19 + Slh20+Slh21+Slh22+Slh23+Slh24+Slh25+Slh26+Slh27+Slh28+Slh29+Slh30;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Yang paling baik untuk membersihkan luka bahan kimia adalah?";
        b[1] = "Tisu";
        b[2] = "Sabun";
        b[3] = "Air Mengalir";
        b[4] = "Alkohol";
        b[5] = "Lap Kain";
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
        b[0] = "Bahasa inggris berhenti adalah?";
        b[1] = "Quit";
        b[2] = "Close";
        b[3] = "Exit";
        b[4] = "Quiet";
        b[5] = "Stop";
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
        b[0] = "Yoghurt adalah fermentasi dari?";
        b[1] = "Kopi";
        b[2] = "Kedelai";
        b[3] = "Susu";
        b[4] = "Buah - buahan";
        b[5] = "Gula";
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
        b[0] = "Istilah Bhinneka Tunggal Ika terdapat pada kitab?";
        b[1] = "Negarakertagama";
        b[2] = "Sutasoma";
        b[3] = "Mahabharata";
        b[4] = "Simarandahana";
        b[5] = "Arjuna Wiwaha";
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
        b[0] = "Makanan pokok favorit orang asia adalah?";
        b[1] = "Nasi";
        b[2] = "Jagung";
        b[3] = "Sagu";
        b[4] = "Singkong";
        b[5] = "Sorgum";
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
        b[0] = "Mamalia terbesar di dunia adalah?";
        b[1] = "Gajah";
        b[2] = "Paus";
        b[3] = "Badak";
        b[4] = "Kudanil";
        b[5] = "Beruang";
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
        b[0] = "Bentuk pemerintahan indonesia adalah ?";
        b[1] = "Monarki";
        b[2] = "Tirani";
        b[3] = "Aristokrasi";
        b[4] = "Teknorasi";
        b[5] = "Demokrasi";
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
        b[0] = "Pulau Terbesar di Indonesia adalah ?";
        b[1] = "Pulau Kalimantan";
        b[2] = "Pulai Sumatra";
        b[3] = "Pulau Papua";
        b[4] = "Pulau Sulawesi";
        b[5] = "Pulau Jawa";
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
        b[0] = "Tari Saman berasal dari ?";
        b[1] = "Jambi";
        b[2] = "Sumatra Utara";
        b[3] = "Riau";
        b[4] = "Nanggroe Aceh Darussalam";
        b[5] = "Sumatra";
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
        b[0] = "Hari kesaktian Pancasila diperingati pada tanggal ?";
        b[1] = "28 September";
        b[2] = "14 Agustus";
        b[3] = "17 Agustus";
        b[4] = "1 Juni";
        b[5] = "25 Desember";
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
    
