/*
 * author: Clara Benac Earle
 * author: Álvaro Cabo
 * 
 * creation date: 7/10/2019
 * last modification: 21/10/2020
 * 
 * Program the following exercises using recursion
 * 
 */ 


class A7{
  
  /* FUNCTION: power(integer base, exponent) -> integer
   * PRE: base > 0, exponent >= 0
   * POST: the result is the base to the power of the exponent
   * EXAMPLES:
   *    power(1,0) -> 1
   *    power(2,1) -> 2
   *    power(2,2) -> 4
   *    power(3,2) -> 9
   */ 
  static int power (int b, int exp){
   int cont =1; 
   
   while (cont < exp) {
   cont= cont +1;
   b= b*b;
   } 
   return b;
  }
  
  /* FUNCTION: fibonacci(integer n) -> integer
   * PRE: n >= 0
   * POST: the result is the Fibonacci number in the n 
   * position of the Fibonacci sequence of numbers
   * EXAMPLES:
   *    fibonacci(0) -> 0
   *    fibonacci(1) -> 1
   *    fibonacci(4) -> 3
   */
  
  static int fibonacci (int n){
    if (n>1)
       return fibonacci(n-1) + fibonacci(n-2);  
    
    else if (n==1)  
        return 1;
   
    else if (n==0)
        return 0;
    
    else
        return -1; 
    
  }
  
  
  /* FUNCTION: numberDigits(integer n) -> natural
   * PRE: true
   * POST: the result is the number of digits of n
   * EXAMPLES:
   *    numberDigits(264) -> 3
   *    numberDigits(23489) -> 5
   */
  
   static int numberDigits (int n){
   int cont =0; 
   while (n != 0) {
   n /= 10;
            ++cont;
   } 
   return cont;
  }
  
  
  /* FUNCTION: sumInterval(integer a, b) -> integer
   * PRE: a, b >= 0, a <= b
   * POST: the result is the sum of all integer numbers
   * in the interval [a,b]
   * EXAMPLES:
   *    sum(2,4) -> 9
   */ 
   static int sumInterval (int a, int b){
    int result = 0;
    int n=0;
    

    
  
   
    if (a>=0 && b>=0 && a <= b) {
        while(a <= b){
        n= (1*a)+n;
        ++a;     
        }
        result= n;
        
   return result;}
   else 
     System.out.println("No es posible");
    return 0;
    
   }
  
  /* FUNCTION: productInterval(integer a, b) -> integer
   * PRE: a, b > 0, a <= b
   * POST: the result is the product of all integer 
   * numbers in the interval [a,b]
   * EXAMPLES:
   *    productInterval(2,4) -> 24
   */  
   static int productInterval (int a, int b){
     int result = 0;
     int n=1;
     
     if (a>0 && b>0 && a <= b) {
         while(a <= b){
         n= (1*a)*n;
         ++a;     
         }
         result= n;
         
    return result;}
    else 
      System.out.println("No es posible");
     return 0;
     
    }
  
  
  /* FUNCTION: sumEvenInterval(integer a, b) -> integer
   * PRE: a, b >= 0, a <= b
   * POST: the result is the sum of all even integer
   * numbers in the interval [a,b]
   * EXAMPLES:
   *    sumEvenInterval(2,4) -> 6
   */
  
   static int sumEvenInterval (int a, int b){
     int result = 0;
     int n=0;
     
     if (a>=0 && b>=0 && a <= b) {
         if(a%2==0) {
          while(a <= b){
         n= (1*a)+n;
         a=a+2; }}
         else { a=a+1;
          while(a <= b){
              n= (1*a)+n;
              a=a+2;     
              }}
         
         result= n;
         
    return result;}
    else { 
      System.out.println("No es posible");
     return 0;
    }
    }
  
  /* FUNCTION: reverse(int num) -> int
   * PRE: num >= 0
   * POST: the result is an integer which contains the same digits
   * as num but in reverse order
   * EXAMPLES:
   *   reverse(123) -> 321
   *   reverse(5) -> 5
   *   reverse(56789) -> 98765
   * 
   */ 
   
   static int reverse(int num) {
    int rest; int inNum= 0;
    
    while(0<=num){
     rest= num%10;
     inNum= (inNum*10) + rest;
     num= num/10;
    }
    
    return inNum;
   }
  
  /* FUNCTION: isPalindromic(int num) -> boolean
   * PRE: num >= 0
   * POST: the result is true if num is a palindromic number and 
   * returns false otherwise
   * EXAMPLES:
   *   isPalindromic(5) -> true
   *   isPalindromic(343) -> true
   *   isPalindromic(4554) -> true
   *   isPalindromic(4564) -> false
   */ 
   static boolean isPalindromic(int num) {
    int rest; int inNum= 0;
    
    while(0<=num){
     rest= num%10;
     inNum= (inNum*10) + rest;
     num= num/10;
    }
    
    return inNum==num;
   }
  
  
  
  /* FUNCTION: lineAst (integer n) â†’ text
   * PRE: n > 0
   * POST: the result is a line with n asterisks
   * EXAMPLES:
   *    lineAst(1) -> "*"
   *    lineAst(3) -> "***"
   */
  
   static String lineAst (int n) {
      String asterisk="*";
      int c=1;
      
     if(n<0) { return asterisk;}
       
     else {
      while (c<n) {
       asterisk=asterisk +"*";
       ++c;
      }
      return asterisk;}
     }
  
