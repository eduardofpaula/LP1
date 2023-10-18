package ClassesObjetos;

public class lol {
	private String campeao;
	private String mapa;
	private int kills;

	// construtor
	public lol(String campeao, String mapa, int kills) {
		this.campeao = campeao;
		this.mapa = mapa;
		this.kills = kills;
	}

	public void setCampeao(String C) {
		campeao = "Chamber,Sage,Astra";
	}

	public void setMapa(int M) {
		if (M == 1) {
			System.out.println("Summonners Rift");
		}
	}

	public void setKills(int kills) {
		if (kills > 20) {
			System.out.println("ta jogando lol ou uma partida de basquete?");
		} else
			System.out.println("tu é proplayer");
	}

	public void engage() {
		System.out.println("STUNA STUNA");
	}

	public void tomeistun() {
		;
		System.out.println("USA CADINHOOOOO");
	}

	public void kiting() {
		System.out.println("OLHA O KITING DO GORDOX");
	}
}