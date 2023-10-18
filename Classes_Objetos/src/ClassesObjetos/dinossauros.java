package ClassesObjetos;

public class dinossauros {
	private String carnivoros;
	private String herbivoros;
	private String onivoros;

	// construtor
	public dinossauros(String carnivoros, String herbivoros, String onivoros) {
		this.carnivoros = carnivoros;
		this.herbivoros = herbivoros;
		this.onivoros = onivoros;
	}

	public void setCarnivoros() {
		carnivoros = "Trex,Velociraptor,Allosaurus";
	}

	public void setHerbivoros() {
		herbivoros = "Trex,Stegosaurus,Triceratops";
	}

	public void setOnivoros() {
		onivoros = "Giganotossauro,Megalossauro,Tiranossauro";
	}

	public void cacando() {
		System.out.println("Hummm carninha gostosa");
	}

	public void acasalamento() {
		System.out.println("Essa femea é minhaa");
	}

	public void disputaterritorio() {
		System.out.println("Saia do meu territorio, bagulho vai ficar doidooo!!");
	}
}
