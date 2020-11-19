import java.util.Scanner;
class ReservationTest{
	public static void main(String [] args){
		
		String[][] arr = new String[10][10];
		
		initArr(arr);
		printArr(arr);
		Reservation(arr);
	}
	
	static void initArr(String [][] arr){
			for(int i=0;i<10;i++){
				for(int j=0;j<10;j++){
					if((int)(Math.random()*2)==0)
						arr[i][j] = " ";
				else arr[i][j] = "X";
			}
		}
	}
	
	static void printArr(String [][] arr){
		System.out.printf("  ");
		for(int k=1;k<=10;k++){
			System.out.printf(k+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++){
			System.out.printf("%s ",(char)('a'+i));
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void Reservation(String [][] arr){
		Scanner s = new Scanner(System.in);
		String ans;
		char row;
		int col, rowx;
		while(true){
			System.out.printf("�����Ͻðڽ��ϱ�(Y,y/N,n)?");
			ans = s.next();
			
			if(ans.equals("y")||ans.equals("Y")){	
			
				while(true){
					System.out.printf("�� ��? ");
					row = s.next().charAt(0);
					
					rowx = (int)(row-'a');
					
					System.out.printf("�� ��? ");
					
					col = s.nextInt();
					
					if(arr[rowx][col-1].equals("X")){
						System.out.printf("�̹� ����� �¼��Դϴ�. �ٸ� �¼��� �����ϼ���.\n");
					}
					else{
					arr[rowx][col-1]="X";
					System.out.printf("%s�� %d�� ���࿡ �����Ͽ����ϴ�.\n",row,col);
					printArr(arr);
					break;
					}
				}
			}
			else if(ans.equals("n")||ans.equals("N")){
				System.out.printf("����ý����� �����մϴ�.");
				break;
			}
		}
	}
}

