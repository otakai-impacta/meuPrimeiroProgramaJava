/* Meu primeiro programa Java*

 Este programa mostra ao aluno:
  1) Que um programa Java é construído dentro de um projeto Java.
  2) Todo programa Java deve tere uma classe com um método main.
  3) Como exibir informações no terminal (console) do Java.
  4) Como ler uma string do terminal (console) do Java.
 
 */
package meuPrimeiroProgramaJava;

import java.util.Scanner;

/**
 * @author otakai
 * Data: 09/12/2020 
 */
public class Principal { 
	public static void main(String[] args) {
		
		// Saldação e pergunta o nome.
		System.out.println("Olá amigo!\nQual é o seu nome?");
		
		// Ler o nome.
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		// Saldação para o nome lido.
		System.out.printf("Olá %s!\n", nome);
		
		// NOTA: Implementar leitura da Idade e exibi-la.
		
		// Perguntar a Idade
		System.out.printf("%s, qual é a sua idade?", nome);
		
		// Ler idade para elogiar.
		Integer idade = in.nextInt();
		
		System.out.printf("%d! Puxa! Como você é jovem!!!", idade);
		
	}

}
