
// Encapsulation ia a mechanism of binding the data members 
// and methods together in a single unit, without providing direct access to the data members.
// It is one of the fundamental concepts of OOPs(Object Oriented Programming System).

class User{
    private String name;
    private int age;
    private String Roll_Number;

    // getter method
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String getRollNumber(){
        return Roll_Number;
    }
    // setter method
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setRollNumber(String Roll_Number){
        this.Roll_Number = Roll_Number;
    }
} 

public class Encapsulation {
    public static void main(String[] args) {
        
        User u1 = new User();
        u1.setName("Sathish Kumar");
        u1.setAge(23);
        u1.setRollNumber("21AG1A4454");
        System.out.println(u1.getName()+" : "+u1.getAge()+" : "+u1.getRollNumber());
    }
    
    
}
