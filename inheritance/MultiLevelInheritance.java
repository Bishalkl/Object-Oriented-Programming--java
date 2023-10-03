class Animal{
    void eat(){
        System.out.println("Dog is eating.");
    }
}

class Dog extends Animal{ 
  void beat(){
    System.out.println("Dog is beating.");
  }
}

class GermanShepherd extends Dog{
    void head(){
    System.out.println("German Shepherd is an expensive dog.");
    super.eat();
    beat();
  }
}

public class MultiLevelInheritance  extends GermanShepherd{ // now gone error //
  public static void main(String[] args) {
    GermanShepherd obj3 = new GermanShepherd();
    obj3.head();
    
  }
}
