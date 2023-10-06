package interfaces;
// making interface
interface Detail{
    public void displayDetail();
}

// class for Student1
class BishnuLimbu implements Detail{

    public String name = "Bishnu Limbu";
    public int age = 20;
    public String address = "Morang";
    
    public void displayDetail(){
        System.out.println("My name is"+" "+name+"."+" "+"I am from"+" "+address+"."+" "+"I am"+" "+age+" "+"years old.");
    }
    
}

// class for Student2
class BishalKoirala implements Detail{

    public String name = "Bishal Koirala";
    public int age = 20;
    public String address = "Morang";

    // method for display detail
    public void displayDetail(){
         System.out.println("My name is"+" "+name+"."+" "+"I am from"+" "+address+"."+" "+"I am"+" "+age+" "+"years old.");
    }
}

// class for student3
class RoshanLimbu implements Detail{

    public String name = "Roshan Limbu";
    public int age = 20;
    public String address = "Morang";

    // method for display detail
    public void displayDetail(){
         System.out.println("My name is"+" "+name+"."+" "+"I am from"+" "+address+"."+" "+"I am"+" "+age+" "+"years old.");
      
    }
}


// main class for compile 
public class StudentDetail {
    public static void main(String[] args) {

        // calling the constructor
        BishnuLimbu s1 = new BishnuLimbu();
        BishalKoirala s2 = new BishalKoirala();
        RoshanLimbu s3 = new RoshanLimbu();

        // executing the value
        s1.displayDetail();
        s2.displayDetail();
        s3.displayDetail();
    }  
}


