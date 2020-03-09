package br.fai.projeto6;

public class Main {

	public static void main(String[] args) {
		Main app= new Main();
		app.start();

	}

	private void start() {
		
		String[] carros = {"civic","gol","palio","uno"};
		
		for( String carro : carros) {
			System.out.println("Carros: "+ carro);
		}
		System.out.println("------");
		
		carros[1]= "l200";
		
		for( String carro : carros) {
			System.out.println("Carros: "+ carro);
		}
		System.out.println("------");
		
		int tamanhoDoNovoArray = carros.length + 1;
		
		String[] novoArrayDeCarros = new String[tamanhoDoNovoArray];
		
		for (int i = 0; i < carros.length; i++) {
			String carro = carros[i];
			novoArrayDeCarros[i] = carro;
		}
		
		novoArrayDeCarros[tamanhoDoNovoArray - 1]= "gol";
		
		for( String carro : novoArrayDeCarros) {
			System.out.println("Carros: "+ carro);
		}
	}

}
