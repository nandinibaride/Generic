package generic.com;

import java.util.*;

public class UC1_3IntegerFindMax {
	/*
	 * @purpose: To find maximum interger value
	 * @return: Integer
	 */
	
	public Integer MaximumIntegeriger(Integer num1, Integer num2, Integer num3) {
		
			Integer maxInteger = num1;
			if (num2.compareTo(maxInteger) > 0)
				maxInteger = num2;
			if (num3.compareTo(maxInteger) > 0)
				maxInteger = num3;
			
			System.out.println("The Maximum number is: "+ maxInteger);
			
			return maxInteger;
		}

		public static void main(String args[]) {
			
		 UC1_3IntegerFindMax obj = new UC1_3IntegerFindMax();
			
			Scanner sc =new Scanner(System.in);
	         System.out.println("Enter number1 Value:");
	         Integer num1 = sc.nextInt();
	         System.out.println("Enter number2 Value:");
	         Integer num2 = sc.nextInt();
	         System.out.println("Enter number3 Value:");
	         Integer num3 = sc.nextInt();
	         
	 		 obj.MaximumIntegeriger(num1,num2,num3);
        }
	}

