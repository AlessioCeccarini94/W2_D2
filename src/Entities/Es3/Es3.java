//Esercizio #3
//Scrivere una classe Java che permetta di gestire una rubrica telefonica. La lista dei contatti
// è realizzata con una HashMap in cui le chiavi sono i nomi delle persone e i valori sono i numeri di telefono. Realizzare
//1. L'inserimento di una coppia «Nome, telefono>
//2. La cancellazione di una coppia «Nome, telefono > a partire dal nome
//3. La ricerca di una Persona di cui si conosce il numero di telefono
//4. La ricerca del numero di telefono di una Persona di cui si conosce il Nome
//5. La stampa di tutti i contatti con nome e numero.


package Entities.Es3;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Es3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rndm = new Random();
		Users alessio = new Users("Alessio", "Ceccarini");
		Users giangiorgio = new Users("Giangiorgio", "Rossi");
		Users pupo = new Users("Pupo", "Nazionale");
		Users celentano = new Users("Adriano", "Celentano");

		HashMap<Integer, Users> map = new HashMap<>();

		map.put(7673823, alessio);
		map.put(7673824, giangiorgio);
		map.put(7673822, pupo);
		map.put(7673821, celentano);

		System.out.println(map);
		System.out.println(map.get(7673823));
		map.remove(7673821, celentano);
		System.out.println(map);
	}
}
