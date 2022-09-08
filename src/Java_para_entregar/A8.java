/* Author: Álvaro Cabo
    created: 5/11/2020
 */

public class A8{
      /* visualize(collection of integers colInt) -> text
       * PRE: colInt cannot be null
       * POST: the result is a text containing the elements
       * of colInt separated by blanks
       * EXAMPLES:
       *  visualize([3,4,5]) -> "3 4 5"
       *  visualize([3,4,5, 6]) -> "3 4 5 6"
      */
      
	static String visualize(int[] colInt) {
        String result = " ";
        for (int i = 0; i < colInt.length; i++) 
            result = result+" " + colInt[i];

        return result;
    }
      
	/*
	 * Function: visualize(collection of chars colChar) -> text
	 * Pre: colChar cannot be null
	 * Post: the result is a text containing the elements of colChar separated by blanks
	 * Ex: visualize([a,e,i,o,u] -> "a e i o u"  
	 */
      
      static String visualizeChar(char[] colChar){
        String result= " ";
        for(int i= 0; i <colChar.length; i++){
          result = result + " " + colChar[i];
        }
        return result;
      
      }
      /*
  	 * Function: visualizeCollection -> [n1,n2,n3,...,n]
  	 * Pre: colInt cannot be null
  	 * Post: the result is a text containing the elements of visualizeCollection separated by comas and with square brackets
  	 * Ex: visualizeCollection([3,4,5] -> "[3,4,6]" 
  	 * Ex: visualizeCollection([3,4,5,6] -> "[3,4,6,3]" 
  	 */
  	
  	static String visualizeCollection(int[] colComaInts) {
  		String result="";
  		if (result=="")
  		for (int i = 0; i<colComaInts.length-1;i++) {
  			result=result+colComaInts[i]+",";
  		}
  		result=result+colComaInts[colComaInts.length-1];
  		return "["+result+"]";
  	}
  	
  	/*
  	 * Function: sumElements ---> [n1,n2,n3,n4] ----> n1 + n2 + n3 + n4
  	 * Pre: cannot be null
  	 * Post: the result is the sum of all numbers contained in the function
  	 * Ex: [3,4,6,3] ----> 16
  	 */
  	
  	static int sumElements(int[] elements) {
  		int result=0;
  		for (int i = 0; i < elements.length; i++) {
  			result = result + elements[i];
  		}
  		return result;
  	}
  	
  	/*
  	 * Function: sumEvenElements ---> [n1,n2,n3,n4] ---->  n2 + n4 (n2 and n4 are even)
  	 * Pre: cannot be null
  	 * Post: the result is the sum of the even numbers contained in the input array
  	 * Ex: [3,4,6,3] ----> 10
  	 */
  	
  	static int sumEvenElements(int[] evenElements) {
  		int result = 0;
  		for (int i = 0; i < evenElements.length; i++) { 
  			 if (evenElements[i]%2==0)
  			result = result + evenElements[i];
  		}
  		return result;
  	}
  	/*
  	 * Function: sumPosEven ---> [n1,n2,n3,n4] ---->  n1 + n3 (n1 and n3 are even positions)
  	 * Pre: cannot be null
  	 * Post: the result is the sum of the even positions
  	 * Ex: [3,4,6,3] ----> 9
  	 */
  	static int sumPosEven(int[] elements) {
  		int result=0;
  		for (int i = 0; i < elements.length; i=i+2) {
  				result = result + elements[i];
  		}
  		return result;
  	}
  	/*
  	 * Function: maxElem ---> int []
  	 * Pre: cannot be null
  	 * Post: the result is the max element of the array
  	 * Ex: [3,4,6,3] ----> 6
  	 */
  	
  	
  	/*
  	 * Function: findElem ---> boolean
  	 * Pre: cannot be null
  	 * Post: the result is the element previously asked to found
  	 * Ex: [3,4,6,3] ----> n=6 ----> 6
  	 */
  	static boolean finElem (int[] arr,int n) {
  		boolean found = false;
  		int i = 0;
  		while (i<arr.length) {
  			if (arr[i] == n) {
  				found = true;
  			}
  			i++;
  		}
  		return found;
  	}

    public static void main(String[] args){
  
//E1
        int num=34;
        System.out.println(num);
        //Q1: 34
        //int[] nums;
        //Q2:The local variable nums may not have been initialized
        int[] nums= new int [4];
        System.out.println(nums);
        //[I@c45406 (A varible of type array stores one memory address)
//E2
        //initialize the array with the elements [3,4,6,3]
        nums[0] = 3;
        nums[1] = 4;
        nums[2] = 6;
        nums[3] = 3;
        System.out.println(nums);
        //Q4: [I@c45406 (A varible of type array stores one memory address)
        System.out.println(nums[2]);
//E3
        //This is equivalent to:
        //char[] vowels =new char[5];
        //vowels[0]='a'
        //vowels[1]='e'
        //vowels[2]='i'
        //vowels[3]='o'
        //vowels[4]='u'
        char[] vowels ={'a','e','i','o','u'};
        System.out.println(vowels);
        
        boolean[] bool ={true, false, true, true, false};
        System.out.println(bool);
        
//E4
        System.out.println(visualize(nums));
        System.out.println(visualizeChar(vowels));
		System.out.println(visualizeCollection(nums));
		System.out.println(sumElements(nums));
		System.out.println(sumEvenElements(nums));
		System.out.println(sumPosEven(nums));
		System.out.println(finElem(nums,4));

//E5

        
    }
}

