package org.example.pruebajavafx;

import javafx.scene.layout.VBox;

import java.awt.*;

public class ControlJuego3Dados  {
    private Tablero tablero;
    private ManejadorJuego manejador;

    public ControlJuego3Dados(Tablero tablero, ManejadorJuego manejador){
        this.tablero=tablero;
        this.manejador=manejador;
        CentroTablero centro = new CentroTablero(this);
        tablero.setCentroTablero(centro);
    }

    public void jugar (){
        Jugador jugador = manejador.jugar();

        //Aqui se obtiene el valor de cada dado para cada jugador
        tablero.actualizarDados(manejador.getJuego3Dados().getValorDado1(),
                manejador.getJuego3Dados().getValorDado2(), manejador.getJuego3Dados().getValorDado3());
        //Se actualizan los puntos de los jugadores al tirar
        tablero.actualizarJugador(jugador);

        if ((manejador.getNumeroDeRondas() == 0)) {
            Jugador ganador = manejador.getGanador();
            tablero.mostrarGanador(ganador);
        }
    }

    public void lanzar3Dados(){
        Label nombreGanador=new Label();

    }
}