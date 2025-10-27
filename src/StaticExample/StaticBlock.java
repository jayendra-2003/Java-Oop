package StaticExample;

public class StaticBlock {
    static int a = 10;
    static int b;
    //will only once runs once when the first objects is created.
    // when the class is loaded for the firsts time
    static {
        b=a*50;
        System.out.println("i'm in the static block");

    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        StaticBlock.b+=2;
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
    }
}
