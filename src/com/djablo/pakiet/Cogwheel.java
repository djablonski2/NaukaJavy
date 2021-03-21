package com.djablo.pakiet;

public class Cogwheel {
    private int size; //atrybut klasy
    private int numberOfCogs; //atrybut klasy

    public Cogwheel() { //konstruktor bo nie ma typu zwracanego
    }

    public Cogwheel(int size, int noCogs) { //konstruktor bo nie ma typu zwracanego
        this.size = size; //zawiera dodatkowe słowo kluczowe this aby odróżnić parametr size od atrybutu size
        numberOfCogs = noCogs;
    }


}