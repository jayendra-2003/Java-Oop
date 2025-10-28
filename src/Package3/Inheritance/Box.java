package Package3.Inheritance;

public class Box {
   /* private*/   double h;// here we can do any things
    // that we want to but the thing in only in this file

    double l;
    double w;

    Box(){
        this.h=4;
        this.l=5;
        this.w=1;
    }
    Box(double side){
        this.h=side;
        this.w=side;
        this.l=side;
    }
    Box(double l, double h, double w){
        this.l= l;
        this.w=w;
        this.h=h;
    }
    Box(Box old){
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }
}
