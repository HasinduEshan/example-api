class A{
    public void printDataCallingThisMethod(){
        System.out.println("Class A");
    }
}
class B extends A{
    @Override
    public void printDataCallingThisMethod(){
        System.out.println("Class B");
    }
}
public class Example {
    public static void main(String[] args) {
        B b = new B();
        b.printDataCallingThisMethod();
    }
}
