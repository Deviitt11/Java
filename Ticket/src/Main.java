import java.util.Scanner;

class Main {
   public static void main(String[] args) {

       Scanner read = new Scanner(System.in);

       String movie = read.nextLine();
       int row = read.nextInt();
       int seat = read.nextInt();

       Ticket ticket = new Ticket(movie, row, seat);

       System.out.println("Movie: " + ticket.getMovie());
       System.out.println("Row: " + ticket.getRow());
       System.out.println("Seat: " + ticket.getSeat());
   }
}
