package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //usado para ler dados do teclado
		
		// criando Map (coleção chave valor)
		// LinkedHashMap - velocidade intermediária e elementos na ordem em que são adicionados
		Map<String, Integer> votes = new LinkedHashMap<>(); 

		//Lendo o caminho onde está o arquivo - c:\temp\votacao.txt
		System.out.println("Enter file full path: ");
		String path = scan.nextLine();

		//try-catch para a leitura do arquivo.
		//BufferedReader - lê o texto de um fluxo de entrada de caracteres
		//FileReader - é usado para ler um arquivo de uma unidade de disco
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine(); //lê cada linha do arquivo
			while(line != null) {
				
				String[] fields = line.split(",");
				String name = fields[0];
				int count = Integer.parseInt(fields[1]);
				
				if(votes.containsKey(name)) {
					int votesSomar = votes.get(name);
					votes.put(name, count + votesSomar);
				}else {
					votes.put(name, count);
				}
				
				line = br.readLine();
			}
			
			for(String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}

	}

}
