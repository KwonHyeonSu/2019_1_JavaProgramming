import java.util.Scanner;

class Test6{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		

		System.out.printf("�迭 ũ��: ");
		int size = s.nextInt();
		
		int [] arr = new int [size];
		
		ranArr(arr);
		printArr(arr);
		findArr(arr);
		rotate(arr);
		printArr(arr);
	}
	
	static void ranArr(int [] arr){
		System.out.printf("�迭 ���� �ʱ�ȭ �� �迭 ���� ���: ");
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
		System.out.printf("\n�迭 ���� �� 100���� ���� ���� ���� : %d\n\n",n);
	}
	
	static void rotate(int [] arr){
		Scanner s = new Scanner(System.in);
		System.out.printf("�� ĭ �����̼�? :");
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











