class patten{
    public void display(){
        for(int i=0 ; i<10 ; i++){
            System.out.println("*");
        }
    }
    public void display(char symbol){
        for(int i=0 ; i<10 ; i++){
            System.out.println(symbol);
        }
    }
}
public class p3{
    public static void main(String[]args){
        patten pt = new patten();
        pt.display();
        pt.display('#');
    }
}
