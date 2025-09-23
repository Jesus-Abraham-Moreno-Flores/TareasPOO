package org.example.pruebajavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import java.util.Scanner;

import java.awt.*;
import java.io.IOException;

public class JavafxSample extends Application {

    Jugador j1 = new Jugador("David");
    Jugador j2 = new Jugador("Artemio");
    Jugador j3 = new Jugador("Pimi");
    Jugador j4 = new Jugador("Goku");
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
        System.out.println("Para ganar cada ronda debes de juntar la mayor cantidad de puntos posibles");

    }

    private BorderPane crearTablero() {
        Juego3Dados juego3Dados = new Juego3Dados();
        return new Tablero(j1, j2, j3, j4, juego3Dados);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
