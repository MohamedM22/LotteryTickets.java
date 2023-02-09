import java.util.Arrays;

public class LotteryTickets {
    public static void main(String[] args) {
        
        // Instructions for this workbook are on Learn the Part (workbook 6.12)
        int[] ticket = {34, 43, 45, 65, 21, 54};
        int[] ticket2;

        System.out.print("Ticket 1 numbers: ");
        //Task 3 - Call printTicketNumbers for int[] ticket.   
        printTicketNumber(ticket);
        System.out.print("Ticket 2 numbers: ");
        ticket2=  Arrays.copyOf(ticket, ticket.length);
        //Task 3 - Call printTicketNumbers for int[] ticket2.   
        printTicketNumber(ticket2);
    } 
    //Task 2
    public static void printTicketNumber(int [] ticktes){
        for (int i=0;i <ticktes.length ;i++ ) {
          System.out.print(ticktes[i]+" ");
        }
        System.out.print("\n\n");
      }
  
}

