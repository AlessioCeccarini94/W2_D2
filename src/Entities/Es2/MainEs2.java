package Entities.Es2;

import java.util.List;

public class MainEs2 {
	public static void main(String[] args) {
		List<Integer> li = Es2.numList(5);
		System.out.println(li);

		List<Integer> revli = Es2.reverseList(li);
		System.out.println(revli);


		Es2.evenOdd(li, true);
	}
}
