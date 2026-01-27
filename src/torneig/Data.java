package torneig;

/**
 * @Author -- Diego Mejías Peña
 * @Version -- 1.0
 */
public class Data {
	int dia;
	int mes;
	int any;

	public Data(int dia, int mes, int any) {
		this.dia = dia;
		this.mes = mes;
		this.any = any;
	}

	@Override
	public String toString() {
		return dia+"/"+mes+"/"+any;
	}

	public static void main(String[] args) {

		Data provatada = new Data(9, 8, 2001);
		System.out.println(provatada);

	}
}