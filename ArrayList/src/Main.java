import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[ ] args) {
	    Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> evennums = new ArrayList<Integer>();
        int result = 0;
        while(evennums.size()<3){
            int num = scanner.nextInt();
            //your code goes here
            evennums.add(num);
            result += num;
        }
        
        //calculate and output the average integer value
        int total = result / evennums.size();
        System.out.println(total);
    }
}