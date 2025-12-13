import java.util.Scanner;
class DataPlan {
    double dataLimit;     
    double allocatedData; 

    DataPlan(double dataLimit) {
        this.dataLimit = dataLimit;
        this.allocatedData = dataLimit;
    }

    void calculateData(double usage) {
        
    }
}

class DailyPlan extends DataPlan {

    DailyPlan() {
        super(2); 
    }

    @Override
    void calculateData(double usage) {
        if (usage > allocatedData) {
            System.out.println("Data limit exceeded");
        } else {
            allocatedData -= usage;
            System.out.println("Daily Plan Remaining Data: " + allocatedData + " GB");
        }
    }
}

class MonthlyPlan extends DataPlan {

    MonthlyPlan() {
        super(50); 
    }

    @Override
    void calculateData(double usage) {
        if (usage > allocatedData) {
            System.out.println("Data limit exceeded");
        } else {
            allocatedData -= usage;
            System.out.println("Monthly Plan Remaining Data: " + allocatedData + " GB");
        }
    }
}

public class Assignment8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter data usage (GB): ");
        double usage = sc.nextDouble();

        DataPlan daily = new DailyPlan();
        DataPlan monthly = new MonthlyPlan();

        daily.calculateData(usage);
        monthly.calculateData(usage);

        sc.close();
    }
}
