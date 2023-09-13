/*
Author: 
Date: 

Description: 
 */
import java.util.Comparator;

public class Exercise23_03 {
	public static void main(String[] args) {
		Integer[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
		quickSort(list);
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}

		System.out.println();
		Circle[] list1 = {new Circle(2), new Circle(3), new Circle(2),
				new Circle(5), new Circle(6), new Circle(1), new Circle(2),
				new Circle(3), new Circle(14), new Circle(12)};
		quickSort(list1, new GeometricObjectComparator());
		for (int i = 0; i < list1.length; i++) {
			System.out.println(list1[i] + " ");
		}
	}

	public static <E extends Comparable<E>> void quickSort(E[] list) {
		 quickSort(list, 0, list.length - 1);
	}
	
	private static <E extends Comparable<E>> void quickSort(E[] list, int low, int high) {
	    if (low < high) {
	        int pivotIndex = partition(list, low, high);
	        quickSort(list, low, pivotIndex - 1);
	        quickSort(list, pivotIndex + 1, high);
	    }
	}

	private static <E extends Comparable<E>> int partition(E[] list, int low, int high) {
	    E pivot = list[high];
	    int i = low - 1;

	    for (int j = low; j < high; j++) {
	        if (list[j].compareTo(pivot) <= 0) {
	            i++;
	            // Swap list[i] and list[j]
	            E temp = list[i];
	            list[i] = list[j];
	            list[j] = temp;
	        }
	    }

	    // Swap list[i+1] and list[high] (or the pivot)
	    E temp = list[i + 1];
	    list[i + 1] = list[high];
	    list[high] = temp;

	    return i + 1;
	}

	public static <E> void quickSort(E[] list, Comparator<? super E> comparator) {
		quickSort(list, 0, list.length - 1, comparator);
	}
	
	private static <E> void quickSort(E[] list, int low, int high, Comparator<? super E> comparator) {
	    if (low < high) {
	        int pivotIndex = partition(list, low, high, comparator);
	        quickSort(list, low, pivotIndex - 1, comparator);
	        quickSort(list, pivotIndex + 1, high, comparator);
	    }
	}

	private static <E> int partition(E[] list, int low, int high, Comparator<? super E> comparator) {
	    E pivot = list[high];
	    int i = low - 1;

	    for (int j = low; j < high; j++) {
	        if (comparator.compare(list[j], pivot) <= 0) {
	            i++;
	            // Swap list[i] and list[j]
	            E temp = list[i];
	            list[i] = list[j];
	            list[j] = temp;
	        }
	    }

	    // Swap list[i+1] and list[high] (or the pivot)
	    E temp = list[i + 1];
	    list[i + 1] = list[high];
	    list[high] = temp;

	    return i + 1;
	}
}