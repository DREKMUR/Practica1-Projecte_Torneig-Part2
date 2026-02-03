package torneig;
/**
* @Author -- Diego Mejías Peña
  @Version -- 1.0
*/
public class Torneig {
	Data data;
	Partit partitsJugats;
	Jugador guanyador;

	public Torneig(Data data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Data del torneig:  "+data;
	}

	//GETTERS I SETTERS
	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public Partit getPartitsJugats() {
		return partitsJugats;
	}

	public void setPartitsJugats(Partit partitsJugats) {
		this.partitsJugats = partitsJugats;
	}

	public Jugador getGuanyador() {
		return guanyador;
	}

	public void setGuanyador(Jugador guanyador) {
		this.guanyador = guanyador;
	}
	
	
}
