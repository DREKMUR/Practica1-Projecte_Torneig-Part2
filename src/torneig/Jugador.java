package torneig;

public class Jugador extends Persona {
	/**
	 * @Author -- Derek Murillo Fernandez
	 * @Version -- 1.0
	 */
	
	/**
	 * Atribut numeroLlicencia
	 */
	private int numeroLlicencia;

	/**
	 * Constructor de Jugador usant atributs de Persona i propis de Jugador
	 * @param nom_complet Nom i cognoms del Jugador.
	 * @param data_naixement Data naixement del Jugador.
	 * @param nif NIF del Jugador.
	 * @param numeroLlicencia Número de la llicencia del Jugador.
	 */
	public Jugador(String nom_complet, Data data_naixement, Nif nif, int numeroLlicencia) {
		super(nom_complet, data_naixement, nif);
		this.numeroLlicencia = numeroLlicencia;
	}

	/**
	 * Getter del número de la llicencia del Jugador.
	 * @return {int} numeroLlicencia
	 */
	public int getNumeroLlicencia() {
		return numeroLlicencia;
	}
}
