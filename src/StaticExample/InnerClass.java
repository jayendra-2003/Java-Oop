package StaticExample;

public class InnerClass {
    static  class A {
        int count;
        int no;

        A(int count, int no) {
            this.count = count;
            this.no = no;
        }
    }
     public static void main (String[]args){
       A a = new A(4,1);
         System.out.println(a.count);

    }
}
