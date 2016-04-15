
public class Sort {	
	
	//冒泡排序
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
	
	/**
	 * 第一次改进：冒泡排序的结束条件：在某一次的遍历中，如果没有发生元素交换，则说明排序已经成功。
	 * 所以，改进依据就是：如果没有发生元素交换，则排序成功
	 * 改进的效果：当某次遍历的结果已经有序，就不会继续遍历，是减少遍历的次数
	 * @param arr
	 */
	public static void BubbleSort1(int[] arr) {
		int tmp = 0;
		boolean isSwap = true; //是否发生了交换
		int j = arr.length;
		while(isSwap) {
			isSwap = false;
			for (int i=1;i<j;i++) {
				if (arr[i-1] > arr[i]) {
					isSwap = true;	//发生了交换
					tmp = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = tmp;
				}
			}
			
			j--;
		}
	}
	
	/**
	 * 第二次改进，在冒泡排序的某一次遍历过程中，如果发生了元素交换，那么对这一次的遍历来说，
	 * 元素交换的位置之后的元素是有序的
	 * 改进的依据：元素交换位置之后的元素是有序的
	 * 改进的效果：在第二次改进的基础上，每一次遍历中也会减少需要比较的元素
	 * @param arr
	 */
	public static void BubbleSort2(int[] arr) {
		int tmp = 0;
		int index = arr.length;
		int j = index;
		while (index > 0) {
			for (int i=1;i<j;i++) {
				index = 0;
				if (arr[i-1] > arr[i]) {
					tmp = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = tmp;
					index = i;
				}
			}
			j = index;
		}
	}
	
	/**
	 * 插入排序，从数组第二个元素开始，将其插入到前面的合适位置上，使得它前面的数据有序。
	 * 这样就将数组分为两个部分：索引前面的有序数组和索引后面的待排序数组
	 * 将数组遍历完，数组就是一个有序数组了
	 * @param arr
	 */
	public static void InsertSort(int[] arr) {
		int tmp;
		for (int i=1;i<arr.length;i++) {
			for (int j=i;j>0;j--) {
				if (arr[j] < arr[j-1]) {
					tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
				} else {
					break;
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
		
		InsertSort(arr);
		
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		//test
//		for (int i=10;i>=0;i--) {
//			System.out.println(i);
//		}
	}
}
