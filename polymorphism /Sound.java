class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    // Correctly overridden
    void sound() {
        System.out.println("Cat meows");
    }
}

class Dog extends Animal {
    // Correctly overridden
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Sound {
    public static void main(String[] args) {
        Animal myCat = new Cat();
        Animal myDog = new Dog();

        myCat.sound();
        myDog.sound();
    }
}
