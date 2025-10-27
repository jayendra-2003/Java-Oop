package Package1;

public class Constructor02 {
    public static void main(String[] args){
        Human  h= new Human();
        Human name= new Human(25,"oops","male");
        System.out.println(h.name);
        System.out.println(h.gender);
        System.out.println(h.age);
        h.greeting();
        System.out.println(name.name);

    }
}
class  Human{

    String gender;
    int age;
    String name;


    void greeting(){
        System.out.println("my name is "+this.name);
    }

     Human(){
        this.gender="male";
        this.age=22;
        this.name="Jayendra";
     }
     Human(int age,String name, String gender){
        this.age=age;
        this.gender=gender;
        this.name=name;

     }
}

