
class Calc {

    // Overloaded methods
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public double add(double a, double b) {  
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calc obj = new Calc();
        
        int r1 = obj.add(100, 100);           
        double r2 = obj.add(100.0, 100.0, 300);   

        System.out.println(r1 + " " + r2);
    }
}
