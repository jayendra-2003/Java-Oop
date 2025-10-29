package Package4.Polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        Circle c = new Circle();
        Square s = new Square();
        area a = new area();
// reference avriable is type of parent class
        area square = new Square();
                 // obj is type square

        square.area();
        // here im getting output is "this is from area" how?

    }
}
