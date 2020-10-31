import java.util.Scanner;

public class TRIANGLEPATH {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int c;
		int n;
		
		c = sc.nextInt();
		
		for(int i = 0; i < c; i++)
		{
			n = sc.nextInt();
			
			int[] result = new int[n+1];
			int[] in = new int[n];
			int max = 0;
			
			for(int j = 0 ; j < n; j++)
			{
				for(int k = 0; k < j + 1; k++)
				{
					in[k] = sc.nextInt();
				}
				
				for(int k = j; k >= 0; k--)
				{
					if(k == 0) result[k] += in[k];
					else result[k] = Math.max(result[k] + in[k] , result[k-1] + in[k]);
				}
			}
			
			for(int j = 0; j < n + 1; j++)
			{
				max = Math.max(max, result[j]);
			}
			
			System.out.println(max);
		}
		
		sc.close();
	}

}
