package br.com.estudos.java.algoritmos;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public class ExecutaBuscaBinaria {

	public static void main(String[] args) {
		List<Integer> lista = new LinkedList<Integer>();
		lista.add(10);
		lista.add(25);
		lista.add(-1);
		lista.add(0);
		lista.add(32);
		
		System.out.println("Ordenando Lista na ordem Crescente:");
		Collections.sort(lista);
		System.out.println(lista);
		
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para a busca binária:"));
		int indice = Collections.binarySearch(lista, valor);
		
		System.out.println("O valor buscado está na posição: "+indice);

	}

}
