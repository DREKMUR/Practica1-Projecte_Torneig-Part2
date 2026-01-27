package torneig;
/**
* @Author -- Diego Mejías Peña
  @Version -- 1.0
*/
public class Nif {

	int dni;
	char lletra;
	
	
	public Nif(int dni, char lletra) {
		this.dni = dni;
		this.lletra = lletra;
	}


	@Override
	public String toString() {
		String dniString = Integer.toString(dni);
		return dniString+lletra;
	}
	
	public static void main(String[] args) {
		Nif nif1= new Nif (280403020,'C');
		System.out.println(nif1);
	}

	//GETTERS I SETTERS
	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public char getLletra() {
		return lletra;
	}


	public void setLletra(char lletra) {
		this.lletra = lletra;
	}
	

	
}
