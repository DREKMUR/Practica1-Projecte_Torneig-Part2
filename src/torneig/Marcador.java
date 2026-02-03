package torneig;

/**
 * Representa el marcador de un partit entre dos jugadors.
 * Emmagatzema la puntuació de cadascun d'ells i permet consultar-la.
 *
 * @author Derek Murillo Fernandez
 * @version 1.0
 */
public class Marcador {

    /** Puntuació del jugador 1. */
    private int puntuacioJugador1;

    /** Puntuació del jugador 2. */
    private int puntuacioJugador2;

    /**
     * Crea un nou marcador amb les puntuacions inicials indicades.
     *
     * @param puntuacioJugador1 puntuació inicial del jugador 1
     * @param puntuacioJugador2 puntuació inicial del jugador 2
     */
    public Marcador(int puntuacioJugador1, int puntuacioJugador2) {
        this.puntuacioJugador1 = puntuacioJugador1;
        this.puntuacioJugador2 = puntuacioJugador2;
    }

    /**
     * Retorna la puntuació del jugador 1.
     *
     * @return puntuació del jugador 1
     */
    public int getJugador1() {
        return puntuacioJugador1;
    }

    /**
     * Retorna la puntuació del jugador 2.
     *
     * @return puntuació del jugador 2
     */
    public int getJugador2() {
        return puntuacioJugador2;
    }
}
