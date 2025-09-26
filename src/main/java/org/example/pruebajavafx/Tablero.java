package org.example.pruebajavafx;
import javafx.scene.control.Alert;
import javafx.scene.layout.BorderPane;

import javafx.scene.control.Label;

public class Tablero extends BorderPane {
    private JugadorUI ui1;
    private JugadorUI ui2;
    private JugadorUI ui3;
    private JugadorUI ui4;
    private CentroTablero centroTablero;
    private Juego3Dados juego3Dados;
    private Label ganadorLabel;

    public Tablero(Jugador j1, Jugador j2, Jugador j3, Jugador j4) {
        //this.juego3Dados = juego3Dados;

        ui1 = new JugadorUI(j1);
        ui2 = new JugadorUI(j2);
        ui3 = new JugadorUI(j3);
        ui4 = new JugadorUI(j4);

        //centroTablero = new CentroTablero(this.juego3Dados);

        this.setTop(ui1);
        this.setBottom(ui3);
        this.setLeft(ui4);
        this.setRight(ui2);
        this.setCenter(centroTablero);
    }

    public Tablero(ManejadorJuego manejador){
        this.juego3Dados=manejador.getJuego3Dados();
        ui1=new JugadorUI(manejador.getJugador1());
        ui2=new JugadorUI(manejador.getJugador2());
        ui3=new JugadorUI(manejador.getJugador3());
        ui4=new JugadorUI(manejador.getJugador4());
        //centroTablero = new CentroTablero(manejador.getJuego3Dados());

        this.setTop(ui1);
        this.setBottom(ui3);
        this.setLeft(ui4);
        this.setRight(ui2);
        this.setCenter(centroTablero);
    }
    public void setCentroTablero(CentroTablero centroTablero) {
        this.centroTablero = centroTablero;
        this.setCenter(centroTablero);
    }

    public void actualizarDados(int valDado1, int valDado2, int valDado3){
        centroTablero.actualizarDados(valDado1, valDado2, valDado3);
    }
    //pendiente de prueba, corroborar la actualizacion de los
    //datos del jugador
    public void actualizarJugador(Jugador jugador){

        if(jugador.equals(ui1.getJugador())){
            ui1.updatePuntos(jugador.getPuntos());
        }else if(jugador.equals(ui2.getJugador())){
            ui2.updatePuntos(jugador.getPuntos());
        }else if(jugador.equals(ui3.getJugador())){
            ui3.updatePuntos(jugador.getPuntos());
        }else if(jugador.equals(ui4.getJugador())){
            ui4.updatePuntos(jugador.getPuntos());
        }
    }
    public CentroTablero getCentroTablero() {
        return centroTablero;
    }

    public void mostrarGanador(Jugador ganador) {
        ganadorLabel = new Label();
        ganadorLabel.setStyle("-fx-font-size: 32px; -fx-text-fill: green; -fx-font-weight: bold;");
        this.setCenter(ganadorLabel);

        ganadorLabel.setText("El ganador es: " + ganador.getNombre() );
        //this.getChildren().add(nombreGanador);


    }
}