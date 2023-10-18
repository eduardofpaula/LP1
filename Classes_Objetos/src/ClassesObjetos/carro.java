package ClassesObjetos;

//https://123carros.com.br/files/wp-content/uploads/2018/05/flat-car-vector-collection-700x445.jpg
public class carro {
	private String funcao;
	private String modelo;
	private int veltotal;

	// construtor
	public carro(String funcao, String modelo, int veltotal) {
		this.funcao = funcao;
		this.modelo = modelo;
		this.veltotal = veltotal;
	}

	public void setFuncao(String F) {
		funcao = "Esportivo,Luxo,Passeio";
	}

	public void setModelo(String M) {
		modelo = "Hertz,Sedan,Suv,Picape";
	}

	public void setVeltotal(int V) {
		veltotal = 300;
	}

	public void ligarcarro() {
		System.out.println("VRUMMM VRUMM acelerar");
	}

	public void desligarcarro() {
		System.out.println("Bora pra garagem");
	}

	public void drift() {
		System.out.println("Tokio Drift Gaijin");
	}

	public void nomeDoMetodo() {
	}
}
