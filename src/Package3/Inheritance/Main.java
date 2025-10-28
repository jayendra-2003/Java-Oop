package Package3.Inheritance;

public class Main {
    public static void main(String[] args){
        Box box = new Box(4,-2,5);
        Box box1= new Box(box);
        System.out.println(box.w+" "+box.h+" "+box.l);

           BoxWeigth box2 = new BoxWeigth(1,2,3,8);
//        System.out.println(box2.w+" "+box2.l+" "+box2.h+" "+box2.weigth);

           // Box box3 = BoxWeigth(1,2,3,4);
//        no able to access the last weight ..reason in the notes
//                check it out

        // there are many  variables in both parent and child classes
        //you are give acccess to variables that are in the ref variable
        // hence, you should have access to weigth variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of the type parent class, how will you call the constructor of child class

        // BoxWeigth box6 = new Box(1,2,5,4);
         // here the weight is box does not have no idea about what is the weight
// it is saying weight is not inisili... this is why error



    }
}
// anything has private we can only access in that file only