package com.djablo.program;

public class Petle {
    public static void main(String[] args) {
        Petle petle = new Petle();
        petle.petlaSwitch();
        petle.petlaFor();
        petle.petlaWhile();
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

    public void petlaFor(){
        int[] elementyTablicy = new int[]{1,6,3,8,1};
        for (int i = 0; i < elementyTablicy.length; i++) {
            System.out.println(elementyTablicy[i]);
        }
        System.out.println("Pętla For zapis uproszczony");
        for (int iterator:elementyTablicy) {
            System.out.println(iterator);
        }
    }

    public void petlaWhile(){
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

}
