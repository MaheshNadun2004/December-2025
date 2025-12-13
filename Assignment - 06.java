import java.util.Scanner;
class Room {
    double pricePerNight;

    Room(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    double totalCost(int nights) {
        return 0;
    }
}

class StandardRoom extends Room {

    StandardRoom() {
        super(5000); /
    }
    @Override
    double totalCost(int nights) {
        double cost = nights * pricePerNight;

        if (nights > 7) {
            cost = cost * 0.90; 
        }
        return cost;
    }
}

class DeluxeRoom extends Room {

    DeluxeRoom() {
        super(8000); 
    }

    @Override
    double totalCost(int nights) {
        double cost = nights * pricePerNight;

        if (nights > 7) {
            cost = cost * 0.85; 
        }
        return cost;
    }
}

public class Assignment6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nights: ");
        int nights = sc.nextInt();

        Room standard = new StandardRoom();
        Room deluxe = new DeluxeRoom();

        System.out.println("Standard Room Total Cost: Rs. " + standard.totalCost(nights));
        System.out.println("Deluxe Room Total Cost: Rs. " + deluxe.totalCost(nights));

        sc.close();
    }
}
