package com.djablo.program;

import java.util.Arrays;

public class Petle {
    public static void main(String[] args) {
        Petle petle = new Petle();
//        petle.petlaSwitch();
//        petle.petlaFor();
//        petle.petlaWhile();
        petle.zadanie5();
    }

    public void petlaSwitch() {
        int temperatura = 1;
        switch (temperatura) {
            case 1:
                System.out.println("adfadf");
                break;
            case 2:
                System.out.println("adfafda");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + temperatura);
        }
    }

    public void petlaFor() {
        int[] elementyTablicy = new int[]{1, 6, 3, 8, 1};
        for (int i = 0; i < elementyTablicy.length; i++) {
            System.out.println(elementyTablicy[i]);
        }
        System.out.println("Pętla For zapis uproszczony");
        for (int iterator : elementyTablicy) {
            System.out.println(iterator);
        }
    }

    public void petlaWhile() {
        System.out.println("wypisuje liczby nieparzyste mniejsze od 10");
        int i = 0;
        while (i < 10) {
            i++;
            if (i % 2 == 0) { //reszta z dzielenia i przez 2 równa jest 0
                continue; //To słowo kluczowe powoduje przeskoczenie do kolejnej iteracji pętli.
            }
            System.out.println(i);
        }
    }

    public void zadanie1() {
        for (int i = 20; i > 9; i--) {
            System.out.println(i);
        }
    }

    public void zadanie2() {
        int i = 20;
        while (i > 9) {
            System.out.println(i);
            i--;
        }
    }

    public void zadanie4() {
        int i = -10;
        while (i < 41) {
            System.out.println(i);
            i++;
        }
    }

    public void zadanie5() {
        int[] tab = new int[]{4, 6, 3, 7, 2, 8};
        System.out.println(Arrays.stream(tab).sum());
        //rozwiązanie z pętlą
        int sumaZPetli=0;
        for (int iterator : tab) {
            sumaZPetli += iterator;
        }
        System.out.println(sumaZPetli);
    }


}
