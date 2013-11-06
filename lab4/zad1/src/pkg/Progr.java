package pkg;

import java.util.LinkedList;
import java.util.Scanner;

public class Progr {
	public static LinkedList<Shape> shapeList = new LinkedList<Shape>();

	public static void main(String[] args) {
		for (;;) {
			displayMenu();
			Scanner in = new Scanner(System.in);
			String str = in.nextLine();
			int option = Integer.valueOf(str).intValue();
			switch (option) {
			case 1:
				shapeList.add(new Square());
				break;
			case 2:
				shapeList.add(new Rectangle());
				break;
			case 3:
				shapeList.add(new Triangle());
				break;
			case 4:
				displayList();
				break;
			case 5:
				return;
			}
		}
	}

	public static void displayList() {
		for (Shape el : shapeList) {
			el.draw();
			System.out.println();
		}
		System.out.print(shapeList.size());
		System.out.println(" element(s) in the list.");
		System.out.println();
	}

	public static void displayMenu() {
		System.out.println("1. Add Square to the list.");
		System.out.println("2. Add Rectangle to the list.");
		System.out.println("3. Add Triangle to the list.");
		System.out.println("4. Display the list.");
		System.out.println("5. Exit program.");
		System.out.println();
	}
}
