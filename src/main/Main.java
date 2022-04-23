package main;

public class Main {

    public static void main(String[] args) {

        int [] mojNiz = {5, 10, 15, 20};//Kroz niz prolazimo po indexima

        int [] niz = new int[2]; //prazan niz dok mu ne dodijelimo elemente
        niz[0] = 5;
        niz[1] = 10;
        System.out.println("Dužina niza: " + mojNiz.length);

//        int [][] niz2 = new int[5][5];

        for (int i = 0; i < mojNiz.length; i++) {
            System.out.println(mojNiz[i]);
        }



//        for (int i = 0; i < 10; i ++) {
//            for (int j = 0; j < 20; j++)
//            System.out.println("Interator i: " + i + " A brojač j je: " + j);
//        }


//        while (true) {
//            if ( //unijeti uslov ) {
//                System.out.println("Hello!");
//            }else {
//                System.out.println( "Bye! ");
//                break;
//            }


//        int a = 0;
//        while (a < 20) {
//            a ++;
//            if (a == 10 || a == 5){
//                System.out.println("Skipujem 10");
//                continue; //Ključna riječ continue, while ga ne vidi ali neće izaći iz petlje nego nastaviti
//            }else {
//                System.out.println(a);
//            }
//            System.out.println("Cao"); //Ovaj ispis se odnosi samo na svoj blok
//        }

//        int b = 0;
//        int c = 0;
//
//        spoljašnja:
//        while (b < 10) {
//            b ++;
//            unutrašnja:
//            while (c < 10) {
//                System.out.println("Druga while petlja");
//                continue unutrašnja;
//            }
//        }
//            System.out.println("Prva while petlja");
    }
}









