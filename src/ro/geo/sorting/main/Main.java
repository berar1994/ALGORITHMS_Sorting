package ro.geo.sorting.main;

import java.util.Scanner;

import ro.geo.sorting.bubblesort.BubblesortMain;

public class Main {

	
	public static void main(String[] args) {
		printMenu();
		Scanner sc = new Scanner(System.in);
		int choiceNumber = sc.nextInt();
	

		switch (choiceNumber) {
		case 1:
			BubblesortMain.run();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		default:
			System.out.println("No option selected");
			break;
		}
		
	}

	
	
	private static void printMenu() {
		System.out.println("SORTING ALGOTIHMS");
		System.out.println("1. Bubble sort");
		System.out.println("2. Quick sort");
		System.out.println("3. Merge sort");
		System.out.println("4. Insertion sort");
		System.out.println("5. Shell sort");
		System.out.println();
		System.out.println("Select one:");
	}
	

}