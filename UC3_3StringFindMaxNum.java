package generic.com;

import java.util.Scanner;

public class UC3_3StringFindMaxNum {
	
	/*
	 * @purpose: To find maximum String value
	 * @return: String
	 */
	
	public String maximumString(String String1, String String2, String String3) {
		
			String maxString = String1;
			if (String2.compareTo(maxString) > 0)
				maxString = String2;
			if (String3.compareTo(maxString) > 0)
				maxString = String3;
			
			System.out.println("The Maximum number is: "+ maxString);
			
			return maxString;
		}

		public static void main(String args[]) {
			
			UC3_3StringFindMaxNum  obj = new UC3_3StringFindMaxNum ();
			
			Scanner sc =new Scanner(System.in);
	         System.out.println("Enter string1 Value:");
	         String String1 = sc.next();
	         System.out.println("Enter string2 Value:");
	         String String2 = sc.next();
	         System.out.println("Enter string3 Value:");
	         String String3 = sc.next();
	         
	 		 obj.MaximumString(String1,String2,String3);
        }
	}





