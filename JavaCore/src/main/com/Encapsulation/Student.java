package src.main.com.Encapsulation;
// Encapsulation giúp bảo vệ dữ liệu bên trong class bằng cách sử dụng private và cung cấp getter/setter để truy xuất dữ liệu

public class Student {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
}

// Lợi ích:
// + Bảo vệ dữ liệu: Không thể truy cập trực tiếp vào biến
// + Kiểm soát dữ liệu: Có thể thêm logic vào setter
// + Dễ bảo trì: Nếu thay đổi logic bên trong chỉ cần sửa getter và setter