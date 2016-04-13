
public class Sort {	
	
	public static void BubbleSort(int[] arr) {
		int tmp = 0;
		for (int i=0;i<arr.length;i++) {
			for (int j=1;j<arr.length-i;j++) {
				if (arr[j-1] > arr[j]) {
					tmp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
		int[] arr = new int[]{
				2,3,1,0,5,8,7,9,10,6
		};
		
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		BubbleSort(arr);
		
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
