package reverse;

import java.util.Scanner;

public class Stringreverse {

	
	public static void main(String[] args) {
		int count=0;
		 Scanner sc=new Scanner(System.in);
		 String s=sc.next();
		 char[] c2= new char[]{'a','e','i','o','u','A','E','I','O','U'};
		 StringBuffer s1=new StringBuffer(s);
		 System.out.println(s1.reverse());
		 String f=s1.toString();
		 char[] c1=f.toCharArray();
		 for(int i=0;i<c1.length;i++)
		 {
			 for(int j=0;j<c2.length;j++)
			 {
				 if(c1[i]==c2[j])
				 {
					 count++;
				 }
		}	 
			 if(count==0)
			 {
				 System.out.print(c1[i]);
			 }
			 count=0;
		 
		 
	 }
	}

}
