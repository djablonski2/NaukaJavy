package com.djablo.program;

public class ZmiennaLiczbaArg {
    //Znasz już metodę main, domyślnie przyjmuje ona tablicę łańcuchów znaków -  main(String[] args)
    // Równie dobrze tę metodę możemy zapisać jako:
    public static void main(String ... args) {
    ZmiennaLiczbaArg sumZmiennych = new ZmiennaLiczbaArg();
        int suma = sumZmiennych.sum(34, 34, 12);
        System.out.println(suma);

        int suma2 = sumZmiennych.sum(34, 34, 12);
        System.out.println(suma2);

    }

     int sum(int... numbers) {
        int suma = 0;
         for (int i : numbers) {
             suma += i;
         }
         return suma ;
    }

    int sum2(int...numbers){
        int suma = 0;
        for (int i = 0; i < numbers.length; i++) {
            suma += i;
        }
        return suma;
    }

}
