package ClassesObjetos;

//https://static.vecteezy.com/ti/vetor-gratis/p1/2936891-um-pacote-de-armas-dees-diferentes-vetor.jpg
public class armas {
	private String automatica;
	private String semiautomatica;
	private String bomba;

	public armas(String automatica, String semiautomatica, String bomba) {
		this.automatica = automatica;
		this.semiautomatica = semiautomatica;
		this.bomba = bomba;
	}

	public String setAutomatica() {
		return automatica = "AK 47,M4A1,Scar-L";
	}

	public String setSemiautomatica() {
		return semiautomatica = ("Glock,CBC 7022,Carabina R1");
	}

	public String setSingletarget() {
		return bomba = "Granada 40mm,Granada de atordoamento,Granada de Gás lacrimogenio";
	}

	public void puxargatilho() {
		System.out.println("Caixão e vela");
	}

	public void straif() {
		System.out.println("bracinho,bracinho,entrei quente!!!!!!");
	}

	public void smoke() {
		System.out.println("Smoka bomb B noob!!!!!");
	}
}
