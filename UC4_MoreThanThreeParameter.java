package generic.com;

import java.util.*;

public class UC4_MoreThanThreeParameter {
	/*
	 * @purpose: to find Maximum String value using sorting
	 * @return: No return value
	 */
	
	public void maximumString() {
	
	ArrayList<String> stringvalue = new ArrayList<String>();
	
    stringvalue.add("papaya");
    stringvalue.add("banana");
    stringvalue.add("orange");
    stringvalue.add("mango");
    stringvalue.add("apple");
    
    Collections.sort(stringvalue, Collections.reverseOrder());
    
    System.out.println("The Maximum string value is:" + stringvalue);
    
	}
    public static void main(String args []) {
    	UC4_MoreThanThreeParameter obj = new UC4_MoreThanThreeParameter();
    	obj.maximumString();
    	}
    }
