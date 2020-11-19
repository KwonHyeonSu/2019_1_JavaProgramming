import java.util.Scanner;
class Bike{
	 
	 private int wheel;
	 private String color;
	 
	 public Bike(){
		 wheel = 2;
		 color = "파란색";
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
		
		System.out.printf("자전거 바퀴 수: ");
		int wheel = s.nextInt();;
		System.out.printf("자전거 색상: ");
		String color = s.next();
		
		Bike b = new Bike(wheel, color);
		
		System.out.printf("\n[첫번째 자전거 정보]\n자전거 바퀴수: %d, 색상: %s\n",b.getWheel(),b.getColor());
		
		Bike b2 = new Bike();
		
		System.out.printf("\n[두번째 자전거 정보]\n자전거 바퀴수: %d, 색상: %s\n",b2.getWheel(),b2.getColor());
		
		b2.setColor("빨간색");
		System.out.printf("자전거 바퀴수: %d, 색상: %s\n",b2.getWheel(),b2.getColor());
	 }
 }