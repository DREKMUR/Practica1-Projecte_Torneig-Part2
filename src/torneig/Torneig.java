package torneig;
/**
* @Author -- Diego Mejías Peña
  @Version -- 1.0
*/
public class Torneig {

	Data data;
	//Partit partitsJugats;
	//Jugador guanyador;

	public Torneig(Data data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Data del torneig:  "+data;
	}
	
	

}
