class Employee {
    public void salary() {
        System.out.println("Employee salary");
    }
}
class FullTimeEmployee extends Employee {
    @Override
    public void salary() {
        System.out.println("Full-time employee salary: $5000");
    }
}
class PartTimeEmployee extends Employee {
    @Override
    public void salary() {
        System.out.println("Part-time employee salary: $2000");
    }
}
class Intern extends Employee {
    @Override
    public void salary() {
        System.out.println("Intern stipend: $1000");
    }
}
public class p3 {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee();
        Employee e2 = new PartTimeEmployee();
        Employee e3 = new Intern();

        e1.salary(); 
        e2.salary();
        e3.salary();
    }
}
