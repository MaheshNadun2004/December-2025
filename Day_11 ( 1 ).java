class Polygon{
    public void render(){
        System.out.println("Rendering polygon");
    }
}
class Squre extends Polygon{
    public void render(){
        System.out.println("Rendering Squre");
    }
}
class Circlu extends Polygon{
    public void render(){
        System.out.println("Rendering Circlu");
    }
}
public class p3{
    public static void main(String[]rgs){
        Squre sq = new Squre();
        sq .render();

        Polygon po = new Polygon();
        po.render();

        Circlu ci = new Circlu();
        ci.render();
    }
}
