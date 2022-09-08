public class A6 {
 //EXERCISE 1
 public static double finalPrice(double p) {
  /*PRE: p >= 0, if p < 200, there's no discount
   *POST: The result is the final price of the article, 
   *	which variates depending on its original price
   *TEST: System.out.println(finalPrice(150));
   *	  System.out.println(finalPrice(695));
   *	  System.out.println(finalPrice(254.6));
   */

 if(p>= 200 && p<600)
  return p-(p*0.16); 
 if(p>= 600)
   return p-(p*0.20); 
 else return p;
  
 }

 //EXERCISE 2
  public static double interestRate(double b) {
   /*PRE: if balance in the last day (b) < 100, there's no interest rate 
    *POST: the result will be the interest rate generated 
    *depeneding on the balanced on the last day of the month (b)
    *TEST: System.out.println(interestRate(254.6)+ "%");
  System.out.println(interestRate(4002.3)+ "%");
  System.out.println(interestRate(1002.3)+ "%");
    */

	 double i;
  if(b>= 100 && b<1000) return i= 4;
  if(b>= 1000 && b<3000) return i= 4.5;
  if(b>= 3000) return i= 5;
  else return i= 0;
  
  }
  
  public static String dayOfWeek(int day) {
	   /*PRE: The numbers given must be between 1 and 7
	    *POST: The result will be the corresponding name of the day of the week
	    *TEST: System.out.println(dayOfWeek(3));
  		System.out.println(dayOfWeek(7));
	    */
	  String dayOfWeek = "Unknown";
	  switch(day) {
	  case 1: return "Lunes";
	  
	  case 2: return "Martes";
	  case 3: return "Miércoles";
	  case 4: return "Jueves";
	  case 5: return "Viernes";
	  case 6: return "Sábado";
	  case 7: return "Domingo";
	
	  }
	  
	  return dayOfWeek;
  }
  
  
  public static int daysOfMonth(int m, int y) {
	   /*PRE: The numbers corresponding to the months must be between 1 and 12
	    * 
	    *POST: The result is the number of days the given month has depending on 
	    *the given year.
	    *TEST:   
	    *System.out.println("The given month has: " + (daysOfMonth(7, 2019))+ "days");
  		System.out.println("The given month has: " + (daysOfMonth(2, 2020))+ "days");
  		System.out.println("The given month has: " + (daysOfMonth(2, 2015))+ "days");
	    */
	  int numberofdays = 0;
		  switch(m) {
		  case 1: return numberofdays = 31;
		  case 2: 
			  if ((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0))) 
				  return numberofdays = 29;
	       else 
	    	  return numberofdays = 28;
	      
		  case 3: return  numberofdays = 31;
		  case 4: return  numberofdays = 30;
		  case 5: return  numberofdays = 31;
		  case 6: return  numberofdays = 30;
		  case 7: return  numberofdays = 31;
		  case 8: return  numberofdays = 31;
		  case 9: return  numberofdays = 30;
		  case 10: return numberofdays = 31;
		  case 11: return numberofdays = 30;
		  case 12: return numberofdays = 31;
		

	   }
		return numberofdays;
  }
  
  public static String translateCardinalPoint(int letter) {
	   /*PRE: free
	    *POST: The result will be the translation of the word represented by the
	    *initials W, E, N, S in Spanish.
	    *TEST: System.out.println(translateCardinalPoint('a'));
  System.out.println(translateCardinalPoint('S'));
  System.out.println(translateCardinalPoint('w'));
	    */
	  String spanishWord= "Wrong cardinal point";
	  switch(letter) {
	  case 78: return "Norte";
	  case 110: return "Norte";
	  case 101: return "Este";
	  case 69: return "Este";
	  case 87: return "Oeste";
	  case 119: return "Oeste";
	  case 115: return "Sur";
	  case 83: return "Sur";
	  }
	 return spanishWord;
	  
 }
  
  public static double totalPrice(int students) {
	   /*PRE: There must be an integer positive # of students
	    *POST: The result will be the total price of the trip, which is the product of 
	    *the number of students times the price they have to pay
	    *TEST: 
	    */
	 double price= 0;
	 int n = students;
	 if(n >= 100) return price= 200 *n;
	 if(n >= 50 && n <= 99) return price= 330 *n;
	 if(n >= 30 &&  n <= 49) return price= 500 *n;
	 if(n < 29) return price= 15000;
	 
	 return price;
  }
  
 public static void main(String[] args) {
//E1
	 
  System.out.println(finalPrice(150.6));
  System.out.println(finalPrice(695));
  System.out.println(finalPrice(254.6));
  
//E2
  System.out.println(interestRate(254.6)+ "%");
  System.out.println(interestRate(4002.3)+ "%");
  System.out.println(interestRate(1002.3)+ "%");

//E3
  System.out.println(dayOfWeek(3));
  System.out.println(dayOfWeek(7));
  System.out.println(dayOfWeek(10));
//E4
  System.out.println("The given month has: " + (daysOfMonth(7, 2019))+ " days");
  System.out.println("The given month has: " + (daysOfMonth(2, 2020))+ " days");
  System.out.println("The given month has: " + (daysOfMonth(2, 2015))+ " days");
  System.out.println("The given month has: " + (daysOfMonth(99, 2015))+ " days");
  
//E5
 
  System.out.println(translateCardinalPoint('a'));
  System.out.println(translateCardinalPoint('S'));
  System.out.println(translateCardinalPoint('w'));
//E6
  System.out.println("The total price is: " + (totalPrice(10)));
  System.out.println("The total price is: " + (totalPrice(50)));
  System.out.println("The total price is: " + (totalPrice(48)));
  System.out.println("The total price is: " + (totalPrice(1000)));
  
 }
}
