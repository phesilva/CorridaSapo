package controller;

import java.util.Random;

public class ThreadSapo extends Thread {
	
	private int tamanhoPulo;
	private int distanciaMaxima;
	private int distanciaPercorrida;
	private int puloMaisAlto;
	
	static int posicao = 0;
	
	public ThreadSapo(int puloMaisAlto, int distanciaMaxima){
		this.puloMaisAlto = puloMaisAlto;
		this.distanciaMaxima = distanciaMaxima;
		
	}
	
	@Override
	public void run() {
		pularAteChegar();
	}
	
	public void pularAteChegar(){

		distanciaPercorrida = 0;
		
		//pra gerar valores aleatorios num certo intervalo...
		//random.nextInt((max - min) + 1) + min;
		Random random = new Random();
		
		while(distanciaPercorrida < distanciaMaxima){
			
			tamanhoPulo = random.nextInt(puloMaisAlto - 0 + 1) + 0;
			
			distanciaPercorrida += tamanhoPulo;
			
			System.out.println("Sapo #" + this.getId() + " deu um salto de " + tamanhoPulo + " metro(s) e percorreu um total de " + distanciaPercorrida + " metro(s)!");
			System.out.println();
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		posicao++;
		System.out.println("Sapo #" + this.getId() + " chegou em " + posicao + "o lugar!\n");
		
	}

}