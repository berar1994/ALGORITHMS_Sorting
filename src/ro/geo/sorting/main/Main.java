package ro.geo.sorting.main;

import java.util.Scanner;

import ro.geo.sorting.bubblesort.BubblesortMain;
import ro.geo.sorting.insertionsort.InsertionsortMain;
import ro.geo.sorting.mergesort.MergeSortMain;
import ro.geo.sorting.quicksort.QuickSortMain;

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
			QuickSortMain.run();
			break;
		case 3:
			MergeSortMain.run();
			break;
		case 4:
			InsertionsortMain.run();
			break;
		case 5:
			break;
		default:
			System.out.println("No option selected");
			break;
		}
		
		sc.close();
		
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
