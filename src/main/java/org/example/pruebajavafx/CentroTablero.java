package org.example.pruebajavafx;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class CentroTablero extends HBox {

    private Juego3Dados juego3dados;
    private DadoUI dadoUI1;
    private DadoUI dadoUI2;
    private DadoUI dadoUI3;
    private Button lanzar = new Button("Lanzar");

    public CentroTablero(Juego3Dados juego3dados) {

        this.juego3dados = juego3dados;
        dadoUI1 = new DadoUI();
        dadoUI2 = new DadoUI();
        dadoUI3 = new DadoUI();

        lanzar.setOnMouseClicked(MouseEvent -> {
            juego3dados.lanzar3Dados();
            dadoUI1.cambiarEmojis(juego3dados.getValorDado1());
            dadoUI2.cambiarEmojis(juego3dados.getValorDado2());
            dadoUI3.cambiarEmojis(juego3dados.getValorDado3());

        });
        this.getChildren().addAll(dadoUI1, dadoUI2, dadoUI3,lanzar);
    }
}
