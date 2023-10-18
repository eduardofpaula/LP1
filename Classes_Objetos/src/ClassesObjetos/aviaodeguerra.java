package ClassesObjetos;
//https://p4.wallpaperbetter.com/wallpaper/294/539/679/war-thunder-4k-download-wallpaper-preview.jpg
public class aviaodeguerra {
	
	private String asa;
	private String helices;
	private double velocidademedia;
	private String modelo;
	private String nome;

	// construtor
	public aviaodeguerra(String nome, String modelo) {
		this.nome = nome;
		this.modelo = modelo;
	}

	public void setAsa(String a) {
		asa = a;
	}

	public void SetHelices(String h) {
		helices = "avião teco-teco";
	}

	public void setVelocidademedia(double vel) {
		velocidademedia = 132.50;
	}

	public void setModelo(String m) {
		modelo = "4x4 brabo";
	}

	public void setnome(String n) {
		nome = "Avião muito top";
	}

	public void ligar() {
		System.out.println("Bora voar");
	}

	public void desligar() {
		System.out.println("Hora de se retirar");
	}

	public void oleo() {
		System.out.println("Ta faltando oleo no motor recuta");
	}
}
