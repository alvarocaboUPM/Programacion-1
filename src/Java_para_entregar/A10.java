public class A10{

    /* FUNCTION: posElem(collection of integers col, integer elem) -> integer
     * PRE: col is no null
     * POST: the result is the position (index) of elem in col.
     * If elem is not in col, then the result is -1
     * If elem appears more than once, the postion is the first
     * one from left to right
     * EXAMPLES:
     *    posElem([2,5,7,2,5],7) -> 2
     *    posElem([2,5,7,2,5],2) -> 0
     *    posElem([2,5,7,2,5],6) -> -1
     */

    static int posElem(int[] col, int elem){
        return posElemAux(col, elem, 0);
    }
    static int posElemAux(int[]col, int elem, int index){
            if(index == col.length)
                return -1;
            if(col[index] == elem)
                return index;
            else return posElemAux(col,elem, index+1);
        }



    /* FUNCTION: isBalanced(Collection of caracteres col) -> boolean
     * PRE: col is not null.
     * POST: the result is true if the parenthesis are well balanced
     * and false otherwise
     * EXAMPLES:
     *  isBalanced(['(','(',')',')']) -> true
     *  isBalanced(['(','a','b',')','(','c','d',')']) -> true
     *  isBalanced(['(','(','c','d',')']) -> false
     *  isBalanced(['(','(','c','d',')',')',')']) -> false
     */
    static boolean isBalanced(char[] col){
        return isBalancedAux(col, 0, 0, 0);
    }
    static boolean isBalancedAux(char[]col, int index, int p1, int p2){
        boolean result = false;
        if(p1==p2) result= true;
        if(index == col.length)
            return result;
        else if(col[index] == '('){
            ++p1; return isBalancedAux(col, index +1, p1, p2);}
        else if(col[index] == ')'){
            ++p2; return isBalancedAux(col, index +1, p1, p2);}
        else return isBalancedAux(col, index +1, p1, p2);
    }

    static boolean isitBalanced(char[]col){
        boolean result=false; int p1=0; int p2=0;
        for(int i=0; i<col.length;i++){
            if(col[i]=='(')
                p1++;
            else if(col[i]==')')
                p2++;
        }
        if(p1==p2)
        result=true;
    return result;
    }

    /* FUNCTION: mostFrequentVowel(Collection of caracteres col) -> int
     * PRE: col is not null.
     * POST: the result is the number of times that the vowel that
     * appears more times in col occurs
     * EXAMPLES:
     *  mostFrequentVowel(['r','s']) -> 0
     *  mostFrequentVowel(['r','s','a']) -> 1
     *  mostFrequentVowel(['a','b','a','a','i','o']) -> 3
     *  mostFrequentVowel(['a','a','i','a','i','i']) -> 3
     */

    static int mostFrequentVowel(char[] col){
        return mostFrequentVowelAux(col, 0, 0);
    }
    static int mostFrequentVowelAux(char[] col, int index, int c){
        
    }
    
    static int cuantos(char[]a, char p){
        int c=0;
        for(int i=0; i<a.length;i++){
            if(a[i]==p)
            c++;
        }
        return c;
    }
    public static void main(String[] args){
        //Tests
        int[] n1 ={2,5,7,2,5};
        char[] c1 ={'(','a','b',')','(','c','d',')'};
        char[]c2 ={'(','(','c','d',')',')',')'};
        System.out.println(posElem(n1, 7));
        System.out.println(posElem(n1, 2));
        System.out.println(isBalanced(c1));
        System.out.println(isitBalanced(c1));
        System.out.println(isBalanced(c2));
        System.out.println(isitBalanced(c2));
    }

}