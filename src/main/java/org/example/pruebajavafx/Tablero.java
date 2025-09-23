package org.example.pruebajavafx;

import javafx.scene.layout.BorderPane;

public class Tablero extends BorderPane {
    private JugadorUI ui1;
    private JugadorUI ui2;
    private JugadorUI ui3;
    private JugadorUI ui4;
    private CentroTablero centroTablero;
    private Juego3Dados juego3Dados;

    public Tablero(Jugador j1, Jugador j2, Jugador j3, Jugador j4, Juego3Dados juego3Dados) {
        this.juego3Dados = juego3Dados;

        ui1 = new JugadorUI(j1);
        ui2 = new JugadorUI(j2);
        ui3 = new JugadorUI(j3);
        ui4 = new JugadorUI(j4);

        centroTablero = new CentroTablero(this.juego3Dados);

        this.setTop(ui1);
        this.setBottom(ui2);
        this.setLeft(ui3);
        this.setRight(ui4);
        this.setCenter(centroTablero);
    }
}
