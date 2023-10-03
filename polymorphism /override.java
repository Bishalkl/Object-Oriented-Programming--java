class Test{
    void show(int a){
        System.out.println("TestOne");
    }
}
public class override extends Test{

    void show(int a){
        System.out.println("Testtwo"); // we have to extends otherwise  it will not override.
    }
    public static void main(String[] args) {
        Test t = new Test();
        override o = new override();
        o.show(1);
        t.show(1);

    }
}
