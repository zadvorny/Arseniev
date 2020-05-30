//package ua.zadv.les03;
/**
*@version 1.0
*@author Zadvorny
*/

public class Calculate
{
	public static void main(String[] args)
	{
		if(args.length>1)
		{
			int var1=Integer.valueOf(args[0]);
			int var2=Integer.valueOf(args[1]);
			System.out.println(var1+"+"+var2+"="+(var1+var2));
		}
		else
		{
			System.out.println("Not arguments...");
		}
	}
}