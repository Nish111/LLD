package assign114;

import java.util.PriorityQueue;

public class SomeClass implements Something {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SomeClass sc = new SomeClass();
		System.out.println(sc.value); // 4
		System.out.println(sc.value1); // 5
		System.out.println(sc.value2); // 6
		System.out.println(sc.value3); // 7
		// by default final so cannot be reassigned
		//sc.value=8;
		//sc.value1=9;
		//sc.value2=10;
		//sc.value3=11;
		System.out.println(sc.value); // 4
		System.out.println(sc.value1); // 5
		System.out.println(sc.value2); // 6
		System.out.println(sc.value3); // 7
		PriorityQueue<Integer> pq = new PriorityQueue<>();
	}

}
