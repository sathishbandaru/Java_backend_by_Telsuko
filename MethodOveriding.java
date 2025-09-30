
class Calc{
    public int add(int a, int b){
        return a + b;
    }
}

class AdvCalc extends Calc{

    @Override
    public int add(int a, int b){
        return a + b + 100;
    }
}


public class MethodOveriding {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int result = obj.add(100,200);
        System.out.println(result);
    }
}
