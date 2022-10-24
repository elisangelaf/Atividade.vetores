package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.vetores.Vetor;

public class TesteDeTempoDoContem {
	
	public static void main(String[] args) {
		Vetor vetor = new Vetor();
		long inicio = System.currentTimeMillis();
		
		for(int i = 1; i < 100000; i++) {
		Aluno aluno = new Aluno();
		vetor.adiciona(aluno);
		
		}
		
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 10000.0;
		
		System.out.println("Tempo em segundo = " + tempo);
		

}

}
