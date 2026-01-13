//Esercizio #2
//Scrivere una funzione che accetti un intero N e restituisca una lista ordinata
// di N interi casuali da 0 a 100.
// Scrivere una seconda funzione che accetti una lista e restituisca
// una nuova lista composta dagli elementi della prima lista seguiti dagli stessi elementi disposti
// in ordine inverso.
// Scrivere una terza funzione che accetti una lista ed un booleano:
// se il booleano è true stampa i valori in posizioni pari, altrimenti stampa i valori in
// posizioni dispari. Creare una main che utilizzi le tre funzioni.
// Utilizzare l'interfaccia List e l'implementazione ArrayList.

package Entities.Es2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Es2 {
	public static List<Integer> numList(int n) {
		Random rndm = new Random();
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			list.add(rndm.nextInt(101));
		}
		Collections.sort(list);
		return list;
	}

	public static List<Integer> reverseList(List<Integer> list) {
		List<Integer> revList = new ArrayList<>();
		for (int i = list.size() - 1; i >= 0; i--) {
			revList.add(list.get(i));
		}
		return revList;
	}

	public static void evenOdd(List<Integer> list, boolean odds) {
		for (int i = 0; i < list.size(); i++) {
			if (odds && i % 2 == 0) {
				System.out.println(list.get(i));
			} else if (!odds && 2 != 0) {
				System.out.println(list.get(i));
			}
		}

	}
}
