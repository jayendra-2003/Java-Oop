package Package1;

class CreatingClass{
    public static void main(String[] args){
        Student std= new Student();
        //to link the reference variable with the name of Instance variable is called
        // separator. using this we can access
        std.name="Jayendra";
        std.rollNo=85;
        std.marks=7.84f;
        System.out.println(std.name);
        System.out.println(std.rollNo);
        System.out.println(std.marks);
    }
}
class Student{
    int rollNo;
    float marks;
    String name;

}