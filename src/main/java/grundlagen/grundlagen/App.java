package grundlagen.grundlagen;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<Integer> myList = new ArrayList<Integer>();
    	myList.add(4);
    	
    	int sum = 0;
    	
    	for(int i : myList) {
    		if(i % 2 == 0) {
    			sum += i;
    		}
    	}
    	
    	System.out.println(sum);
    }
}
