package src.main.com.Abstraction;

// Abstraction giúp ẩn đi chi tiết triển khai, chỉ tập trung vào những gì cần thiết
// Có 2 cách thực hiện Abstraction:
// 1. Abstract Class
// 2. Interface

// 1 Abstract Class
// Là một class nhưng không thể tạo Object
// Có thể chứa phương thức có thân và phương thức trừu tượng
// Dùng extends để kế thừa

abstract class Animal {
    abstract void makeSound();

    void sleep() {
        System.out.println("Sleeping .... zzz");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof Woof");
    }
}

// 2 Interface
// không chứa phương thức có thân (trước java 8)
// Dùng implements để thực hiện

interface Animal1 {
    void makeSound();
}

class Cat implements Animal1 {
    @Override
    public void makeSound() {
        System.out.println("Meow meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Woof woof!
        myDog.sleep(); // Sleeping...

        Cat myCat = new Cat();
        myCat.makeSound(); // Meow meow!
    }
}
