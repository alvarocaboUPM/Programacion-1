/*
 * author: Clara Benac Earle
 * created: 03/12/2020
 * 
 * A11: bidimensional collections
 * 
 */ 

class A11{
  
  /* FUNCTION: sumElements(matrix of integer m) -> integer
   * PRE: m is not null
   * POST: the result is the addition of all elements in m. 
   * EXAMPLE:
   *   sumElements([[1,2],[3,4]]) -> 10
   *   sumElements([[2,2],[1,1]]) -> 6
   */ 
  
  static int sumElements(int[][] m){
    int result=0;
    for (int i = 0; i < m.length; i++){
      for (int j = 0; j < m[i].length; j++){
        result = result + m[i][j];
      }
      }
    return result;
  }
   /* FUNCTION: findN(matrix of integer m, int n) -> boolean
   * PRE: m is not null
   * POST: the result is true if n is in m and false otherwise
   * 
   * EXAMPLE:
   *   findN([[1,2],[3,4]],3) -> true
   *   findN([[1,2],[3,4]],5) -> false
   */ 
  
  
  static boolean findN(int[][] m, int n){
    boolean result=false; 
    for (int i = 0; i < m.length; i++){
      for (int j = 0; j < m[i].length; j++){
        if(m[i][j]==n)
        result=true;
      }
      }
      return result;

  }
  
  /* FUNCTION: equals(matrices of integer m1, m2) -> boolean
   * PRE: m1 and m2 are not null
   * POST: the result is true if m1 and m2 have the same elements
   * and in the same positions and false otherwise.
   * 
   * EXAMPLES:
   *   equals([[1,2],[3,4]],[[1,1],[2,2]]) -> false
   *   equals([[1,2],[3,4]],[[1,2],[3,4]]) -> true
   */ 
  
  static boolean equals(int[][] m1,int[][] m2){
    boolean result= true; int i=0; int j=0;
    if(m1.length!=m2.length)
    result=false;
    else while(i<m1.length-1 && result){
      while (j < m1[i].length-1&& result){
        if(m1[i][j]!=m2[i][j])
        result=false;
        else{j++;i++;}
      }
      }
    return result;
  }
  
  
  /* FUNCTION: sumMatrices(matrices of integer m1, m2) -> matrix of integers
   * PRE: m1 and m2 are not null. m1 and m2 have the same size
   * POST: the result is a matrix such that each element is the
   * addition of the corresponding elements in m1 ad m2
   * 
   * EXAMPLE:
   *   sumMatrices([[1,2],[3,4]],[[1,1],[2,2]]) -> [[2,3],[5,6]]
   */ 
  
  static int[][]sumMatrices(int[][]m1,int[][]m2){
	  int[][]m3= new int[m1.length][m1.length];
	  if(m1.length!=m2.length)
		  System.out.print("No es posible");
	  else
	  for (int i = 0; i < m1.length; i++){
	      for (int j = 0; j < m1[i].length; j++){
	        m3[i][j]=m1[i][j]+m2[i][j];
	      }
	      }
	  return m3;
  }
  
  
  /* FUNCTION: showMatrix(matrix of integer m) -> text
   * PRE: m is not null
   * POST: the result is a text containing the elements of a matrix. The
   * elements of each row are separated by a blank space and each row 
   * is in one line.
   * EXAMPLE:
   *   showMatrix([[1,2],[3,4]]) -> 1 2
   *                                3 4
   */ 
  
  static String showMatrix(int[][]m){
	  String bea= ""; int n= m.length;
	  for(int i = 0; i < n; i++){ 
			for(int j = 0; j < m[i].length; j++){ 
        bea= bea + m[i][j]+ " " ;
        
      }
      bea= bea + "\n" ;
  }
	  return bea;  
	  }
  
  /* FUNCTION: identity(int size) -> matrix of integer
   * PRE: size >= 0
   * POST: the result is the identity matrix of size n, that is, 
   * an n × n square matrix with ones on the main diagonal and zeros elsewhere.
   * EXAMPLE:
   *   identity(1) -> 1
   *   identity(3) -> 1 0 0 
   *                  0 1 0
   *                  0 0 1
   * 
   */ 
  
  static int[][] identity(int n){
	  int[][]m= new int[n][n];
	  for(int i = 0; i < n; i++){ 
			for(int j = 0; j < n; j++){ 
				if(i==j)
					 m[i][j]=1;
				else m[i][j]=0;
			}}
	  return m;
  }
  
  public static void main(String[] args){
    int[][]a={{1,2},{3,4}};
    int[][]ab={{1,1},{2,2}};
    int[][]b= {{1,2,3},{4,1,2},{3,4,5}};
    System.out.println(sumElements(a));
    System.out.println(equals(a,ab));
    System.out.println(findN(a,3));
    System.out.println(findN(a,8));
    System.out.println(showMatrix(b));
    System.out.println(showMatrix(sumMatrices(a,ab)));
    System.out.println(showMatrix(identity(3)));
  }
  
}