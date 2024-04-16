package ExampleTest;

public class LongComPre {
	
    public int[] plusOne(int[] digits) {
    	int lastIndex = digits.length-1;
    	for(int i=lastIndex; i>=0; i--) {
    		if(digits[i] == 9) {
    			digits[i]=0;
    			}
    		else {
    			digits[i]++;
    			return digits;
    		}
    	}
    	int[] newDigits = new int[digits.length+1];
    	newDigits[0] = 1;
    	for(int n=1; n<newDigits.length; n++) {
    		newDigits[n] = digits[n-1];
    	}
    	return newDigits;
    }
}
