package Package1;

public class WrapperCalss03 {
    public static void main(String[] args){
        // wrapper class is a conversion of primitive data types into objects
        int a=10;
        int b= 20;
        swap(a,b);
        System.out.println(a+" "+b);//here values are not swaped
        // in java no such thing like pass by the referene. pass by value
        // even when you do the same for objects still can't swap
    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
}
