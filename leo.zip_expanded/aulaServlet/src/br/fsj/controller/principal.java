package br.fsj.controller;

import java.util.Scanner;

import br.fsj.model.Aluno;
import br.fsj.model.Pessoa;
import br.fsj.model.Professor;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int m[] = new  int[2];
	        float mediaT;
	        
	        Scanner teclado = new Scanner(System.in);
	        Pessoa p = new Pessoa();
	        
	        //professor
	        
	        Professor professor = new Professor();
	        System.out.println("Digite o nome do professor:");
	        professor.setNome(teclado.next());
	        System.out.println("Digite a matricula do professor:");
	        professor.setCpf(teclado.nextInt());
	        System.out.println(professor.getNome());
	        
	        //aluno 
	        
	        Aluno aluno = new Aluno();
	        mediaT = 0;
	        for(int i=0; i<=2; i++) {
	        System.out.println("Digite o nome do aluno:");
	        aluno.setNome(teclado.next());
	        System.out.println("Digite a matricula do aluno:");
	        aluno.setMatricula(teclado.next());
	        System.out.println("Digite a nota 1 do aluno ");
	        aluno.setNota1(teclado.nextFloat());
	        System.out.println("Digite a nota 2 do aluno ");
	        aluno.setNota2(teclado.nextFloat());
	        aluno.calcularMedia(aluno.getNota1(), aluno.getNota2());
	        System.out.println("A media e:" + aluno.getMedia()+ " situacao =" + aluno.getSituacao());
	        mediaT=mediaT+aluno.getMedia();
	        }
	        mediaT=mediaT/3;
	        System.out.print("A media total da turma e:" +mediaT);
	    
	    }
	}


