package torneig;

public class Marcador {
	/**
	 * @Author -- Derek Murillo Fernandez
	 * @Version -- 1.0
	 */
	private int puntuacioJugador1;
	private int puntuacioJugador2;
	
	public Marcador(int puntuacioJugador1, int puntuacioJugador2) {
		this.puntuacioJugador1 = puntuacioJugador1;
		this.puntuacioJugador2 = puntuacioJugador2;
	}
	
	public int getJugador1() {
		return puntuacioJugador1;
	}
	
	public int getJugador2() {
		return puntuacioJugador2;
	}
}
