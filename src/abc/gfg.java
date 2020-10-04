package abc;

import java.util.*;

public class gfg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      int a=scan.nextInt();
      int count=0;
      for(int i=2;i<=Math.sqrt(a);i++)
      {
    	  if(a%i==0)
    		  count++;
      }
     if(count==0)
    	 System.out.println("Yes");
     else
    	 System.out.println("No");
	}

}
