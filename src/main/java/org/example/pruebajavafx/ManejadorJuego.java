
package org.example.pruebajavafx;

public class ManejadorJuego {

    private Juego3Dados juego3Dados;
    private Jugador jugador1;
    private Jugador jugador2;
    private Jugador jugador3;
    private Jugador jugador4;
    private int numeroDeRondas;
    private Jugador ganador;
    //rondaActual, es el turno del jugador
    private int turnoJugador;

    public ManejadorJuego() {
        juego3Dados = new Juego3Dados();
        jugador1 = new Jugador("Abraham");
        jugador2 = new Jugador("Simon");
        jugador3 = new Jugador("Trevor");
        jugador4 = new Jugador("Libertad");
        numeroDeRondas = 3;
        turnoJugador = 0;
    }
    ManejadorJuego(int numeroDeRondas) {
        juego3Dados = new Juego3Dados();
        turnoJugador = 0;
        jugador1 = new Jugador("Abraham");
        jugador2 = new Jugador("Simon");
        jugador3 = new Jugador("Trevor");
        jugador4 = new Jugador("Laurie");
        this.numeroDeRondas = numeroDeRondas;
    }

    public void iniciarJuego() {
        int numRondas = numeroDeRondas;

        do{
            System.out.println("RONDA : " + (numRondas));

            jugar(jugador1);
            jugar(jugador2);
            jugar(jugador3);
            jugar(jugador4);
            numRondas--;


            mostrarRonda();
        }while(numRondas > 0);


        Jugador ganador= getGanador();
        System.out.println("Ganador: " + ganador);



    }

    public void jugar(Jugador jugador) {
        juego3Dados.lanzar3Dados();
        jugador.setPuntos(jugador.getPuntos() + juego3Dados.suma3Dados());
        System.out.println(juego3Dados.misDados());
        if (juego3Dados.ganar()) {
            jugador.incrementarRondasGanadas();
        }
    }
    public Jugador jugar() {
        Jugador jugador=null;
        switch (turnoJugador){
            case 0: jugador = jugador1; break;
            case 1: jugador = jugador2; break;
            case 2: jugador = jugador3; break;
            case 3: jugador = jugador4; break;
        }

        juego3Dados.lanzar3Dados();

        jugador.setPuntos(jugador.getPuntos()+juego3Dados.suma3Dados());
        System.out.println(juego3Dados.misDados() );
        if (juego3Dados.ganar()) {
            jugador.incrementarRondasGanadas();
        }
        turnoJugador++;
        if (turnoJugador >= 4){
            turnoJugador = 0;
            numeroDeRondas--;
            if(numeroDeRondas==0){
                System.out.println("El juego ha acabado...");
            }
        }
        return jugador;
    }

    public int getRondaActual() {
        return turnoJugador;
    }
    public Jugador getGanador() {
        Jugador jugadorGanador = jugador1;
        if (jugador2.getPuntos() > jugadorGanador.getPuntos()) {
            jugadorGanador = jugador2;
        }

        if (jugador3.getPuntos() > jugadorGanador.getPuntos()) {
            jugadorGanador = jugador3;
        }

        if (jugador4.getPuntos() > jugadorGanador.getPuntos()) {
            jugadorGanador = jugador4;
        }

        System.out.println("El jugador que ganó fue " + jugadorGanador.getNombre() +
                " con " + jugadorGanador.getPuntos() + " puntos.");

        return jugadorGanador;

    }
    public String mostrarRonda() {
        System.out.println(jugador1);
        System.out.println(jugador2);
        System.out.println(jugador3);
        System.out.println(jugador4);
        return jugador1.toString();
    }

    public void resetearRonda() {
        turnoJugador=0;
    }

    public int getNumeroDeRondas() {
        return numeroDeRondas;
    }

    public Juego3Dados getJuego3Dados() {
        return juego3Dados;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public Jugador getJugador3() {
        return jugador3;
    }

    public Jugador getJugador4() {
        return jugador4;
    }

    public int getTurnoJugador() { return turnoJugador; }

    public static void main(String[] args) {
        ManejadorJuego mj = new ManejadorJuego();
        mj.iniciarJuego();
    }
}