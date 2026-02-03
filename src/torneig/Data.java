package torneig;

/**
 * Representa una data composta per dia, mes i any.
 *
 * <p>La classe permet crear objectes Data i obtenir-ne una representació
 * en format "dia/mes/any". També inclou els mètodes d'accés i modificació
 * dels seus atributs.</p>
 *
 * @author Diego Mejías Peña
 * @version 1.0
 */
public class Data {

    private int dia;
    private int mes;
    private int any;

    /**
     * Crea una nova instància de Data amb els valors indicats.
     *
     * @param dia dia del mes
     * @param mes mes de l'any
     * @param any any complet
     */
    public Data(int dia, int mes, int any) {
        this.dia = dia;
        this.mes = mes;
        this.any = any;
    }

    /**
     * Retorna la data en format "dia/mes/any".
     *
     * @return representació textual de la data
     */
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + any;
    }

    /**
     * Obté el dia del mes.
     *
     * @return el dia
     */
    public int getDia() { return dia; }

    /**
     * Estableix un nou dia.
     *
     * @param dia nou dia
     */
    public void setDia(int dia) { this.dia = dia; }

    /**
     * Obté el mes de l'any.
     *
     * @return el mes
     */
    public int getMes() { return mes; }

    /**
     * Estableix un nou mes.
     *
     * @param mes nou mes
     */
    public void setMes(int mes) { this.mes = mes; }

    /**
     * Obté l'any.
     *
     * @return l'any
     */
    public int getAny() { return any; }

    /**
     * Estableix un nou any.
     *
     * @param any nou any
     */
    public void setAny(int any) { this.any = any; }
}