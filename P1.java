class A{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class B extends A{
    void bark(){
        System.out.println("Dog is barking");
    }
}       

public class P1 {
    public static void main(String[] args) {
        B b = new B();
        b.eat();
        b.bark();
    }
}