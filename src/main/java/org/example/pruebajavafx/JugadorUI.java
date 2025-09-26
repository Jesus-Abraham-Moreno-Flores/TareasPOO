package org.example.pruebajavafx;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;

public class JugadorUI extends VBox {
    private Jugador jugador;
    private Label nombreLabel;
    private Label puntosLabel;

    public JugadorUI(Jugador jugador){
        this.jugador = jugador;

        nombreLabel = new Label();
        puntosLabel = new Label();

        nombreLabel.setText(jugador.getNombre());
        puntosLabel.setText(jugador.getPuntos() + "");

        this.setSpacing(5);
        this.setStyle("-fx-alignment: center; -fx-padding: 10; -fx-border-color: #f3f3f3; -fx-border-width: 1; " +
                "-fx-background-color: #ababaf;");


        nombreLabel.setStyle("-fx-font-size: 24px; -fx-text-fill: #ffffff");
        puntosLabel.setStyle("-fx-font-size: 24px; -fx-text-fill: #fffbfb");

        this.getChildren().addAll(nombreLabel, puntosLabel);
    }

    public void updatePuntos(int puntos){
        puntosLabel.setText(puntos+"");
    }


    public Jugador getJugador(){
        return jugador;
    }

    public void addPuntos(int puntos){
        int suma = jugador.getPuntos() + puntos;
        jugador.setPuntos(suma);
        puntosLabel.setText(suma + "");
    }

}