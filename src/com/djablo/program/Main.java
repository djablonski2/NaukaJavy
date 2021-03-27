package com.djablo.program;
import com.djablo.pakiet.Engine;

public class Main {
    public static void main(String[] args) {
        //String[] typ tablicowy
        String message = "To jest tekst";
        System.out.println(message);

/*
        do wywołania metody potrzebujemy instancji klasy
        Engine engine = new Engine();
        engine.start();
        Metody statyczne (static) różnią się od zwykłych metod tym, że do ich wywołania nie potrzebujemy
        instancji klasy. Taką metodę możemy wywołać na klasie. Biorąc nasza przykładową klasę Main z
        metodą main wywołanie wyglądałoby następująco.
        Main.main();

        A z wywołaniem instancji kalsy wyglądałoby to tak:
        Engine engine = new Engine(); // tworzymy instancje klasy
        engine.isStarted(); // zwraca wartość atrybutu
        */

        int dlMessage = message.length();
        System.out.println(dlMessage);

        System.out.println(message.contains("tek"));
        System.out.println(message.contains("xxx"));
        System.out.println(message.endsWith("st"));

        String zdanie1 = "pierwsze zdanie dafasdf";
        String zdanie2 = "drugie zdanie adgfadgf asdg a";

        Integer suma = zdanie1.length() + zdanie2.length();
        System.out.println("Suma liter w zdaniach to: "+ suma);
    }
}
