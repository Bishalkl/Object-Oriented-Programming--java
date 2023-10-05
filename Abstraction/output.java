abstract class Vehical{
    int num_tyres;
    abstract void start();
}

class Car extends Vehical{
    int num_tyres  = 4;
    void start(){
        System.out.println("Start with key");
    }

}

class Bike extends Vehical{
    int num_tyres = 2;
    void start(){
        System.out.println("Start with kick");
    }
}

public class output{
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();
        c.start();
        b.start();
    }
}