import java.util.ArrayList;
import java.util.Scanner;


public class spltting {

	
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		ArrayList b=new ArrayList();
		int i=0;
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(String s:str.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)"))
		{	
			if(i==0)
			{
			a.add(s);
			}
			else if(i==1)
			{
				b.add(Integer.parseInt(s));
			}
			else if(i%2!=0)
			{
				b.add(Integer.parseInt(s));
			}
			else
			{
				a.add(s);
			}
			i++;
		}
		for(int j=0;j<b.size();j++)
		{
			for(int y=(Integer) b.get(j);y>0;y--)
			{
				System.out.print(a.get(j));
			}
		}

	}

}
