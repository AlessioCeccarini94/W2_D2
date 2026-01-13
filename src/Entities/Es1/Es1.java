//Esercizio #1
//Scrivere un programma che chieda all'utente di inserire un intero N che rappresenti
// il numero di elementi da inserire e poi gli chieda di inserire N parole. II programma dovrà:
//- stampare tutte le parole duplicate
//- stampare il numero di parole distinte
//- stampare l'elenco delle parole distinte
//Utilizzare l'interfaccia Set e l'implementazione HashSet


package Entities.Es1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Es1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		Set<String> unique = new HashSet<>();
		Set<String> duplicate = new HashSet<>();

		for (int i = 0; i < n; i++) {
			String word = sc.nextLine();

			if (!unique.add(word)) {
				duplicate.add(word);
			}
		}
		System.out.println("duplicate word: " + duplicate);
		System.out.println("unique words: " + unique);
		System.out.println("N duplicate word: " + duplicate.size());
	}
}