  /* FUNCTION: triangleAst(integer n) â†’ text
   * PRE: n > 0
   * POST: the result is a right triangle with a 
   * base of n asterisks
   * EXAMPLES:
   *   triangleAst(1) -> "*"
   *   triangleAst(3) â†’ "*"
   *                    "**"
   *                    "***" 
   */
  
   static String triangleAst (int n) {
      String asterisk="*";
      int c=0;
      
     if(n<2) { return asterisk;}
       
     else {
      while (c<n) {
       asterisk=asterisk + "*";
       System.out.println(asterisk);
      ++c;
      }
      return asterisk;}
     }
  
  /* FUNCTION: elephantSong(integer num) -> text
   * PRE: num > 0
   * POST: the result is a text containing the lyrics of the 
   * elephant song in Spanish, that is, "Un elefante se 
   * balanceaba sobre la tela de una araÃ±a..." until 
   * the number of elephants is num
   * Example:
   *    elephantSong(3) = "Un elefante se balanceaba sobre la tela de una 
   *    araÃ±a y como veÃ­a que no se caÃ­a fue a llamar a otro elefante. 2 
   *    elefantes se balanceaban sobre la tela de una araÃ±a y como veÃ­an 
   *    que no se caÃ­an fueron a llamar a otro elefante. 3 elefantes se 
   *    balanceaban sobre la tela de una araÃ±a y como veÃ­an que no se caÃ­an 
   *    fueron a llamar a otro elefante"
   */ 
  
  static String elephantSong(int num) {
   
   String cancion="jaja";
   String cancion1="Un elefante se balanceaba sobre la tela de una araña, como veía que resistía  fue a llamar a otro elefante ";
   String cancion2="Un elefante se balanceaba sobre la tela de una araña, como veía que resistía  fue a llamar a otro elefant Dos elefantes se balanceaba sobre la tela de una araña, como veían que resistía fueron a llamar a otro elefante.";  
   String cancion3="Un elefante se balanceaba sobre la tela de una araña, como veía que resistía  fue a llamar a otro elefant Dos elefantes se balanceaba sobre la tela de una araña, como veían que resistía fueron a llamar a otro elefante.Tres elefantes se balanceaban, sobre la tela de una araña,como veían que resistía fueron a llamar a otro elefante.";  
   String cancion4="Un elefante se balanceaba sobre la tela de una araña, como veía que resistía  fue a llamar a otro elefant Dos elefantes se balanceaba sobre la tela de una araña, como veían que resistía fueron a llamar a otro elefante.Tres elefantes se balanceaban, sobre la tela de una araña,como veían que resistía fueron a llamar a otro elefante.Cuatro elefantes se balanceaban,sobre la tela de una araña,como veían que resistía fueron a llamar a otro elefante.";  
   String cancion5="Un elefante se balanceaba sobre la tela de una araña, como veía que resistía  fue a llamar a otro elefant Dos elefantes se balanceaba sobre la tela de una araña, como veían que resistía fueron a llamar a otro elefante.Tres elefantes se balanceaban, sobre la tela de una araña,como veían que resistía fueron a llamar a otro elefante.Cuatro elefantes se balanceaban,sobre la tela de una araña,como veían que resistía fueron a llamar a otro elefante. Cinco elefantes se balanceaban,sobre la tela de una araña,como veían que resistía fueron a llamar a otro elefante.";  
   String cancion6="Un elefante se balanceaba sobre la tela de una araña, como veía que resistía  fue a llamar a otro elefant Dos elefantes se balanceaba sobre la tela de una araña, como veían que resistía fueron a llamar a otro elefante.Tres elefantes se balanceaban, sobre la tela de una araña,como veían que resistía fueron a llamar a otro elefante.Cuatro elefantes se balanceaban,sobre la tela de una araña,como veían que resistía fueron a llamar a otro elefante. Cinco elefantes se balanceaban,sobre la tela de una araña,como veían que resistía fueron a llamar a otro elefante.Seis elefantes se balanceaban, sobre la tela de una araña, como veían que resistía fueron a llamar a otro elefante";
   
   switch(num) {
   case 1: cancion=cancion1;
   case 2: cancion=cancion2;
   case 3: cancion=cancion3;
   case 4: cancion=cancion4;
   case 5: cancion=cancion5;
   case 6: cancion=cancion6;
   }
   return cancion;
  }
  
  
  public static void main(String [] args){
    System.out.println(power(2,3));
    System.out.println(power(1,0));
    System.out.println(power(2,2));
    System.out.println(fibonacci(0));
    System.out.println(fibonacci(1));
    System.out.println(fibonacci(4));
    System.out.println(numberDigits(7));
    System.out.println(numberDigits(98564654));
    System.out.println(sumInterval(2, 4));
    System.out.println(sumInterval(2, 6));
    System.out.println(productInterval(1, 4));
    System.out.println(productInterval(2, 5));
    System.out.println(sumEvenInterval(2, 6));
    System.out.println(sumEvenInterval(2, 12));
    System.out.println(sumEvenInterval(5, 12));
    System.out.println(reverse(390));
    System.out.println(reverse(8643));
    System.out.println(reverse(4554));
    System.out.println(isPalindromic(4554));
    System.out.println(isPalindromic(1902));
    System.out.println(lineAst(2));
    System.out.println(lineAst(3));
    System.out.println(triangleAst(1));
    System.out.println(triangleAst(3));
    System.out.println(elephantSong(3));
    
    }
}  