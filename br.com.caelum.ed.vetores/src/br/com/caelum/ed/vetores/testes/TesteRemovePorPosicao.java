package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.vetores.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteRemovePorPosicao {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
		aluno1.setNome("Rafael");
		aluno2.setNome("Paulo");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(aluno1);
		lista.adiciona(aluno2);
		
		lista.remove(0);
		
		
		System.out.println(lista);
		

}

}
