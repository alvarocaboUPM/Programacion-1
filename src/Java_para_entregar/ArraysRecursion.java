
class ArrayRecursion{

    static int sumEven(int[] col){
        return sumEvenAux(col, 0);


    }
    static int sumEvenAux(int[] col, int index){
        if(index == col.length)
            return 0;
        else if(col[index]%2==0)
            return col[index] + sumEvenAux(col, index+1);
        else
            return sumEvenAux(col, index+1);

    }

    static int sumEvenPosElemR(int[] col){
        return sumEvenPosElemRaux(col, 0);

    }


    static int sumEvenPosElemRaux(int[]col, int index){
        if(index == col.length)
            return 0;
        else
           return col[index] + sumEvenPosElemRaux(col, index+2);
    }

    static int countAsteriskR(char[] col){return countAsteriskRaux(col, 0);}

    static int countAsteriskRaux(char[] col, int index){
        if(index == col.length)
            return 0;
        else if(col[index]== '*')
            return 1 + countAsteriskRaux(col, index +1);
        else
            return countAsteriskRaux(col, index+1);
    }

    static int maxNumR(int[] col){return maxNumRAux(col,1, col[0]);}

    static int maxNumRAux(int[] col, int index, int max){
        if(index == col.length)
            return max;
        else if(col[index] > max){
            return maxNumRAux(col,index + 1, col[index]);}
        else {return maxNumRAux(col,index + 1, max);}
    }
    public static void main(String[]args){
        int[] num1 = {1, 2, 3, 5, 6 , 8};
        char[] a1= {'*','v','*','/','*','b'};
        System.out.println(sumEven(num1));
        System.out.println(sumEvenPosElemR(num1));
        System.out.println(countAsteriskR(a1));
        System.out.println(maxNumR(num1));


    }



}