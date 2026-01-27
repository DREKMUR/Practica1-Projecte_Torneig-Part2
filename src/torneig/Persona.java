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
	
	//GETTERS I SETTERS
	public String getNom_complet() {
		return nom_complet;
	}


	public void setNom_complet(String nom_complet) {
		this.nom_complet = nom_complet;
	}


	public Data getData_naixement() {
		return data_naixement;
	}


	public void setData_naixement(Data data_naixement) {
		this.data_naixement = data_naixement;
	}


	public Nif getNif() {
		return nif;
	}


	public void setNif(Nif nif) {
		this.nif = nif;
	}

	
	
}
