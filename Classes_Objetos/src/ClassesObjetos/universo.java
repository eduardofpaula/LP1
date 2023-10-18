package ClassesObjetos;

import java.util.Scanner;

public class universo {

	private String estrela;
	private String planeta;
	private String satelite;

	// construtor
	public universo() {
		this.estrela = estrela;
		this.planeta = planeta;
		this.satelite = satelite;
	}

	public void setEstrela(String E) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("FAÇA UM PEDIDO: ");
		String estrela = scanner.next();
		System.out.println("SEU PEDIDO FOI: " + estrela);
		scanner.close();
	}

	public void setPlaneta(String P) {
		String[] Planeta;
		Planeta = new String[5];
		Planeta[0] = "Terra";
		Planeta[1] = "Mercurio";
		Planeta[2] = "Uranio";
		Planeta[3] = "Jupiter";
		Planeta[4] = "Saturno";
	}

	public String getPlaneta() {
		return planeta;
	}

	public void setSatelite(String S) {
		System.out.println("CORRE QUE O ELON MUSK TA QUERENDO SOLTAR MAIS UM SATELITEEEE");
	}

	public void aliens() {
		System.out.println("Invasão alienigenaaa correeee");
	}

	public void buraconegro(String imensa) {
		imensa = "Thais carla";
	}
}