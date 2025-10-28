    package Package3.Inheritance;

    class Parent{
        int age=2;
        String gender="Male";
        String name="jay";
        boolean edu=true;

        Parent(){
            this.age=age;
            this.edu=edu;
            this.name=name;
            this.gender=gender;
        }

        Parent(int age, String name){
            this.age=age;
            this.name=name;
        }
        Parent(int age,String name, boolean edu){
            this.age=age;
            this.name=name;
            this.edu=edu;
        }
    }

    class Children extends  Parent{


        int no_friends;
        String mother_name;
        String father_name;
        Children(){
            this.no_friends=no_friends;
        }
        Children(int no_friends,int age, String name,boolean edu){

            super.age=age;
            super.name=name;
            super.edu=edu;
            this.no_friends=no_friends;
        }
        Children(String father_name, String mother_name){
            this.father_name=father_name;
            this.mother_name=mother_name;
        }

    }
    class Jayendra extends Children{
        int hi;

        Jayendra(Children ch,int age, String name,boolean edu,int hi, int no_friends){
            this.father_name=ch.father_name;
            this.mother_name=ch.mother_name;
            super.age=age;
            super.name=name;
            super.edu=edu;
            super.no_friends=no_friends;
            this.hi=hi;
        }
        void info(){
            System.out.println("this information is getting form parent to child, child to Jayendra class");
            System.out.println("Name :"+super.name);
            System.out.println("Father name :"+super.father_name);
            System.out.println("Mother name :"+super.mother_name);
        }
    }


    public class MultilevelInheritance {
        public static void main(String[] args) {
             Children ch1= new Children();

//            System.out.println(ch.age);
            Children ch= new Children("Satyanarayana","Dhanalakshmi");
//            System.out.println(ch.edu+" "+ch1.age+" "+ch1.mother_name+" "+ch1.father_name);
             Jayendra jay= new Jayendra(ch,22,"Jayendra",true,8,1);
            jay.info();
        }
    }
// here very object is stored in different memory location