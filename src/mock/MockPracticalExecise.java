/*
 * author: 
 * date: 
 * 
 * Submit via DeliverIt
 * http://vps142.cesvima.upm.es/
 */ 

package mock;

 
class MockPracticalExercise{
  
  static int aprobados(double[] col){
      int n=0;
    for (int i=0; i< col.length; i++) {
     if(col[i]>=5)
         ++n;
    }
    return n;
  }

  public static void main(String[] args) {

   double[] notas = new double[] {0.75,7.25,6,1.25,8.5,3.75,2.75,5.5,4.5,3.5,4.25,6.25,5.15,5,8.15,5.25,3.5,3,4.5,2,5.25,5.3,5.25,3.5,2.25,4.5,6,3.5,3.25,1.25,6.25,3,5,1.5,4.25,4.296,4.25,0.75,7.25,6,1.25,8.5,3.75,2.75,5.5,4.5,3.5,4.25,6.25,5.15,5,8.15,5.25,3.5,3,4.5,2,5.25,5.3,5.25,3.5,2.25,4.5,6,3.5,3.25,1.25,6.25,3,5,1.5,4.25
   };

           System.out.println(aprobados(notas));
 
  }
}