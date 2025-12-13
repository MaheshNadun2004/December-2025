import java.util.Scanner;
class Membership {
    double monthlyFee(int months) {
        return 0;
    }
}

class BasicMembership extends Membership {
    @Override
    double monthlyFee(int months) {
        double fee = 1000; 

        if (months < 1) {
            System.out.println("Invalid duration");
            return 0;
        }
        return months * fee;
    }
}

class PremiumMembership extends Membership {
    @Override
    double monthlyFee(int months) {
        double fee = 2500; 

        if (months < 1) {
            System.out.println("Invalid duration");
            return 0;
        }
        return months * fee;
    }
}

public class Assignment4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of months: ");
        int months = sc.nextInt();

        Membership basic = new BasicMembership();
        Membership premium = new PremiumMembership();

        System.out.println("Basic Membership Fee: " + basic.monthlyFee(months));
        System.out.println("Premium Membership Fee: " + premium.monthlyFee(months));

        sc.close();
    }
}
