import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[ ] args) {
	    Scanner scanner = new Scanner(System.in);
        
        
        LinkedList<String> words = new LinkedList<String>();
        
        
        while(words.size()<5){
            String word = scanner.nextLine();
            //add the word to LinkedList
            words.add(word);
            
        }
        
        //your code goes here
        for (String pal : words) {
			if(pal.length() > 4) {
				System.out.println(pal);
			}
		}
    }
}