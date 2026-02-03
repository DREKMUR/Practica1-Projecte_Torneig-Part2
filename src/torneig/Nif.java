package torneig;

/**
 * Representa un NIF compost per un número de DNI i una lletra.
 *
 * <p>Inclou un mètode per obtenir la representació completa del NIF
 * en format "dniLletra".</p>
 *
 * @author Diego Mejías Peña
 * @version 1.0
 */
public class Nif {

    private int dni;
    private char lletra;

    /**
     * Crea un nou NIF amb el número i la lletra indicats.
     *
     * @param dni número del document
     * @param lletra lletra associada al DNI
     */
    public Nif(int dni, char lletra) {
        this.dni = dni;
        this.lletra = lletra;
    }

    /**
     * Retorna el NIF en format "dniLletra".
     *
     * @return representació textual del NIF
     */
    @Override
    public String toString() {
        return Integer.toString(dni) + lletra;
    }

    /**
     * Obté el número de DNI.
     *
     * @return el número de DNI
     */
    public int getDni() { return dni; }

    /**
     * Estableix un nou número de DNI.
     *
     * @param dni nou número de DNI
     */
    public void setDni(int dni) { this.dni = dni; }

    /**
     * Obté la lletra del NIF.
     *
     * @return la lletra del NIF
     */
    public char getLletra() { return lletra; }

    /**
     * Estableix una nova lletra per al NIF.
     *
     * @param lletra nova lletra del NIF
     */
    public void setLletra(char lletra) { this.lletra = lletra; }
}