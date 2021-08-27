
package view;

import controller.ThreadSapo;

public class main {
	
	public static void main(String[] args) {
		
		int puloMaisAltoPermitido = 4;
		int distanciaAPercorrer = 6;
		
		System.out.println("********************");
		System.out.println("*QUE COMECE O JOGO!*");
		System.out.println("********************\n");
		
		System.out.println("Pulo mais alto permitido: " + puloMaisAltoPermitido + " metros\n");
		System.out.println("Distancia a percorrer: " + distanciaAPercorrer + " metros\n");
		
		for(int i = 0; i < 5; i++){
			Thread sapo = new ThreadSapo(puloMaisAltoPermitido, distanciaAPercorrer);
			sapo.start();
		}
	}

}