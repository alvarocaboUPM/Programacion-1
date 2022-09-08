
class CoderDecoder {

    static char[] code(char[] clrWord) {
        char[] ctext= codeASCII(clrWord);
        return ctext;
    }

    static char[] decode(char[] cText){
        char[] clrWord= decodeASCII(cText);
        return clrWord;
    }

    static char[] codeASCII(char[] clrWord){

        char [] array = new char[clrWord.length];
        for (int i = 0; i<clrWord.length-2;i++) {
            array[i+2]=clrWord[i];
        }
        array[0]=clrWord[clrWord.length-2];
        array[1]=clrWord[clrWord.length-1];
        return array;
    }


    static char[] decodeASCII(char[] cText){

        char [] array = new char[cText.length];
        for (int i = 0; i<cText.length-2;i++) {
            array[i+2]=cText[i];
        }
        array[0]=cText[cText.length-2];
        array[1]=cText[cText.length-1];
        return array;
    }


    static char encodeChar(char c) {
        if(c>='a' && c < 'n')
            return decodeASCIIChar(c + 13);
        else if (c >='A'&& c < 'N' )
            return decodeASCIIChar(c + 13);
        else if(c > 'm'&& c <='z')
            return decodeASCIIChar(c - 13);
        else if(c > 'M'&& c <='Z')
            return decodeASCIIChar(c - 13);
        else if (c >= 91 && c <=94)
            return decodeASCIIChar(c + 32);
        else if (c >= 123 && c <= 126)
            return decodeASCIIChar(c - 32);
        else if (c == 95)
            return decodeASCIIChar(c + 1);
        else if (c == 96)
            return decodeASCIIChar(c - 1);
        else if (c>= 32 && c<= 47)
            return decodeASCIIChar(c + 17);
        else if (c>= 49 && c<= 64)
            return decodeASCIIChar(c - 17);
        else if (c == '0')
            return decodeASCIIChar(127);
        else if (c == '')
            return decodeASCIIChar(48);
        else if(c>= 0 && c<=15)
            return decodeASCIIChar(c +16);
        else if(c>= 16 && c<= 31)
            return decodeASCIIChar(c -16);
        else return c;
    }
    static char decodeChar(char c) {
        if(c>='a' && c < 'n')
            return decodeASCIIChar(c + 13);
        else if (c >='A'&& c < 'N' )
            return decodeASCIIChar(c + 13);
        else if(c > 'm'&& c <='z')
            return decodeASCIIChar(c - 13);
        else if(c > 'M'&& c <='Z')
            return decodeASCIIChar(c - 13);
        else if (c >= 91 && c <=94)
            return decodeASCIIChar(c + 32);
        else if (c >= 123 && c <= 126)
            return decodeASCIIChar(c - 32);
        else if (c == 95)
            return decodeASCIIChar(c + 1);
        else if (c == 96)
            return decodeASCIIChar(c - 1);
        else if (c>= 32 && c<= 47)
            return decodeASCIIChar(c + 17);
        else if (c>= 49 && c<= 64)
            return decodeASCIIChar(c - 17);
        else if (c == '0')
            return decodeASCIIChar(127);
        else if (c == '')
            return decodeASCIIChar(48);
        else if(c>= 0 && c<=15)
            return decodeASCIIChar(c +16);
        else if(c>= 16 && c<= 31)
            return decodeASCIIChar(c -16);
        else return c;
    }

    static char decodeASCIIChar(int n) { return (char)n;}

    static char encodeASCIIChar(char c)  {return c;}

    public static void main(String[] args) {
        char[] a = new char[] {'c', 'l', 'a', 'r', 'a'};
        char[] ab = new char[] {'/', '5', '4', 's', '%'};
        System.out.println("This will check the encoder, type any input");
        System.out.println(code(a));
        System.out.println(decode(a));


    }
}









class CoderDecoder {

    static char[] code(char[] clrWord) {
        char[] ctext= codeASCII(clrWord);
        return ctext;
    }

    static char[] decode(char[] cText){
        char[] clrWord= decodeASCII(cText);
        return clrWord;
    }

    static char[] codeASCII(char[] clrWord){

        char [] array = new char[clrWord.length];
        for (int i = 0; i<clrWord.length-2;i++) {
            array[i+2]=clrWord[i];
        }
        array[0]=clrWord[clrWord.length-2];
        array[1]=clrWord[clrWord.length-1];
        return array;
    }


    static char[] decodeASCII(char[] cText){

        char [] array = new char[cText.length];
        for (int i = 0; i<cText.length-2;i++) {
            array[i+2]=cText[i];
        }
        array[0]=cText[cText.length-2];
        array[1]=cText[cText.length-1];
        return array;
    }


    static char encodeChar(char c) {
        if(c>='a' && c < 'n')
            return decodeASCIIChar(c + 13);
        else if (c >='A'&& c < 'N' )
            return decodeASCIIChar(c + 13);
        else if(c > 'm'&& c <='z')
            return decodeASCIIChar(c - 13);
        else if(c > 'M'&& c <='Z')
            return decodeASCIIChar(c - 13);
        else if (c >= 91 && c <=94)
            return decodeASCIIChar(c + 32);
        else if (c >= 123 && c <= 126)
            return decodeASCIIChar(c - 32);
        else if (c == 95)
            return decodeASCIIChar(c + 1);
        else if (c == 96)
            return decodeASCIIChar(c - 1);
        else if (c>= 32 && c<= 47)
            return decodeASCIIChar(c + 17);
        else if (c>= 49 && c<= 64)
            return decodeASCIIChar(c - 17);
        else if (c == '0')
            return decodeASCIIChar(127);
        else if (c == '')
            return decodeASCIIChar(48);
        else if(c>= 0 && c<=15)
            return decodeASCIIChar(c +16);
        else if(c>= 16 && c<= 31)
            return decodeASCIIChar(c -16);
        else return c;
    }
    static char decodeChar(char c) {
        if(c>='a' && c < 'n')
            return decodeASCIIChar(c + 13);
        else if (c >='A'&& c < 'N' )
            return decodeASCIIChar(c + 13);
        else if(c > 'm'&& c <='z')
            return decodeASCIIChar(c - 13);
        else if(c > 'M'&& c <='Z')
            return decodeASCIIChar(c - 13);
        else if (c >= 91 && c <=94)
            return decodeASCIIChar(c + 32);
        else if (c >= 123 && c <= 126)
            return decodeASCIIChar(c - 32);
        else if (c == 95)
            return decodeASCIIChar(c + 1);
        else if (c == 96)
            return decodeASCIIChar(c - 1);
        else if (c>= 32 && c<= 47)
            return decodeASCIIChar(c + 17);
        else if (c>= 49 && c<= 64)
            return decodeASCIIChar(c - 17);
        else if (c == '0')
            return decodeASCIIChar(127);
        else if (c == '')
            return decodeASCIIChar(48);
        else if(c>= 0 && c<=15)
            return decodeASCIIChar(c +16);
        else if(c>= 16 && c<= 31)
            return decodeASCIIChar(c -16);
        else return c;
    }

    static char decodeASCIIChar(int n) { return (char)n;}

    static char encodeASCIIChar(char c)  {return c;}

    public static void main(String[] args) {
        char[] a = new char[] {'c', 'l', 'a', 'r', 'a'};
        char[] ab = new char[] {'/', '5', '4', 's', '%'};
        System.out.println("This will check the encoder, type any input");
        System.out.println(code(a));
        System.out.println(decode(a));


    }
}








