// Sergey Arkhipov - Java. Алгоритмы.(playlist)
// Java. Поиск минимального элемента в массиве. (Finding the minimum element in an array)
// https://www.youtube.com/watch?v=J8CbZYnJ5O8&list=PL5BhKu-LkR_0mDGftRWeaakqGuYE1ToGG&index=1&t=2s
package minimum;
public class MinArray {

	public static void main(String[] args) {
		int[] array = new int[] {64, 42, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36};
		int minValue = array[0];
		int minIndex = 0;
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
				minIndex = i;
			}
			
		}
		System.out.println("Minimum value in Array: " + minValue);
		System.out.println("Index of minimum value in Array: " + minIndex);
	}

}
