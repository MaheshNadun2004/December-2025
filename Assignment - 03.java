import java.util.Scanner;
class Appliance {
    double powerRating; 

    Appliance(double powerRating) {
        this.powerRating = powerRating;
    }
    double calculateUsage(double hours) {
        return 0;
    }
}

class Fan extends Appliance {

    Fan() {
        super(75); 
    }
    @Override
    double calculateUsage(double hours) {
        return (powerRating * hours) / 1000;
    }
}

class AirConditioner extends Appliance {

    AirConditioner() {
        super(1500); 
    }
    @Override
    double calculateUsage(double hours) {
        return (powerRating * hours) / 1000;
    }
}

public class Assignment3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of hours used: ");
        double hours = sc.nextDouble();

        Appliance fan = new Fan();
        Appliance ac = new AirConditioner();

        System.out.println("Fan power consumption: " + fan.calculateUsage(hours) + " units");
        System.out.println("Air Conditioner power consumption: " + ac.calculateUsage(hours) + " units");

        sc.close();
    }
}
