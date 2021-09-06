package generic.com;

public class MaximumTest<T extends Comparable<T>> {
	
	T x, y, z;
	
	 public MaximumTest(T x, T y, T z) {
			this.x = x ;
			this.y = y;
			this.z = z;
		}

		public void testMaximum() {
			MaximumTest.findMaximum(this.x, this.y, this.z);
		}
		/*
		 * @purpose: To find maximum number using generic method
		 * @return: No return value
		 */
		
	    public static <T extends Comparable<T>> void findMaximum(T num1, T num2, T num3) {
			T maximumNumber;
			
			if(num1.compareTo(num2)>0 && num1.compareTo(num3)>0) {
				maximumNumber = num1;
			}
			else if(num2.compareTo(num1)>0 && num2.compareTo(num3)>0) {
				maximumNumber = num2;
			}
			else {
				maximumNumber = num3;
			}
			
			System.out.println("The maximum number is: " + maximumNumber);
		}
		
		public static void main(String[] args) {

          Integer num1 = 45, num2 = 10, num3 = 35;
		  Float number1 = 1.1f, number2 = 8.0f, number3 = 5.3f;
		  String firstString = "Latur", secondString = "Pune", thirdString = "Mumbai";
			
		    new MaximumTest<Integer>(num1, num2, num3).testMaximum();
			new MaximumTest<Float>(number1, number2, number3).testMaximum();
			new MaximumTest<String>(firstString, secondString, thirdString).testMaximum();
			
		}
}
