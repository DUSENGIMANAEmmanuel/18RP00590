class Inverse
{
	public static void main(String[] args) {
		for(int i=8;i>=1;i--)
		{
			System.out.print(" "+" "+"     ");
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int a=7;a>=1;a--)
		{
			System.out.print(" "+" "+"     ");
			for(int b=8;b>=a;b--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}