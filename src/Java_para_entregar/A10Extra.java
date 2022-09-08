/*
 * author: Clara Benac Earle
 * author: Álvaro Cabo Ciudad
 * 
 * creation date: 23/11/2020
 * last modification: 
 * Assignment 10 Optional
 */ 

class A10Extra{
  
  
  /* FUNCTION: compare(char collection col1, char collection col2) -> integer
   * PRE: col1 and col2 are not null 
   * POST: the result is -1 if col1 is less than col2 in the 
   * lexicographical order, 1 if col1 is greater than col2 in the 
   * lexicographical order and zero if they are equal
   * EXAMPLES: 
   *  compare(['a','n','a'],['a','n','a','c','o','n','d','a']) -> -1
   *  compare(['a','n','e'],['a','n','a']) -> 1
   *  compare(['a','n','a'],['a','n','a']) -> 0
   * 
   */ 
  
   static int compare(char[]col1, char[]col2){
     int result=0; int i=0;
    if(col1.length==0||col2.length==0)
    result= 0;
    else if(col1.length < col2.length)
      result=-1;
    else if(col1.length > col2.length)
      result=1;
    else for(i=0; i<col1.length;i++){
      if(col1[i]==col2[i])
      i++;
      else if(col1[i]<col2[i])
      result=-1;
      else if(col1[i]>col2[i])
      result=1;
      else result=0;
    }
return result;
   }
  /* 
   * FUNCTION: isSubSequence(Collection of integers col1, col2) -> boolean  
   * PRE: col1 and col2 are not null 
   * POST: the result is true if col2 is a subsequence of col1
   *   isSubSequence([2,5],[2]) -> true 
   *   isSubSequence([2,5,7,2,5],[7,2]) -> true
   *   isSubSequence([2,5,7,2,5],[7,5]) -> false
   *   isSubSequence([2,5,7,7,7,5],[7,7,5]) -> true
   */
  static boolean isSubArray(int A[], int B[]) { 
    int i = 0, j = 0; int n=A.length; int m=B.length;
    while (i < n && j < m) { 
      if (A[i] == B[j]){      
        i++; 
        j++; 
      if (j == m) 
      return true;} 
      else{ 
      i = i - j + 1; 
      j = 0; } 
    }
    return false; 
} 
  public static void main(String[] args){
    char[]a= new char[]{'a','n','a'};
    char[]ab= new char[]{'a','n','a'};
    char[]b= new char[]{'a','n','e'};
    char[]c= new char[]{'a','n','a','c','o','n','d','a'};
    int[]e1= new int[]{2,5,7,2,5};
    int[]e2= new int[]{2};
    int[]e3= new int[]{2,9};

    //Tests
    System.out.println(compare(a,c));
    System.out.println(compare(a,ab));
    System.out.println(compare(b,a));
    System.out.println(isSubArray(e1, e2));
    System.out.println(isSubArray(e1, e3));
  }
 
}