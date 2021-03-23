package com.djablo.pakiet;

import com.djablo.pakiet.Engine;

public class Silnik {

    public static void main(String[] args) {
        Engine engine = new Engine(); // tworzymy instancje klasy
        engine.isStarted(); // zwraca wartość atrybutu
        engine.setStarted(true); // ustawia wartość atrybutu started w instancji engine

    }


}