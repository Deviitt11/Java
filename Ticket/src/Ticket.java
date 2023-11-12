public class Ticket {

   public String movie;
   public int row;
   public int seat;

   //complete the constructor
   public Ticket(String movie, int row, int seat) {
       this.movie = movie;
       this.row = row;
       this.seat = seat;
       
   }

   public String getMovie() {
       return movie;
   }

   public int getRow() {
       return row;
   }

   public int getSeat() {
       return seat;
   }
}