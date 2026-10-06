package introducaopoo.exercicio2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.height = 3.0;
        rectangle.width = 4.0;

        System.out.println("AREA: " + rectangle.Area());
        System.out.println("AREA: " + rectangle.Perimeter());
        System.out.println("AREA: " + rectangle.Diagonal());


    }
}
