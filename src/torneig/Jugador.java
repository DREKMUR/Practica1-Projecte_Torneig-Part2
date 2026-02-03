package torneig;

/**
 * Representa un jugador dins d'un torneig.
 * Hereta les dades personals de la classe {@link Persona} i afegeix
 * el número de llicència esportiva del jugador.
 *
 * <p>La classe permet crear jugadors amb les seves dades personals
 * i consultar el número de llicència associat.</p>
 *
 * author Derek Murillo Fernandez
 * version 1.0
 */
public class Jugador extends Persona {

    /** Número de la llicència esportiva del jugador. */
    private int numeroLlicencia;

    /**
     * Crea un nou jugador amb les dades personals i el número de llicència indicats.
     *
     * @param nom_complet nom i cognoms del jugador
     * @param data_naixement data de naixement del jugador
     * @param nif NIF del jugador
     * @param numeroLlicencia número de la llicència esportiva
     */
    public Jugador(String nom_complet, Data data_naixement, Nif nif, int numeroLlicencia) {
        super(nom_complet, data_naixement, nif);
        this.numeroLlicencia = numeroLlicencia;
    }

    /**
     * Retorna el número de la llicència del jugador.
     *
     * @return número de llicència
     */
    public int getNumeroLlicencia() {
        return numeroLlicencia;
    }
}
