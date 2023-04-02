package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int n = 20;
		int j;
		int input = 131;
		label:
		{
		for (int i = 2; i < input; i++) {
			j = input % i;
			if(j==0)
			{
			System.out.println("Given number "+input+" is not prime");
			break label;
			}
		}
				System.out.println("Given number "+input+" is Prime");
		}

	}

}
