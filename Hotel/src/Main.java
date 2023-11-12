/*
 * You are the administrator of a hotel and must create customer information cards for your new customers. On the card, you must note the customer’s first and last name, age, and room number. 

The program you are given takes a guest's data (first name, last name, age, and room number) as input.

Complete the class by adding corresponding attributes so that the saveCustomerInfo() method works correctly. Also assign taken data values to attributes of created object.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Creamos el objeto Scanner para poder leer los objetos por teclado
        Scanner s = new Scanner(System.in);

        // Leemos los datos introducidos por teclado
        String firstName = s.nextLine();
        String secondName = s.nextLine();
        int age = s.nextInt();
        int roomNumber = s.nextInt();

        // Creamos un nuevo objeto Cliente
        Customer customer = new Customer();
       
        // Actualizamos los datos del cliente con los leídos
        customer.firstName = firstName;
        customer.secondName = secondName;
        customer.age = age;
        customer.roomNumber = roomNumber;

        // Llamada al método saveCI
        customer.saveCustomerInfo();
   }
}