package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		/*List criada usando a interface ArrayList*/
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		/* Adiciona um item a partir da posição 2 da lista */
		list.add(2, "Marco");
		
		/* Forma de verificar o tamanho de uma lista (igual .lenght de array) */
		System.out.println(list.size());
		

		/* ForEach para percorrer a lista e imprimir todos valores */
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------");
		/* Remover da lista todos os itens que inicia pela letra M */
		list.removeIf(x -> x.charAt(0) == 'M');
		
		/* ForEach para percorrer a lista e imprimir todos valores */
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------");
		/*Encontrar na lista o index de um valor, caso false retorna -1*/
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Bob: " + list.indexOf("Marco"));
		System.out.println("---------------");
		
		/*Converte a list em stream utiliza o filtro pra encontrar todos valores que iniciam com A
		 e converter a stream em list novamente*/
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		/* ForEach para percorrer a lista e imprimir todos valores */
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("---------------");
		/*Converte a list em stream, utiliza o filter pra encontrar o primeiro item que se inicia por A, e retorna null caso nao encontre nada*/
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
