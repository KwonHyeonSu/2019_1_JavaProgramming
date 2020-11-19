import java.util.Scanner;

class Test6{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		

		System.out.printf("배열 크기: ");
		int size = s.nextInt();
		
		int [] arr = new int [size];
		
		ranArr(arr);
		printArr(arr);
		findArr(arr);
		rotate(arr);
		printArr(arr);
	}
	
	static void ranArr(int [] arr){
		System.out.printf("배열 성분 초기화 후 배열 성분 출력: ");
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*33+91);
		}

	}
	
	static void printArr(int [] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	static void findArr(int [] arr){
		int n=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<100){
				n+=1;
			}
		}
		System.out.printf("\n배열 성분 중 100보다 작은 수의 개수 : %d\n\n",n);
	}
	
	static void rotate(int [] arr){
		Scanner s = new Scanner(System.in);
		System.out.printf("몇 칸 로테이션? :");
		int n = s.nextInt();
		
		n %= arr.length;
		for(int i=0;i<n;i++){
			rotateR1(arr);
		}
		
	}
	
	static void rotateR1(int [] arr){
		int tmp;
		
		tmp=arr[arr.length-1];
		
		for(int i=arr.length-1;i>0;i--){
			arr[i]=arr[i-1];
		}
		arr[0]=tmp;

	}
	
	
}











