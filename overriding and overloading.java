class Parent {
    void display() {
        System.out.println("Parent's display method");
    }
    void display(String message) {
        System.out.println("Parent's display method with message: " + message);
    }

    void greet() {
        System.out.println("Hello from Parent");
    }
}
class Child extends Parent {
    void greet() {
        System.out.println("Hello from Child");
    }
}
public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        parent.display();
        parent.display("Overloaded");

        parent.greet();
        child.greet();
    }
}
