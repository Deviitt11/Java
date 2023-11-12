class Student {

   public String name;
   public int age;
   
   public int getAge() {
       //complete Getter
       if (age < 0) {
           return 0;
       }
       else {
           return age;
       }
       
   }
   public void setAge(int age) {

           this.age = age;
       
       
   }
}