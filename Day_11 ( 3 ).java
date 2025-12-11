class Calculator {
    public void number() {
        System.out.println("No numbers provided");
    }
    public void number(int num) {
        System.out.println("Single integer: " + num);
    }
    public void number(int num1, int num2) {
        System.out.println("Sum of integers: " + (num1 + num2));
    }
    public void number(double num1, double num2) {
        System.out.println("Sum of doubles: " + (num1 + num2));
    }
}
public class p3 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.number();                
        calc.number(5);            
        calc.number(3, 7);            
        calc.number(2.5, 3.7);        
    }
}
