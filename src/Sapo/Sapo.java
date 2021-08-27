package Sapo;

public class Sapo {
   private static final int MAXIMO_DESCANSO = 500;
   private static final int MAXIMO_PULO = 50;

private static Object monitor = new Object();

  private String nome;
  private int distanciaTotal;
  private int distanciaPercorrida;
  private int ultimoPulo;
  private static int colocacao;

public Sapo(String nome, int distanciaTotal) {
    this.nome = nome;
    this.distanciaTotal = distanciaTotal;
}

public void Sapo1(String nome2, int distanciaTotal2) {
	// TODO Auto-generated constructor stub
}

private void pular() {

    ultimoPulo = (int) (Math.random() * MAXIMO_PULO);
    distanciaPercorrida += ultimoPulo;

    if(distanciaPercorrida > distanciaTotal) {
        distanciaPercorrida = distanciaTotal;
    }
}

private void avisarSituacao() {
    System.out.println(nome + " pulou " + ultimoPulo + " cm. A distância percorrida foi de "
        + distanciaPercorrida + "cm!");
}

private void cruzarLinhaDeChegada() {
    synchronized (monitor) {
        colocacao++;
        System.out.println("=> " + nome + " cruzou a linha de chegada em " 
            + colocacao + "º lugar!");
    }
}

private void descansar() {
    int tempo = (int) (Math.random() * MAXIMO_DESCANSO);
    try {
        Thread.sleep(tempo);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}

public void run() {
    while (distanciaPercorrida < distanciaTotal) {
        pular();
        avisarSituacao();
        descansar();
    }
    cruzarLinhaDeChegada();
}

public void start() {
	// TODO Auto-generated method stub
	
}

public void start1() {
	// TODO Auto-generated method stub
	
}

public void start2() {
	// TODO Auto-generated method stub
	
}
}