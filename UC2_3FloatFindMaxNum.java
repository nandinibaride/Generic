package generic.com;

import java.util.Scanner;

public class UC2_3FloatFindMaxNum {

	/*
	 * @purpose: To find maximum float value
	 * @return: Float
	 */
	
	public Float MaximumFloat(Float num1, Float num2, Float num3) {
		
			Float maxFloat = num1;
			if (num2.compareTo(maxFloat) > 0)
				maxFloat = num2;
			if (num3.compareTo(maxFloat) > 0)
				maxFloat = num3;
			
			System.out.println("The Maximum number is: "+ maxFloat);
			
			return maxFloat;
		}

		public static void main(String args[]) {
			
			UC2_3FloatFindMaxNum  obj = new UC2_3FloatFindMaxNum ();
			
			Scanner sc =new Scanner(System.in);
	         System.out.println("Enter number1 Value:");
	         Float num1 = sc.nextFloat();
	         System.out.println("Enter number2 Value:");
	         Float num2 = sc.nextFloat();
	         System.out.println("Enter number3 Value:");
	         Float num3 = sc.nextFloat();
	         
	 		 obj.MaximumFloat(num1,num2,num3);
        }
	}



