import java.util.Scanner;
class Ticket {
    double seatPrice;

    Ticket(double seatPrice) {
        this.seatPrice = seatPrice;
    }

    double calculatePrice(int seats) {
        return 0;
    }
}

class RegularTicket extends Ticket {

    RegularTicket() {
        super(500); 
    }

    @Override
    double calculatePrice(int seats) {
        if (seats > 10) {
            System.out.println("Group booking not allowed");
            return 0;
        }
        return seats * seatPrice;
    }
}

class PremiumTicket extends Ticket {

    PremiumTicket() {
        super(1000); 
    }

    @Override
    double calculatePrice(int seats) {
        if (seats > 10) {
            System.out.println("Group booking not allowed");
            return 0;
        }
        return seats * seatPrice;
    }
}

public class Assignment7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of seats: ");
        int seats = sc.nextInt();

        Ticket regular = new RegularTicket();
        Ticket premium = new PremiumTicket();

        System.out.println("Regular Ticket Price: Rs. " + regular.calculatePrice(seats));
        System.out.println("Premium Ticket Price: Rs. " + premium.calculatePrice(seats));

        sc.close();
    }
}
