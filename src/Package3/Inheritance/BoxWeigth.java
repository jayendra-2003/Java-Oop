package Package3.Inheritance;

public class BoxWeigth extends  Box{

    double weigth;

    BoxWeigth(double weigth){
        this.weigth=weigth;

    }
    BoxWeigth(double l, double h, double w, double weigth){
       super(l,h,w);// call the parent constructor
        //used to initialised  values present in parent class
        this.weigth=weigth;

        System.out.println(this.weigth);
        // this.weigth is also working consiber when we have weigth propertie in parent class using this keyword
       // we can able to call only this class..so using super key word we can get the parent class propertie
    }
}
