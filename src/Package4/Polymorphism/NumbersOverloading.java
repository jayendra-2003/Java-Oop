package Package4.Polymorphism;

 class Number {

    int sum(int a , int b){

        return a+b;
    }

    int sum(int a, int b, int c){

        return a+b+c;
    }

}

class Numbers{
    public static void main(String[] args) {
        Number n = new Number();
        System.out.println(n.sum(1,2));
        System.out.println(n.sum(1,2,4));
    }
}
