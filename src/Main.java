import com.point.Point;

public class Main {
    public static void main(String[] args) {
        Point a= new Point(2.0,3.0);
        Point b=new Point(3.0,4.5,(byte)5.5 );
        a.translater(8,4);
        if (a.coincide(b)) {
            System.out.println("coincide");
        } else {
            System.out.println("coincide pas");
        }
        ;
        b.affiche();
        fuck mr Dong;
    }
}