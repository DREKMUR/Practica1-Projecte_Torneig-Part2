package torneig;

/**
 * Representa un partit entre dos jugadors dins d'un torneig.
 * Conté els participants, el guanyador i el marcador final.
 *
 * <p>La classe permet consultar i modificar tant el guanyador
 * com les puntuacions del partit.</p>
 *
 * @author Derek Murillo Fernandez
 * @version 1.0
 */
public class Partit {

    /** Primer jugador que participa en el partit. */
    private Jugador participant1;

    /** Segon jugador que participa en el partit. */
    private Jugador participant2;

    /** Jugador que ha guanyat el partit. */
    private Jugador guanyador;

    /** Marcador final del partit. */
    private Marcador puntuacions;

    /**
     * Crea un nou partit amb els participants, el guanyador i el marcador indicats.
     *
     * @param participant1 primer jugador del partit
     * @param participant2 segon jugador del partit
     * @param guanyador jugador que ha guanyat el partit
     * @param puntuacions marcador final del partit
     */
    public Partit(Jugador participant1, Jugador participant2, Jugador guanyador, Marcador puntuacions) {
        this.participant1 = participant1;
        this.participant2 = participant2;
        this.guanyador = guanyador;
        this.puntuacions = puntuacions;
    }

    /**
     * Retorna el jugador guanyador del partit.
     *
     * @return jugador guanyador
     */
    public Jugador getGuanyador() {
        return guanyador;
    }

    /**
     * Assigna un nou guanyador al partit.
     *
     * @param guanyador jugador que ha guanyat
     */
    public void setGuanyador(Jugador guanyador) {
        this.guanyador = guanyador;
    }

    /**
     * Retorna el marcador del partit.
     *
     * @return marcador final
     */
    public Marcador getPuntuacions() {
        return puntuacions;
    }

    /**
     * Assigna un nou marcador al partit.
     *
     * @param puntuacions marcador final
     */
    public void setPuntuacions(Marcador puntuacions) {
        this.puntuacions = puntuacions;
    }

    /**
     * Retorna el primer participant del partit.
     *
     * @return jugador 1
     */
    public Jugador getParticipant1() {
        return participant1;
    }

    /**
     * Retorna el segon participant del partit.
     *
     * @return jugador 2
     */
    public Jugador getParticipant2() {
        return participant2;
    }
}
