package com.djablo.pakiet;

import com.djablo.pakiet.Cogwheel;

public class Engine {
    private boolean started; //atrybut klasy
    private Cogwheel cogwheel; //atrybut klasy; typem może być też inna klasa

    public Engine() { //konstruktor bo nie ma typu zwracanego
        cogwheel = new Cogwheel(4, 450); //wywołanie konstruktora, inaczej - tworzenie instancji klasy
        started = true;
    }
    public Engine(Cogwheel cogwheel) { //konstruktor bo nie ma typu zwracanego
        this.cogwheel = cogwheel;
    }

    public void start() {
        started = initiateStartingSequence();
    }
    private boolean initiateStartingSequence() {
        return true;
    }
    public void stop() {
        started = false;
    }
    public boolean isStarted() {
        return started;
    }
    public void setStarted(boolean started) {
        this.started = started;
    }


}