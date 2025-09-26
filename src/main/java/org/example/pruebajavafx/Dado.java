package org.example.pruebajavafx;

import java.util.Random;

public class Dado {

    private int valor;         // Valor que posee el dado
    private final Random rnd;  // Randomizer para generar números aleatorios

    public Dado() {
        rnd = new Random();
        lanzar(); //
    }

    public void lanzar() {
        valor = rnd.nextInt(6) + 1;
    } //Lanzamos el dado que posee valor del 1 al 6

    public int getValor() {
        return valor;
    }
}
