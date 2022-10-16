package conditionalLoops;

public class checkCharacterIsAlphabet {
    public static void main(String[] args) {
        char a = '*';
        char b = '0';
        if((a>='a' && a<='z') || (a>='A' && a<='Z')){
            System.out.println(a + " is an alphabet.");
        }else{
            System.out.println(a + " is not an alphabet.");
        }
        //Using alphabetic method
        if (Character.isAlphabetic(b)) {
            System.out.println(b + " is an alphabet.");
        }
        else {
            System.out.println(b + " is not an alphabet.");
        }
    }
}
