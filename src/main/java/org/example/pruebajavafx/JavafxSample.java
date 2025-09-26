package org.example.pruebajavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import java.util.Scanner;

import java.awt.*;
import java.io.IOException;

public class JavafxSample extends Application {

    Jugador j1 = new Jugador("Artorias");
    Jugador j2 = new Jugador("Abraham");
    Jugador j3 = new Jugador("Goku");
    Jugador j4 = new Jugador("Hola");

    private Juego3Dados juego;
    private String respuesta;

    @Override
    public void start(Stage stage) throws IOException {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double screenWidth = screenSize.getWidth();
        double screenHeight = screenSize.getHeight();

        Scene scene = new Scene(crearTablero(), screenWidth * 0.8, screenHeight * 0.8);
        stage.setTitle("Juego de los 3 dados");
        stage.setScene(scene);
        stage.show();

        System.out.println("Juego de los 3 dados\n Reglas del juego: El ganador será quien gane 2 rondas de un total de 3");
        System.out.println("Para ganar cada ronda debes de juntar la más puntos que los demás");

    }

    private BorderPane crearTablero() {
        ManejadorJuego manejador=new ManejadorJuego(3);
        Tablero tablero = new Tablero(manejador);
        ControlJuego3Dados controlador = new ControlJuego3Dados(tablero, manejador);
        return tablero;
    }
}