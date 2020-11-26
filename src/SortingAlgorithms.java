import java.util.Arrays;

public class SortingAlgorithms {

	private int[] array;
	
	
	// build constructor.
	public SortingAlgorithms() {}
	
	void quickSort(int[] array) {
		System.out.println("Array before quicksort: " + Arrays.toString(array));
		
		if (array == null || array.length == 0) return;
		
		// need first and last value
		quickSort(array, 0, array.length-1);
		
		System.out.println("Array after quicksort: " + Arrays.toString(array));
	}
	
	private void quickSort(int[] array, int start, int end) {
		if (start < end) {
			int partitionIndex = partition(array, start, end);
			
			quickSort(array, start, partitionIndex-1);
			quickSort(array, partitionIndex+1, end);
		}
	}
	
	private int partition(int[] array, int start, int end) {
		// take last value as pivot.
		int pivot = array[end];
		int i = start - 1;
		
		for (int j = start; j < end; j++) {
			if (array[j] <= pivot) {
				i++;
				
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		
		int temp = array[i+1];
		array[i+1] = array[end];
		array[end] = temp;
		
		return i+1;
	}
	
	private static void mergeSort(int[] array) {
		
		
	}
	
	
	
}
