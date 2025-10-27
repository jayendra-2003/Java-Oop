package StaticExample;

class Main{
    public static void main(String[] args) {
        HumanClass jayendra = new HumanClass(22,"Jayendra",100000,false);
        HumanClass naidu = new HumanClass(22,"Jayendra",100000,false);
        HumanClass  harshitha  = new HumanClass(22,"Jayendra",100000,false);

        System.out.println(HumanClass.population);
        // here this is static no object is not required
        // so you can't use non static method in
        // in static method (|^that is belongs to object)
        //greeting(); //here you cant use this because it requires a instance

        // you cant access non static stuff without referencing their instance in
        // a static context

        //hence, here Iam   referencing it
            Main obj= new Main();
            obj.greeting();


    }
    // here this is non static so it requires a object and it's belongs
    // to a object
    void greeting(){
        System.out.println("hello jayendra this is non static function");
    }

}



