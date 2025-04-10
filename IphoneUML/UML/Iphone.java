package UML;

public class Iphone implements reprodutorMusical, aparelhoTelefonico, navegadorPhone{
	
		
	@Override
	public void tocar() {
		
		System.out.println("Reproduzindo música...");
	}

	@Override
	public void pausar() {
		
		System.out.println("Pausando música...");
		
	}

	@Override
	public void parar() {
	
		System.out.println("Música parada");
		
	}

	@Override
	public void fazerChamada(String numero) {
		
		System.out.println("Ligando para " + numero + "..." );
		
	}

	@Override
	public void receberChamada(String numero) {
		
		System.out.println("Recebendo chamada de "  + numero + "...");
		
	}
	
	@Override
	public void navegar(String url) {
		System.out.println("Navegando para " + url + "...");
		
	}

	@Override
	public void favoritar(String url) {
		System.out.println("Favoritando " + url + "...");
	}
	
}
