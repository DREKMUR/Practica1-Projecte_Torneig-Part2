package torneig;
/**
* @Author -- Diego Mejías Peña
  @Version -- 1.0
*/
public class Persona {

	String nom_complet;
	Data data_naixement;
	Nif nif;
	
	
	public Persona(String nom_complet, Data data_naixement, Nif nif) {
		this.nom_complet = nom_complet;
		this.data_naixement = data_naixement;
		this.nif = nif;
	}

}
