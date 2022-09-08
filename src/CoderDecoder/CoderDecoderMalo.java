package CoderDecoder;/*
Author: Alvaro Cabo and Manuel Calviño

 */

public class CoderDecoderMalo {

    static public char clrWrd= ' ';
    static public char deWrd=' ';
    static public char cText=' ';
    static public char character=' ';
    static public char character2=' ';
    static public int char2 = 0;
    static public int char2b = 0;
    static public int ascii= clrWrd;


    /*
     * FUNCTION: code char --> int --> another int --> char
     * PRE: clrWrd
     * POST:  trasnsform a character depending on its ASCII code
     * EXAMPLES: clrWrd (o) -----> (b)
     *           clrWrd (c) -----> (p)
     */

    static char encode(char clrWrd) { //function that provides another character when given one
        for (ascii = 0; ascii <= 127; ascii++) {
            if(clrWrd>='a' && clrWrd <= 'm')
                char2 = clrWrd + 13;
            else if (clrWrd >='A'&& clrWrd <= 'M' )
                char2 = clrWrd + 13;
            else if(clrWrd >= 'n'&& clrWrd <='z')
                char2 = clrWrd - 13;
            else if(clrWrd >= 'N'&& clrWrd <='Z')
                char2 = clrWrd - 13;
            else if (clrWrd >= 91 && clrWrd <=94)
                char2 = clrWrd + 32;
            else if (clrWrd >= 123 && clrWrd <= 126)
                char2 = clrWrd - 32;
            else if (clrWrd == 95)
                char2 = clrWrd + 1;
            else if (clrWrd == 96)
                char2 = clrWrd - 1;
            else if (clrWrd>= 32 && clrWrd<= 47)
                char2 = clrWrd + 17;
            else if (clrWrd>= 49 && clrWrd<= 64)
                char2 = clrWrd - 17;
            else if (clrWrd == '0')
                char2 = 127;
            else if (clrWrd == '')
                char2 = 48;
            else if(clrWrd<=15)
                char2 = clrWrd +16;
            else if(clrWrd>= 16 && clrWrd<= 31)
                char2 = clrWrd -16;
            
        }
        cText = (char) char2;
        return cText;
        
    }

    static char encodeChar(char clrWrd) {
        character = encode(clrWrd);
        return character;

    }

    /*
     * FUNCTION: decode char --> int --> another int --> char
     * PRE: character
     * POST: trasnsform a character depending on its ASCII code
     * EXAMPLES: clrWrd (b) -----> (o)
     *           clrWrd (p) -----> (c)
     */

    static char decode(char deWrd) {
        for (ascii = 0; ascii <= 127; ascii++) {
            if(character>='a' && character < 'n')
                char2b = character + 13;
            else if (character >='A'&& character < 'N' )
                char2b = character + 13;
            else if(character > 'm'&& character <='z')
                char2b = character - 13;
            else if(character > 'M'&& character <='Z')
                char2b = character - 13;
            else if (character >= 91 && character <=94)
                char2b = character + 32;
            else if (character >= 123 && character <= 126)
                char2b = character - 32;
            else if (character == 95)
                char2b = character + 1;
            else if (character == 96)
                char2b = character - 1;
            else if (character>= 32 && character<= 47)
                char2b = character + 17;
            else if (character>= 49 && character<= 64)
                char2b = character - 17;
            else if (character == '0')
                char2b  = 127;
            else if (character == '')
                char2b  = 48;
            else if(character>= 0 && character<=15)
                char2b = character +16;
            else if(character>= 16 && character<= 31)
                char2b = character -16;
        }

        deWrd=(char)char2b;
        return deWrd;
    }


    static char decodeChar(char deWrd) {
        character2 = decode(deWrd);
        return character2;
    }

    /*
     * FUNCTION: code clrWrd --> int
     * PRE: clrWrd
     * POST: ASCII(cText)
     * EXAMPLES: clrWrd (o) -----> (111)
     *           clrWrd (z) -----> (122)
     */

    static int encodeASCII(char cText) { //function that provides the ASCII code of
        //codified char
        int char3= cText;
        return char3;
    }

    static int encodeASCIIChar() {
        int ascii = encodeASCII(cText);
        return ascii;

    }

    /*
     * FUNCTION: decode char -->  original int
     * PRE: character
     * POST: ASCII(clrWrd)
     * EXAMPLES: clrWrd (b) -----> (098)
     *           clrWrd (Z) -----> (090)
     */

    static int decodeASCII(char character) {
        int char3b = character;
        return char3b;
    }

    static int decodeCharASCII() {
        int ascii = decodeASCII(deWrd);
        return ascii;

    }

    public static void main(String[] args) {
       System.out.println("This will check the encoder, type any input");
       System.out.println(encodeChar('a'));
       System.out.println("This will check the decoder");
       System.out.println(decodeChar(deWrd));
       System.out.println("This will check the ASCII encoder");
        System.out.println(encodeASCIIChar());
        System.out.println("This will check the ASCII decoder");
        System.out.println(decodeCharASCII());
    }


}








