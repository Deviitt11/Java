class Main {
    public static void main(String[ ] args) {
        Name name = new Name();
        //set priority
        name.setPriority(Thread.MIN_PRIORITY);
        
        
        Welcome welcome = new Welcome();
        //set priority
        welcome.setPriority(Thread.MAX_PRIORITY);
        
        
        name.start();
        welcome.start();
    }
}