import java.util.Scanner;

import alumno.Alumno;
public class Main
{
	public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);
	    int a = read.nextInt();
	    
	    Alumno alumno =  new Alumno();
            alumno.setAge(a);
	}
}