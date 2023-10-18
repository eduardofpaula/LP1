package ClassesObjetos;

//https://cdn.espn.com.br/image/wide/622_38d219c6-d88d-3338-8c98-7d7d2c943a17.jpg
public class futebol {
	// contendo 3 atributos, 3 métodos , métodos de acesso e construtor
	private String bola;
	private String placar;
	private String times;

	// construtor
	public futebol(String bola, String placar, String times) {
		this.bola = bola;
		this.placar = placar;
		this.times = times;
	}

	public void setBola(String b) {
		bola = "jabulaniiii";
	}

	public void setPlacar(String p) {
		placar = "3x2";
	}

	public void setTimes(String times) {
		times = "São paulo,Corinthians,Flamengo";
	}

	public void apito() {
		System.out.println("E começa o jogoooo");
	}

	public void bolanarede() {
		System.out.println("GOLAÇOOOOOOO");
	}

	public void setfalta() {
		System.out.println("FALTAAAA, cobre a faltaa");
	}

}