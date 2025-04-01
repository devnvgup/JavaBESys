package src.main.com.inheritance;

class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Buddy";
        myDog.eat(); // Buddy is eating...
        myDog.bark(); // Buddy is barking!
    }
}

// Kế thừa Inheritance giúp class con tái sử dụng thuộc tích và phương phức của
// class cha
// từ khoá quan trọng:
// extends: kế thừa từ class cha
// super: gọi phương thức hoặc constructor của class cha