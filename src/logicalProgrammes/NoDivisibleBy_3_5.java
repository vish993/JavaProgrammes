package logicalProgrammes;

public class NoDivisibleBy_3_5 
{

	public static void main(String[] args) 
	{
		for (int i=1; i<=50;i++)
		{
			if(i%3==0&&i%5==0)
			{
				System.out.println(i);
			}
		}
	}

}
