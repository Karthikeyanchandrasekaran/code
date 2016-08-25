package reverse;

import java.util.ArrayList;
import java.util.Scanner;

public class unique {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count=0;
		ArrayList n=new ArrayList();
		ArrayList m=new ArrayList();
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=sc.nextLine();
		for(String a:s.split(" "))
		{
			n.add(Integer.parseInt(a));
			
		}
		for(String b:s1.split(" "))
		{
			m.add(Integer.parseInt(b));
		}
		for(int i=0;i<n.size();i++)
		{
			for(int j=0;j<m.size();j++)
			{
				if(n.get(i)==m.get(j))
				{
					count++;
				}
			}
		}
		if(count==n.size())
		{
			System.out.println("array 1:"+n);
			System.out.println("array 2:"+m);
			System.out.println("a1 is the subset of a2");
		}
		else
		{
			System.out.println("a1 is not a subset of a2");
		}
	}

}
