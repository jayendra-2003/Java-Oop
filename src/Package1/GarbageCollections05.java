package Package1;

class GarbageCollections05{
    public static void main(String[] args){
        People ppl;
        for(int i=1;i<=10000000;i++){
            ppl= new People("male");
        }
    }
}
class People{
    int count;
    String gender;
    People(String gender){
        this.gender=gender;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is distroyed");
    }
}