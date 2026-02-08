import java.util.Scanner;

public class JC19StrigClass {
    public static void main(String[] args) {
        String word1, word2;
        Scanner input=new Scanner(System.in);

        System.out.println("-----------------------------");
        
        //Data entry
        System.out.println("Write the first word: ");
        word1=input.nextLine();
        System.out.println("Write the second word: ");
        word2=input.nextLine();

        //Comparing strings
        if (word1.equals(word2)){
            System.out.println("The words are the same.");
        } else {
            System.out.println("The words are different.");
        }

        System.out.println("-----------------------------");

        //Comparing strings ignoring case
        if (word1.equalsIgnoreCase(word2)){
            System.out.println("The words are the same (ignoring case).");
        } else {
            System.out.println("The words are different (ignoring case).");
        }

        System.out.println("-----------------------------");
        
        //Comparing the cuantity of characters in the strings
        if(word1.compareTo(word2)==0){
            System.out.println("The words have the same number of characters.");
        } else if (word1.compareTo(word2)<0) {
            System.out.println("The first word has less characters than the second word.");
        } else {
            System.out.println("The first word has more characters than the second word.");
        }

        System.out.println("-----------------------------");
        
        //First character of the words
        System.out.println("The first character of the first word is: " + word1.charAt(0));
        System.out.println("The first character of the second word is: " + word2.charAt(0));

        //Number of characters in the words
        System.out.println("The first word has " + word1.length() + " characters.");
        System.out.println("The second word has " + word2.length() + " characters.");

        //Identifying some characters in the words
        System.out.println("Three characters of the first word are: " + word1.substring(1, 3));
        System.out.println("Three characters of the second word are: " + word2.substring(2, 3));

        //Serching coincidences between the words
        int commonCharIndex = word2.indexOf(word1);
        if (commonCharIndex != -1) {
            System.out.println("The first word is found in the second word at index: " + commonCharIndex);
        } else {
            System.out.println("The first word is not found in the second word.");
        }

        // //Making words to lowercase and uppercase
        System.out.println("The first word in lowercase is: " + word1.toLowerCase());
        System.out.println("The first word in uppercase is: " + word1.toUpperCase());
        System.out.println("The second word in lowercase is: " + word2.toLowerCase());
        System.out.println("The second word in uppercase is: " + word2.toUpperCase());

        input.close();
    }
}
