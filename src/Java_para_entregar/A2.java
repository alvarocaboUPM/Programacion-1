/*Author: Álvaro Cabo */
/*Subject: Programming I*/

class A2{
  public static void main(String arg[]){
  System.out.println("****** literals ******");
  System . out . println (2); // 1
  System . out . println ( -2); // 2
  System . out . println (2.5); // 3
  System . out . println ('a'); // 4
  /*Q1: the caracter a */
  System . out . println ("a");
  System . out . println ( true ); // 5
  System . out . println ( false ); // 6
  System . out . println (" My name is Pepe "); // 7 
  /*Q2: My name is Pepe */
  
  System . out . println ("****** arithmetic operations ******");
  System . out . println (3 + 5); // 1
  System . out . println (4 - 2); // 2
  System . out . println (3 * 5); // 3
  System . out . println (6 / 4); // 4
  System . out . println (4 % 2); // 5
  /*Q3: Integer numbers*/
  /*Q4: The result of diving 6/4: 2*/
  /*Q5: The rest of the division 4/2: 0*/
  
  System . out . println ("****** type conversion ******");
System . out . println (2.5 + 3); // 1
System . out . println (2.5 - 2); // 2
System . out . println (2 * 0.5); // 3 
/*Q6: Decimal numbers*/

  System . out . println ("****** precedence ******");
System . out . println (3 + 5 * 2);
System . out . println (3 + (5 * 2));
System . out . println ((3 + 5) * 2); 
/*Q7: The give different results depending on where the parenthesis are placed*/

  System . out . println ("****** relational operators ******");
System . out . println (3 < 5);
System . out . println (4 > 2);
System . out . println (3 >= 3);
System . out . println (3 == 3);
System . out . println (3 == 8);
System . out . println (3 != 8.3);
System . out . println (2 == 2.5);
System . out . println (2 > -1);

/*Q8: Iqual */
/*Q9: Different*/
/*Q10: Booleans */

System . out . println ("****** logic operators ******");
System . out . println (! true );
System . out . println (! false );
System . out . println ( true && true );
System . out . println ( true && false );
System . out . println ( true || false ); // Line 1
System . out . println ( true || true );
// System . out . println ( true || 5);

/*Q11: Negation */
/*Q12: And*/
/*Q13: It's negating the true statement and making it false */
/*Q14: Boolean*/
/*Q15: It won't let you compile because you can only use the OR conector for boolean data type */

System . out . println ("****** character operators ******");
System . out . println ('a');
System . out . println ('\u0061'); // 1
System . out . println ('\u0062');
System . out . println ('b' -'a'); // 2
System . out . println ('\u0041');
System . out . println ('a' -'A');
System . out . println ('\u0031');
System . out . println ('a'+ 8);
System . out . println (" My favorite letter is " +'A'); // 3
/*Q16: The caracter a */
/*Q17: Because it's the difference between b and a unicode values*/
/*Q18: A char string*/

System . out . println ("****** Strings operators ******");
System . out . println (" hi " + " pepe "); // 1
System . out . println (" hi  " + " pepe "); // 2
System . out . println (" hi " + 2); // 3
System . out . println (" hi " + 2.3); // 4 

/*Q19: A char string */
/*Q20: A char string*/
/*Q21: There's a double space*/
/*Q22: A char + int string*/
/*Q23: A char + float string*/

//System . out . println (" hi " - 5);
/*Q24:  Return the error: "String literal is not properly closed by a double-quote "*/
System.out.println("hi"+" Pepe," +" how are you?");
                     
System . out . println ("is 3 bigger than 5?:" + (3 > 5)); 
/*Q26: Returns the error: The operator > is undefined for the argument type(s) java.lang.String, int*/
/*Q27: Adding parenthesis */

System . out . println ("is 3 smaller or equal to 3?: " + (3 <= 3));
System . out . println ("is 3 different from 3?: " + (3 != 3));
System . out . println ("is 3 bigger than 3.5?: " + (3 > 3.5)); 
  }
}