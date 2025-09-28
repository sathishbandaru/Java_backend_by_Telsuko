// import java.util.*;

class Mobile{
    String name;
    int price;
    static String type;

    // static block executes only once, 
    // meaning when  we are using a static variable,
    //  no need to assign multiple time as it is same for all objects
    static{
        type = "SmartPhone";
    }

    // default constructor
    Mobile(){

    }
    // parameterized constructor
    Mobile(String name, int price){
        this.name = name;
        this.price = price;
    }
    void display(Mobile obj){
        System.out.println(obj.name +" " + obj.price + " " + type);
    }

}

public class static_method{
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.name = "Nothing";
        m1.price = 20000;
        m1.display(m1);
        Mobile m2 = new Mobile("Iphone", 100000);
        m2.display(m2);
    }
} 