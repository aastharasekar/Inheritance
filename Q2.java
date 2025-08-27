import java.util.*;
class FlightTicket {
    int ticketNo;
    String passengerName;
    String seatClass;

    FlightTicket(int ticketNo, String passengerName, String seatClass){
        this.ticketNo = ticketNo;
        this.passengerName = passengerName;
        this.seatClass = seatClass;
    }

    void Charges(){
         int BaseAmount = 5000;
         int finalAmount;
         int AmountBeforeGST;
         int GST;
         

         switch(seatClass){
            case "Economy":
                AmountBeforeGST = BaseAmount;
                GST = (18 * AmountBeforeGST )/100;
                finalAmount = AmountBeforeGST + GST;
                System.out.println("Final Amount: "+finalAmount);
                break;
            case "Business":
                AmountBeforeGST = BaseAmount + 2500;
                GST = (18 * AmountBeforeGST )/100;
                finalAmount = AmountBeforeGST + GST;
                System.out.println("Final Amount: "+finalAmount);
                break;
            case "First Class":
                AmountBeforeGST = BaseAmount + 5000;
                GST = (18 * AmountBeforeGST )/100;
                finalAmount = AmountBeforeGST + GST;
                System.out.println("Final Amount: "+finalAmount);
                break;
            default:
                System.out.println("Invalid Seat Class");
                return;
         }
       
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Ticket No: ");
        int ticketNo = sc.nextInt();
        sc.nextLine();  
        System.out.print("Enter Passenger Name: ");
        String passengerName = sc.nextLine();
        System.out.print("Enter Seat Class: ");
        String seatClass = sc.nextLine();

        FlightTicket obj = new FlightTicket(ticketNo, passengerName, seatClass);
        obj.Charges();
    }
}

    