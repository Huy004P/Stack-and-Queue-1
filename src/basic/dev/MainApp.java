package basic.dev;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Bài Tập 2
		Stack<Integer> s = new Stack<>();
		System.out.println();
		System.out.println("Nhập Vào Vị Trí Phần Tử Muốn Xóa");
		int n = sc.nextInt();
		s.push(10);
		s.push(22);
		s.push(73);
		s.push(15);
		s.push(04);

		// A
		int sSoPhanTu = s.size();
		System.out.println("Số Phần Tử Của Stack Là: " + sSoPhanTu);

		// B
		if (n <= s.size()) {
			int print = s.get(n - 1);
			System.out.println("Nội Dung Của Phần Tử n Là: " + print);
		}

		// C
		System.out.print("Stack s: ");
		for (int i = 0; i < s.size(); i++) {
			System.out.print(s.get(i) + " ");
		}

		// D
		System.out.println();
		s.remove(n - 1);
		System.out.print("Stack s Sau Khi Xóa Phần Tử n: ");
		for (int i = 0; i < s.size(); i++) {
			System.out.print(s.get(i) + " ");
		}


		// Bài Tập 3
		System.out.println();
		System.out.println("------------");
		Queue<Integer> a = new LinkedList<>();
		System.out.println("Nhập Vào Vị Trí Phần Tử Muốn Xóa");
		int m = sc.nextInt();
		a.add(10);
		a.add(22);
		a.add(73);
		a.add(15);
		a.add(04);

		// A
		int qSoPhanTu = a.size();
		System.out.println("Số Phần Tử Của Queue Là: " + qSoPhanTu);
		
		// B
		int answer = 0;
		for (Integer b : a) {
			answer++;
			if (answer == m) {
				System.out.println("Nội Dung Của Phần Tử n Là: " + b);
			}
		}

		// C
		System.out.print("Queue a: ");
		for (Integer b : a) {
			System.out.print(b + " ");
		}

		// D
		System.out.println();
		a.remove(m - 1);
		System.out.print("Queue a Sau Khi Xóa Phần Tử m: ");
		for (Integer b : a) {
			System.out.print(b + " ");
		}
		System.out.println();
		System.out.println("-----------");

		
		// Bài Tập 4: Đảo Ngược Stack
		Stack<Integer> s1 = new Stack<>();
		while (s.size() > 0) {
			s1.push(s.pop());
		}
		System.out.print("Stack s Sau Khi Đảo Ngược ");
		for (Integer s2 : s1) {
			System.out.print(s2 + " ");
		}

		
		// Bài Tập 5: Đảo Ngược Queue
		Stack<Integer> as = new Stack<>();
		Queue<Integer> a1 = new LinkedList<>();
		while (a.size() > 0) {
			as.push(a.remove());
		}
		while (as.size() > 0) {
			a1.add(as.pop());
		}
		System.out.println();
		System.out.print("Queue a Sau Khi Đảo Ngược ");
		for (Integer a2 : a1) {
			System.out.print(a2 + " ");
		}
	}

}
