package org.jsp.techalpha;

import java.util.Scanner;

public class RemoveLeadingZeros {
   public static void main(String[] args) {
	  Scanner ip=new Scanner(System.in);
	  System.out.println("Enter The String..");
	  String s=ip.nextLine();
	  String ansString="";
	  for(int i=0;i<s.length();i++)
	  {
		  if(s.charAt(i)=='0')
		  {
			  continue;
		  }
		  else
		  {
			 ansString+=s.substring(i);
			 break;
		  }
	  }
	  System.out.println("Before Removing the LeadingZeros:"+s);
	  System.out.println("After Removing LeadingZeros:"+ansString);
}
}
