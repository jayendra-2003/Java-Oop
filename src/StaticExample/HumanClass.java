package StaticExample;

public class HumanClass {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;
    public HumanClass(int age, String name,int salary, boolean married){
        this.age=age;
        this.name=name;
        this.married=married;
        this.salary=salary;
        HumanClass.population+=1;
    }
}
