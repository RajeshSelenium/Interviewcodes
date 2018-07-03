package Patterns;

public class Star_Right_angled_Triangle1 
{

	public static void main(String args[])
	{
	
		int line_no=1;
		int Total_Lines=5;
		
		
		for(int j=1;j<=Total_Lines;j++)
		{
	//		System.out.println(" j : "+j);

			for(int i=1;i<=line_no;i++)
			{
	//		System.out.println(" i : "+i);
	//			System.out.print(" i : "+i+" line_no : "+line_no);

			if(i<=line_no)
			{
			System.out.print("*");
			}
			
		}
			if(line_no<=Total_Lines)
			{
				line_no++;
			}
		
		System.out.println("");

	}
	}
	//gdsgdfsgdfso
}
