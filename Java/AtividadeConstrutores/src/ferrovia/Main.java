package ferrovia;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sigla, desc;
		int qtd_linhas;
		List<Station> est = new ArrayList<>();
		
		System.out.print("Insira a sigla: ");
		sc.nextLine();
		sigla = sc.nextLine();
		
		System.out.print("Insira a descri��o: ");
		desc = sc.nextLine();
		
		System.out.print("Insira a quantidade de linhas: ");
		qtd_linhas = sc.nextInt();
		
		Station sta = new Station(sigla, desc, qtd_linhas);
		
		est.add(sta);
		
		for(Station o: est) {
			System.out.println(o);
		}
		
		sc.close();
	}
}
