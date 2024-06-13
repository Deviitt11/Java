import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner s = new Scanner(System.in);
	    int choice = s.nextInt();
	    
	    String[] categories = {"PCs", "Notebooks", "Tablets", "Phones", "Аccessories"};
	    
	    //complete the code
	    try {
	        switch (choice) {
			case 0: {
				System.out.println(categories[0]);
				break;
			}
			case 1: {
				System.out.println(categories[1]);
				break;
			}
			case 2: {
				System.out.println(categories[2]);
				break;
			}
			case 3: {
				System.out.println(categories[3]);
				break;
			}
			case 4: {
				System.out.println(categories[4]);
				break;
			}
			default:
				System.out.println("Wrong Option");
			}
	    } catch(Exception e) {
	        e.printStackTrace();
	    }
	}
}