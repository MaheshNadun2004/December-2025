import java.util.Scanner;
class Parcel {
    double weight;   

    Parcel(double weight) {
        this.weight = weight;
    }
    double calculateCharge(double distance) {
        return 0;
    }
}

class LocalParcel extends Parcel {

    LocalParcel() {
        super(5); 
    }

    @Override
    double calculateCharge(double distance) {
        double rate = 50; 
        return distance * rate * weight;
    }
}

class InternationalParcel extends Parcel {

    InternationalParcel() {
        super(5); 
    }

    @Override
    double calculateCharge(double distance) {
        double rate = 120; 
        return distance * rate * weight;
    }
}

public class Assignment5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter delivery distance (km): ");
        double distance = sc.nextDouble();

        Parcel local = new LocalParcel();
        Parcel international = new InternationalParcel();

        System.out.println("Local Parcel Charge: Rs. " + local.calculateCharge(distance));
        System.out.println("International Parcel Charge: Rs. " + international.calculateCharge(distance));

        sc.close();
    }
}
