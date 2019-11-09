class ReverString{
	public static void reversString(char []arr,int left, int right){
			char temp;

			while(left<right){
			temp = arr[right];
			arr[right]=arr[left];
			arr[left]=temp;
			left++;
			right--;
		}

	}

	public static void printString(char []arr,int size){
		for (int i=0;i<size ;i++ ) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		char[] arr = {'p','r','e','e','t','i'};
 		printString(arr,6);
 		reversString(arr,0,5);
 		printString(arr,6);
	}
}