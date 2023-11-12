import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

       Scanner read = new Scanner(System.in);
       
       String name = read.nextLine();
       int age = read.nextInt();
       
       Student student = new Student();
       
       student.name = name;
       student.age = age;
       
       if(age < 0) {
           System.out.println("Invalid age");
       }
       System.out.println("Name: " + student.name);
       System.out.println("Age: " + student.getAge());
       
   }
}

