package alumno;

class Alumno{
    private int age;
    
    public void  setAge(int a){
       if(a > 6) {
           this.age = a;
           System.out.println("Welcome");
       }
       else {
           System.out.println("Sorry");
       }
    }
    
    public int getAge(){
        return age;
    }
}