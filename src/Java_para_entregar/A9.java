public class A9{
 
 static int countAsterisks(char[] col) {
  int i=0; int n=0;
  for(i=0; i< col.length; i++) {
    if(col[i]== '*')
      n=n+1;

  }
  return n;
 }
 static boolean findChar(char[] col, char c) {
  
  boolean found = false;
  int i = 0;
  while (i < col.length && !found) {
  if (col[i] == c)
   found = true;
  else i++;
 }
 return found;
}
 
 static boolean allN(int col[], int n) {
  boolean allN= true;
  int i=0;
  while(i < col.length && allN) {
   if(col[i] != n)
    allN = false;
   else i++;
  }
  return allN;
  
  
 }
static boolean allC(int col[], int c) {
  boolean allC= true;
  int i=0;
  while(i < col.length && allC) {
   if(col[i] != c)
    allC = false;
   else i++;
  }
  return allC;
  
 }
static int[] copy(int[] col) {
 int[] result= new int [col.length];
 for(int i =0; i < col.length; i++) {
  result[i] =col[i];
}
 return result;
}

static int[] invert1(int[] col) {
 int[]result= col;
 for(int i =0; i < col.length/2; i++) {
  result[i] =col[col.length -1 - i];
}
 return result;
}

static int[] invert2(int[] col) {
 int[]result= col;
 for(int i =0; i < col.length; i++) {
  result[i] =col[col.length -1 - i];
}
 return result;

}
static char[] invert3(char[] col) {
	 char[]result= col;
	 for(int i =0; i < col.length; i++) {
	  result[i] =col[col.length -1 - i];
	}
	 return result;

	}
static boolean isPalindrome(char[]col) {
 return col == invert3(col);
 
}
static boolean equals(int[]col1, int[]col2) {
 int i=0; boolean result= true;
 if(col1.length!=col2.length)
  result= false;
 else for(i=0; i < col1.length; i++){
  if(col1[i]!=col2[i])
   result= false;
 }
 return result;
}

static int [] eliminateOdd (int [] col) {
	
	int [] result = new int [col.length/2];
	for (int i=0,e=0;i<col.length;i=i+2,e++) {
		result[e] = col[i];}
	
	return result;
}
 static String visualize(int[] colComaInts) {
    String result="";
    if (result=="")
    for (int i = 0; i<colComaInts.length-1;i++) {
     result=result+colComaInts[i]+",";
    }
    result=result+colComaInts[colComaInts.length-1];
    return "["+result+"]";
   }
 static String visualizeChar(char[] colComaInts) {
	    String result="";
	    if (result=="")
	    for (int i = 0; i<colComaInts.length-1;i++) {
	     result=result+colComaInts[i]+",";
	    }
	    result=result+colComaInts[colComaInts.length-1];
	    return "["+result+"]";
	   }

   
 public static void main(String[]args){
  char[] a = new char[] {'3', 'a', 'f', '*', 'b', '/'};
  char[] ab = new char[] {'3', 'a', '*', '*', '*', '3', 'a'};
  int[] b = new int[] {1, 3, 4 , 5, 8};
  int[] c = new int[] {1, 3, 1};
  int[] d = new int[] {1, 3, 4 , 5, 8};
  System.out.println ((countAsterisks(a)));
  System.out.println ((countAsterisks(ab)));
  System.out.println(findChar(a, 'a'));
  System.out.println(allN(b, 4));
  System.out.println(allC(b, 'a'));
  System.out.println(visualize((copy(b))));
  System.out.println(visualize((invert1(b))));
  System.out.println(visualize((invert2(b))));
  System.out.println(visualizeChar((invert3(a))));
  System.out.println(isPalindrome(ab));
  System.out.println(isPalindrome(a));
  System.out.println(equals(b, c));
  System.out.println(equals(b, d));
  System.out.println (visualize((eliminateOdd(b))));
 }
}