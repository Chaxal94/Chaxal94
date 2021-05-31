public class Main {
    public static void main(String[] args) {
        Shape aShape = new Shape("red",true);
        Circle aCircle = new Circle(1.0,"red",true);
        Rectangle aRectangle = new Rectangle(1.0,1.0,"red",true);
        Square aSquare = new Square(1.0,"red",true);
        System.out.println(aShape);
        System.out.println(" ");
        System.out.println(aCircle);
        System.out.println(" ");
        System.out.println(aCircle.getPerimeter());
        System.out.println(" ");
        System.out.println(aCircle.getArea());
        System.out.println(" ");
        System.out.println(aRectangle);
        System.out.println(" ");
        System.out.println(aRectangle.getArea());
        System.out.println(" ");
        System.out.println(aRectangle.getPerimeter());
        System.out.println(" ");
        System.out.println(aSquare.toString());






    }
}
