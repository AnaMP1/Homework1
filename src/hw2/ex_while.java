package hw2;

import java.util.Scanner;

public class ex_while {
    public static void main(String[] args) {
        ExW3(1);


    }

    static void ExW1(int x) {

        int i = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar intre 1 si 10.");
        System.out.println("Introduceti un numar: ");
        int nrCitit = scanner.nextInt();

        if (nrCitit == x) {
            System.out.println("Felicitari! Ati ghicit numarul.");
            System.out.println("Ati ghicit din " + i + " incercari.");
        } else {
            while (nrCitit != x) {

                if (nrCitit < x) {
                    System.out.println("Numarul cautat este mai mare!");
                } else {

                    System.out.println("Numarul cautat este mai mic!");
                }
                System.out.println("Introduceti un numar: ");
                nrCitit = scanner.nextInt();
                i++;

                if (nrCitit == x) {
                    System.out.println("Felicitari! Ati ghicit numarul.");
                    System.out.println("Ati ghicit din " + i + " incercari.");
                }
            }
        }
    }


    static void ExW2(int x) {

        int i = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
        int nrCitit = scanner.nextInt();

        if (nrCitit == 0) {
            System.out.println("Suma este 0.");
        } else {
            while (nrCitit != 0) {
                i = i + nrCitit;
                System.out.println("Suma este " + i + " .");

                System.out.println("Introduceti un numar: ");
                nrCitit = scanner.nextInt();

            }
        }
    }

    static void ExW3(int x) {

        int i = 0;
        int[] array = new int[3];

        while (i != 3) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduceti un numar: ");
            int nrCitit = scanner.nextInt();
            array[i] = nrCitit;
            i++;
        }

        if (array[0] > 0 && array[1] > 0 && array[2] > 0) {
            if (array[0] + array[1] > array[2]) {
                if (array[0] + array[2] > array[1]) {
                    if (array[2] + array[1] > array[0]) {
                        System.out.println("Numerele pot fi laturile unui triunghi.");
                    } else {
                        System.out.println("Numerele nu pot fi laturile unui triunghi.");
                    }
                } else {
                    System.out.println("Numerele nu pot fi laturile unui triunghi.");
                }
            } else {
                System.out.println("Numerele nu pot fi laturile unui triunghi.");
            }

        }
        else{
            System.out.println("Totate numerele trebuie sa fie pozitive.");
        }

    }
}