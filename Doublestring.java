package reverse;

import java.util.Scanner;

public class Doublestring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count=0,count1=0;
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] a=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(a[i]);
				count1++;
			}
			else
			{
				
			}
			count=0;
		}
		if(count1==0)
		{
			System.out.println("not a double string");
		}

	}

}
