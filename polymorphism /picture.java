interface shape{
    void draw();
}

class circle implements shape{
    public void draw(){
        System.out.println("Draw the circle");
    }
}

class traingle implements shape{
    public void draw(){
        System.out.println("Dra the traingle");
    }
}

public class picture{
    
    public static void main(String[] args) {
        shape s1 = new circle();
        shape s2 = new traingle();

        s1.draw();
        s2.draw();
    }
}