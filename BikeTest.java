import java.util.Scanner;
class Bike{
	 
	 private int wheel;
	 private String color;
	 
	 public Bike(){
		 wheel = 2;
		 color = "�Ķ���";
	 }
	 public Bike(int i, String c){
		 setWheel(i);
		 setColor(c);
	 }
	 
	 void setWheel(int i){
		 if(i>=1&&i<=10){
			 wheel = i;
		 }
		 else wheel = 2;
	 }
	 
	 void setColor(String c){
		 color = c;
	 }
	int getWheel(){
		return wheel;
	}
	String getColor(){
		return color;
	}
 }
 
 class BikeTest{
	 public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		System.out.printf("������ ���� ��: ");
		int wheel = s.nextInt();;
		System.out.printf("������ ����: ");
		String color = s.next();
		
		Bike b = new Bike(wheel, color);
		
		System.out.printf("\n[ù��° ������ ����]\n������ ������: %d, ����: %s\n",b.getWheel(),b.getColor());
		
		Bike b2 = new Bike();
		
		System.out.printf("\n[�ι�° ������ ����]\n������ ������: %d, ����: %s\n",b2.getWheel(),b2.getColor());
		
		b2.setColor("������");
		System.out.printf("������ ������: %d, ����: %s\n",b2.getWheel(),b2.getColor());
	 }
 }