
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=0;i<10;i++)
		{
			if(i!=0)
				System.out.printf("%2d\t",i);
			else
				System.out.printf("  \t");
			for(j=1;j<10;j++)
			{
				if(i==0)
				{
					System.out.printf("%2d\t",j);
				
				}
				else if(j<=i)
				{
					System.out.printf("%2d\t",i*j);
				}
				else
					System.out.printf("  \t");
				
				
			}
			System.out.printf("\n");
			
		}
		
		
	}

}
