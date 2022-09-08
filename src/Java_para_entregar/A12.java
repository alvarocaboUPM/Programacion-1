public class A12 {
    
/* FUNCTION: binarySearch (int[] col, int n) -> boolean
PRE:col is not null and col is sorted in ascending order
POST: the result is true if n is in col and false otherwise
EXAMPLES: binarySearch([3, 4, 5], 4) -> true
          binarySearch([3, 4, 5], 6) -> false
*/
static boolean binarySearch(int[]col, int n){
    boolean found = false;
    //calculate the middleIndex
    int middleIndex =col.length/2;
    //if col.length=6 -> middleIndex = 3
    int i =0;
    //end
    int j= col.length-1;
    while(i != j && !found){
        if(col[middleIndex]== n)
            found = true;
        else if(col[middleIndex]< n)
        i = middleIndex;}
    return found;
    }

    public static void bubbleSort(int[] a) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (a[i] > a[i+1]) {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }
    public static void main(String[]xd){
        int[]a= new int[]{1, 3, 4, 5};
    System.out.println(binarySearch(a, 3));

    }
}
