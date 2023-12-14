class MethodOverloadingExample {
    int add(int a, int b) {
        return (a + b);
    }

    int add(int a, int b, int c) {
        return (a + b + c);
    }

    double add(double a, double b) {
        return (a + b);
    }

    double add(int a, double b) {
        return (a + b);
    }
}

// Base Class
class Parent {
    void view() {
        System.out.println("This is a parent class method");
    }
}

class Child extends Parent {
    @Override
    void view() {
        System.out.println("This is a child class method");
    }
}

public class Demo {
    public static void main(String args[]) {
        MethodOverloadingExample ob = new MethodOverloadingExample();
        System.out.println("Calling add method with two int parameters: " + ob.add(17, 25));
        System.out.println("Calling add method with three int parameters: " + ob.add(55, 27, 35));
        System.out.println("Calling add method with two double parameters: " + ob.add(36.5, 42.8));
        System.out.println("Calling add method with one int and one double parameter: " + ob.add(11, 24.5));

        Parent obj = new Parent();
        obj.view();
        Parent obj1 = new Child();
        obj1.view();
    }
}
