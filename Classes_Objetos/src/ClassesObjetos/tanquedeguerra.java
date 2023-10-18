package ClassesObjetos;

public class tanquedeguerra {
	// https://p4.wallpaperbetter.com/wallpaper/294/539/679/war-thunder-4k-download-wallpaper-preview.jpg
	private String canhao;
	private int municao;
	private String marca;
	private String modelo;
	private String funcao;
	private String placa;
	private String cor;

	// construtor
	public tanquedeguerra(String canhao, String modelo, String cor) {
		this.canhao = canhao;
		this.modelo = modelo;
		this.cor = cor;
	}

	// metodo de acesso setter
	public void setPlaca(String p) {
		placa = p;
	}

	public void setFuncao(String x) {
		funcao = x;
	}

	public void setMunicao(int a) {
		municao = a;
	}

	public int getMunicao() {
		return municao;
	}

	public void setModelo() {
		this.modelo = "tanque locao";
	}

	public void ligar() {
		System.out.println("Broa botar pra quebrar");
	}

	public void desligar() {
		System.out.println("Retirar tropasss");
	}

	public String getMarca() {
		return marca = "Hondaa,Mercedes top";
	}
}