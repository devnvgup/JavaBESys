package src.main.com.Polymorphism;

// 1/ Method Overloading

//  + Cùng tên 1 method, nhưng khác nhau về số lượng hoặc kiểu tham số
//  + Xảy ra trong cùng 1 class

class MathUtil {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// 2/Method Overriding:
// + Class con cho ghi đè phương thức của class cha
// + Dùng @Override để tránh lỗi
// Note:
// + @Overide : Xác nhận phương thức đang được ghi đè
// + Lớp con không thể ghi đè phương thức final của lớp cha

class Animal {
    void makeSound() {
        System.out.println("Some sound...");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        MathUtil math = new MathUtil();
        System.out.println(math.add(2, 3)); // 5
        System.out.println(math.add(2, 3, 4)); // 9

        Animal myDog = new Dog();
        myDog.makeSound(); // Woof woof!
    }
}
