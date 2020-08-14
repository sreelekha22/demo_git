package array_puzzle;

public class Array_Puzzle {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
		System.out.println("combinations for desired sum.");
		arr_puzzle(arr,10);

	}
	public static void arr_puzzle(int[] arr , int sum) {
		int i;int j;
		for(i=0;i<arr.length;i++) {
			for(j = arr.length-1;j>=0;j--) {
				if(((arr[i]+arr[j])==sum) && (i!=j)) {
					System.out.println(arr[i] + " " + arr[j]);
				}
				if((i==j)||(i>j)) {
					break;
				}
			}
		}
	}
}
