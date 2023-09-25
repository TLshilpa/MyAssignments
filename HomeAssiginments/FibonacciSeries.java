package HomeAssiginments;

public class FibonacciSeries {

	public static void main(String[] args) {
		
	
		 int Num1=0,Num2=1, range=8;
		  
		  System.out.println("Fibonacci Series given by the range 8 ");
		  
			for (int i=0;i<=range-1;i++)	
			{
				System.out.print(Num1 +",");
				int Num3;
				
				Num3 = Num1 + Num2;
				Num1 = Num2;
				Num2 = Num3;	
			}}}
	


