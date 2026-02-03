package torneig;

/**
 * Representa una persona amb nom complet, data de naixement i NIF.
 *
 * <p>Aquesta classe encapsula la informació personal bàsica necessària
 * per identificar un participant d'un torneig.</p>
 *
 * @author Diego Mejías Peña
 * @version 1.0
 */
public class Persona {

    private String nom_complet;
    private Data data_naixement;
    private Nif nif;

    /**
     * Crea una nova persona amb les dades indicades.
     *
     * @param nom_complet nom i cognoms de la persona
     * @param data_naixement data de naixement
     * @param nif document identificatiu
     */
    public Persona(String nom_complet, Data data_naixement, Nif nif) {
        this.nom_complet = nom_complet;
        this.data_naixement = data_naixement;
        this.nif = nif;
    }

    /**
     * Obté el nom complet de la persona.
     *
     * @return el nom complet
     */
    public String getNom_complet() { return nom_complet; }

    /**
     * Estableix el nom complet de la persona.
     *
     * @param nom_complet nou nom complet
     */
    public void setNom_complet(String nom_complet) { this.nom_complet = nom_complet; }

    /**
     * Obté la data de naixement.
     *
     * @return la data de naixement
     */
    public Data getData_naixement() { return data_naixement; }

    /**
     * Estableix la data de naixement.
     *
     * @param data_naixement nova data de naixement
     */
    public void setData_naixement(Data data_naixement) { this.data_naixement = data_naixement; }

    /**
     * Obté el NIF de la persona.
     *
     * @return el NIF
     */
    public Nif getNif() { return nif; }

    /**
     * Estableix el NIF de la persona.
     *
     * @param nif nou NIF
     */
    public void setNif(Nif nif) { this.nif = nif; }
}