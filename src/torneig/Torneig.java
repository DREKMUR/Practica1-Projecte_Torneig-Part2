package torneig;

/**
 * Representa un torneig amb una data, els partits jugats i el guanyador.
 *
 * <p>Aquesta classe permet gestionar la informació bàsica d'un torneig,
 * incloent la seva data de celebració, els partits disputats i el jugador
 * guanyador.</p>
 *
 * @author Diego Mejías Peña
 * @version 1.0
 */
public class Torneig {

    private Data data;
    private Partit partitsJugats;
    private Jugador guanyador;

    /**
     * Crea un torneig amb la data indicada.
     *
     * @param data data de celebració del torneig
     */
    public Torneig(Data data) {
        this.data = data;
    }

    /**
     * Retorna una descripció del torneig.
     *
     * @return text amb la data del torneig
     */
    @Override
    public String toString() {
        return "Data del torneig: " + data;
    }

    /**
     * Agafa la data del torneig.
     * 
     * @return la data del torneig 
     */
    public Data getData() { return data; }

    /** 
     * Actualitza la data.
     * 
     * @param data nova data del torneig 
     */
    public void setData(Data data) { this.data = data; }

    /** 
     * Agafa tots els partits jugats.
     * 
     * @return els partits jugats 
     */
    public Partit getPartitsJugats() { return partitsJugats; }

    /** 
     * Actualitza els partits jugats.
     * 
     * @param partitsJugats nous partits jugats 
     */
    public void setPartitsJugats(Partit partitsJugats) { this.partitsJugats = partitsJugats; }

    /**
     * Agafa el guanyador del torneig.
     * 
     * @return el guanyador del torneig 
     */
    public Jugador getGuanyador() { return guanyador; }

    /** 
     * Actualitza el guanyador.
     * 
     * @param guanyador nou guanyador del torneig 
     */
    public void setGuanyador(Jugador guanyador) { this.guanyador = guanyador; }
}
