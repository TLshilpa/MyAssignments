package HomeAssiginments;

public class IsPrime {

	public static void main(String[] args) {
		int n  = 29;
		boolean computer = false;
		for(int i=2;i < n; i++)
		{
		if (n % i == 0) {
			computer =false;
			break;
			
		}
		computer=true;
		
	}
 if(computer)
	 System.out.println(n+ " "+ "is a prime number");
 else
 System.out.println(n +" "+"is not a prime number");
	}
}
