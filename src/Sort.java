
public class Sort {	
	
	//ð������
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
	 * ��һ�θĽ���ð������Ľ�����������ĳһ�εı����У����û�з���Ԫ�ؽ�������˵�������Ѿ��ɹ���
	 * ���ԣ��Ľ����ݾ��ǣ����û�з���Ԫ�ؽ�����������ɹ�
	 * �Ľ���Ч������ĳ�α����Ľ���Ѿ����򣬾Ͳ�������������Ǽ��ٱ����Ĵ���
	 * @param arr
	 */
	public static void BubbleSort1(int[] arr) {
		int tmp = 0;
		boolean isSwap = true; //�Ƿ����˽���
		int j = arr.length;
		while(isSwap) {
			isSwap = false;
			for (int i=1;i<j;i++) {
				if (arr[i-1] > arr[i]) {
					isSwap = true;	//�����˽���
					tmp = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = tmp;
				}
			}
			
			j--;
		}
	}
	
	/**
	 * �ڶ��θĽ�����ð�������ĳһ�α��������У����������Ԫ�ؽ�������ô����һ�εı�����˵��
	 * Ԫ�ؽ�����λ��֮���Ԫ���������
	 * �Ľ������ݣ�Ԫ�ؽ���λ��֮���Ԫ���������
	 * �Ľ���Ч�����ڵڶ��θĽ��Ļ����ϣ�ÿһ�α�����Ҳ�������Ҫ�Ƚϵ�Ԫ��
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
	 * �������򣬴�����ڶ���Ԫ�ؿ�ʼ��������뵽ǰ��ĺ���λ���ϣ�ʹ����ǰ�����������
	 * �����ͽ������Ϊ�������֣�����ǰ��������������������Ĵ���������
	 * ����������꣬�������һ������������
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
