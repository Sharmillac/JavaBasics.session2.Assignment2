package assignment2;	

public class cAssignment2 {

	public static void main(String[] args) {
		for(int i = 1; i < 100; i++)
		{
			if(i == 1)
				continue;
			int lDivisors = 0;
			boolean lBroken = false;
			for(int j = 1; j < i; j++)
			{
				if((i % j) == 0)
					lDivisors++;
				if(lDivisors > 1)
				{
					lBroken = true;
					break;
				}
			}
			if(!lBroken)
				System.out.println("PRIME = " + i );
		}
		
	}
}
