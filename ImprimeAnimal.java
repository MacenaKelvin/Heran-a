package br.com.generation.heranca.correcao;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ImprimeAnimal {

	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
		
	Cachorro ca1 = new Cachorro();
	Cavalo cv = new Cavalo();
	
	cv.galopar();
	
	ca1.getDeveCorrer();
	
	System.out.print("Qual o Nome do cachorro: ");
	ca1.setNome( entrada.nextLine());
	
	System.out.println("O nome do cachorro é: " + ca1.getNome());
	JOptionPane.showMessageDialog(null, ca1.getNome());
	 

	}

}
