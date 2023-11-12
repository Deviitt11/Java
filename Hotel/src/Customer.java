class Customer {
   
    // Atributos
    String firstName;
    String secondName;
    int age;
    int roomNumber;
  
    // Método que imprime la info de cada cliente
    public void saveCustomerInfo() {
        System.out.println("First name: " + firstName);
        System.out.println("Second name: " + secondName);
        System.out.println("Age: " + age);
        System.out.println("Room number: " + roomNumber);
   }
}