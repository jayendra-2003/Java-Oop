public class FinalKeyWord04 {
    public static void main(String[] args){
      A std= new A(10);
       std= new A(500);

        System.out.println(std.a);
    }
}
class A{
    int a;
    A(int a){
        this.a=a;
    }
}
