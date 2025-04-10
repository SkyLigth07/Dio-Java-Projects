package UML;

public class Main {
		public static void main(String[] args) {
	        Iphone meuIphone = new Iphone();
	        
	        // Testando o reprodutor musical
	        meuIphone.tocar();
	        meuIphone.pausar();
	        meuIphone.parar();
	        
	        // Testando o aparelho telefônico
	        meuIphone.fazerChamada("123456789");
	        meuIphone.receberChamada("987654321");
	        
	        // Testando o navegador de internet
	        meuIphone.navegar("www.exemplo.com");
	        meuIphone.favoritar("www.exemplo.com");
		
	}

}
