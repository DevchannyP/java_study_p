package ex2_set;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;


public class Exam2 {
	public static void main(String[] args) {
		Set<Integer> lotto = new TreeSet<>();
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		while(lotto.size() < 6) {
			lotto.add(rand.nextInt(45)+ 1);
		}
		System.out.println(lotto);
	}
}
