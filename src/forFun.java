class Mammal {
    String name;

    Mammal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println("I am eating");
    }
}

class Horse extends Mammal {
        Horse(String name){
            super(name);
        }
    void displayName() {
        System.out.println("My name is " + name);
    }
}

class forFun {
    public static void main(String[] args) {
        Horse arabianHorse = new Horse("Jayendra");
        arabianHorse.eat();
        arabianHorse.displayName();
    }
}