package numbers;

public class Convert_decimal_to_binary 
{
	String bin="";
	public void find_bin(int decimal)
	{
	for(int i=1;;i++)
	{
		System.out.println(" i : "+i);
		System.out.println("decimal : "+decimal);

		if(decimal==1)
		{
			bin="1"+bin;
			break;
		}
		else if(decimal>1)
		{
		
		bin=Integer.toString((decimal%2))+bin;
		}
		decimal=decimal/2;
	}
	System.out.println("Final Bin Nm : "+bin);

	}
	public static void main(String args[])
	{
		Convert_decimal_to_binary ob=new Convert_decimal_to_binary();
		ob.find_bin(2);
	}
}


