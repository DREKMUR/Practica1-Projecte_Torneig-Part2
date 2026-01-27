package torneig;

public class Partit {
	/**
	 * @Author -- Derek Murillo Fernandez
	 * @Version -- 1.0
	 */
	private Jugador participant1;
	private Jugador participant2;
	private Jugador guanyador;
	private Marcador puntuacions;
	
	public Partit(Jugador participant1, Jugador participant2, Jugador guanyador, Marcador puntuacions) {
		this.participant1 = participant1;
		this.participant2 = participant2;
		this.guanyador = guanyador;
		this.puntuacions = puntuacions;
	}

	public Jugador getGuanyador() {
		return guanyador;
	}

	public void setGuanyador(Jugador guanyador) {
		this.guanyador = guanyador;
	}

	public Marcador getPuntuacions() {
		return puntuacions;
	}

	public void setPuntuacions(Marcador puntuacions) {
		this.puntuacions = puntuacions;
	}

	public Jugador getParticipant1() {
		return participant1;
	}

	public Jugador getParticipant2() {
		return participant2;
	}
	
	
}
