public class CoderDecoder {

    static char[] code(char[] clrWord) {
        int[] array = codeASCII(clrWord);
        for (int i = 0; i < clrWord.length - 2; i++) {
            array[i + 2] = clrWord[i];
        }
        array[0] = clrWord[clrWord.length - 2];
        array[1] = clrWord[clrWord.length - 1];
        return decodeASCII(array);
    }
    static char[] decode(char[] cText){
        int[] array = codeASCII(cText);
        for (int i = 2; i<cText.length;i++) {
            array[i-2]=cText[i];
        }
        array[cText.length-2]=cText[0];
        array[cText.length-1]=cText[1];
        return decodeASCII(array);
    }

    static int[] codeASCII(char[] clrWord){
        int[] cText= new int[clrWord.length];
        for(int i=0; i< clrWord.length;i++){
            cText[i]=clrWord[i];
        }
    return cText;

 }
 

    static char[] decodeASCII(int[] cText){
        char[] clrWord = new char[cText.length];
        for(int i=0; i< cText.length;i++){
            clrWord[i]= (char) cText[i];
        }
        return clrWord;

    }


    static char encodeChar(char c) {
       int a=encodeASCIIChar(c);
        if(a>='a' && a < 'n')
            return decodeASCIIChar(a + 13);
        else if (a >='A'&& a < 'N' )
            return decodeASCIIChar(a + 13);
        else if(a > 'm'&& a <='z')
            return decodeASCIIChar(a - 13);
        else if(a > 'M'&& a <='Z')
            return decodeASCIIChar(a - 13);
        else if (a >= 91 && a <=94)
            return decodeASCIIChar(a + 32);
        else if (a >= 123 && a <= 126)
            return decodeASCIIChar(a - 32);
        else if (a == 95)
            return decodeASCIIChar(a + 1);
        else if (a == 96)
            return decodeASCIIChar(a - 1);
        else if (a>= 32 && c<= 47)
            return decodeASCIIChar(a + 17);
        else if (a>= 49 && c<= 64)
            return decodeASCIIChar(a - 17);
        else if (a == 0)
            return decodeASCIIChar(127);
        else if (a == 127)
            return decodeASCIIChar(0);
        else if(a> 0 && c<=15)
            return decodeASCIIChar(a +16);
        else if(a> 16 && c<= 31)
            return decodeASCIIChar(a -16);
        else if (a == 48)
            return decodeASCIIChar(16);
        else if (a == 16)
            return decodeASCIIChar(48);
        else return c;
    }
    static char decodeChar(char c) {
        int a=encodeASCIIChar(c);
        if(a>='a' && a < 'n')
            return decodeASCIIChar(a + 13);
        else if (a >='A'&& a < 'N' )
            return decodeASCIIChar(a + 13);
        else if(a > 'm'&& a <='z')
            return decodeASCIIChar(a - 13);
        else if(a > 'M'&& a <='Z')
            return decodeASCIIChar(a - 13);
        else if (a >= 91 && a <=94)
            return decodeASCIIChar(a + 32);
        else if (a >= 123 && a <= 126)
            return decodeASCIIChar(a - 32);
        else if (a == 95)
            return decodeASCIIChar(a + 1);
        else if (a == 96)
            return decodeASCIIChar(a - 1);
        else if (a>= 32 && c<= 47)
            return decodeASCIIChar(a + 17);
        else if (a>= 49 && c<= 64)
            return decodeASCIIChar(a - 17);
        else if (a == 0)
            return decodeASCIIChar(127);
        else if (a == 127)
            return decodeASCIIChar(0);
        else if(a> 0 && c<=15)
            return decodeASCIIChar(a +16);
        else if(a> 16 && c<= 31)
            return decodeASCIIChar(a -16);
        else if (a == 48)
            return decodeASCIIChar(16);
        else if (a == 16)
            return decodeASCIIChar(48);
        else return c;
    }

    static char decodeASCIIChar(int n) { return (char)n;}

    static char encodeASCIIChar(char c)  {return c;}


    static boolean check(int c){
        boolean result= true;
        while(c<=127 && result){
            int b= decodeChar(encodeChar((char)c));
            if(b != c)
                result=false;
            c++;
        }
        return result;

    }
    static boolean checkASCII(int c){
        boolean result= true;
        while(c<=127 && result){
            int b= decodeASCIIChar(encodeASCIIChar((char)c));
            if(b != c)
                result=false;
            c++;
        }
        return result;

    }
    public static void main(String[] args) {
        char[] a = new char[] {'c', 'l', 'a', 'r', 'a'};
        char[] ab = new char[] {'/', '5', '4', 's', '%'};

        System.out.println(decode(code(a)));
        System.out.println(decode(code(ab)));
        System.out.println((int)decodeChar(encodeChar((char)0)));
        System.out.println((int)decodeChar(encodeChar((char)16)));
        System.out.println((int)decodeChar(encodeChar((char)127)));

        System.out.println((int)(encodeChar((char)127)));
        System.out.println((int)(decodeChar((char)0)));
        System.out.println(check(0));
        System.out.println(checkASCII(0));
        
    }
}








