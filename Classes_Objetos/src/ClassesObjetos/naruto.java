package ClassesObjetos;

public class naruto {
	private String jutsu;
	private String bandana;
	private String aldeia;

	// construtor
	public naruto(String jutsu, String bandana, String aldeia) {
		this.jutsu = jutsu;
		this.bandana = bandana;
		this.aldeia = aldeia;
	}

	public void setJutsu(String jutsu) {
		if (jutsu == "Narutinho") {
			System.out.println("Rasengannnnnnnn");
		} else
			System.out.println("Sharingannnn");
	}

	public void setBandana(String B) {
		if (B == "bandana riscada") {
			System.out.println("RENEGADO");
		} else
			System.out.println("NINJA LIVRE");
	}

	public void setAldeia(String A) {
		A = "Konoha,Kirigakure,Amegakure";
	}

	public void corrida() {
		System.out.println("Corridinha do naruto");
	}

	public void shurinken() {
		System.out.println("Shuriken das Sombras");
	}

	public void pain() {
		System.out.println("China tem C");
	}
}