package src.main.com.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Truong");
        names.add("Nga");
        names.add("Cachua");
        names.add("Daubap");

        // loop
        for (String name : names) {
            System.out.println(name);
        }

        names.remove("Bob");

        System.out.println("Phần tử thứ 2: " + names.get(1));

        // Khởi tạo mặc định:
        ArrayList<String> l1 = new ArrayList<>();

        // Khởi tạo sức chứa với size:
        ArrayList<String> l2 = new ArrayList<>(20);

        // Khởi tạo từ 1 collection khác:
        List<String> oldList = List.of("Java", "Python", "C++");
        ArrayList<String> l3 = new ArrayList<>(oldList);

        // -------------------------------------------------------------//
        List<String> l4 = new ArrayList<>();
        // Thêm phần tử vào ArrayList
        l4.add("hello world");
        // Thêm phần tử vào vị trí cụ thể:
        l4.add(2, "hi");

        // Lấy phần tử theo index
        String idx2 = l4.get(2);

        // Lấy vị trí phần từ tại index:
        int idx = l4.indexOf("hi");

        // Lấy phần tử cuối cùng:
        String lastEl = l4.get(l4.size() - 1);

        // Xoá phần tử trong ArrayList
        l4.remove(1); // remove by index
        l4.remove("hi"); // remove by val

        // Xoá tất cả các phần tử
        l4.clear();

        // Kiểm tra sự tồn tại của phần tử:
        boolean exists = l4.contains("hi");

        // Cập nhật giá trị phần tử tại index
        l4.set(1, "Cin chào");

        // Kích thước của ArrayList
        int size = l4.size();

        // loop
        for (int i = 0; i < l4.size(); i++) {
            System.out.println(l4.get(i));
        }

        // for-each
        for (String el : l4) {
            System.out.println(el);
        }

        // forEach
        l4.forEach((item) -> {
            System.out.println(item);
        });

        // Chuyển ArrayList sang mảng:
        String[] array = l4.toArray(new String[0]);

        // Sắp xếp ArrayList
        Collections.sort(l4);

        // Sắp xếp giảm dần:
        l4.sort(Collections.reverseOrder());

        // Gộp nhiều ArrayList

        ArrayList<String> list1 = new ArrayList<>(List.of("A", "B"));
        ArrayList<String> list2 = new ArrayList<>(List.of("C", "D"));

        list1.addAll(list2);

        // Lọc phần tử trong ArrayList
        List<String> filteredList = l4.stream()
                .filter(s -> s.startsWith("J"))
                .collect(Collectors.toList());

        // Loại bỏ phần tử trùng lặp
        Set<String> uniqueSet = new HashSet<>(l4);
        l4.clear();
        l4.addAll(uniqueSet);

        // Dùng ArrayList làm Stack

        ArrayList<Integer> stack = new ArrayList<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);

        // Lấy phần tử cuối cùng
        int lastElement = stack.remove(stack.size() - 1);

    }

}

// Note: Sự khác nhau giữa Array, ArrayList và List:

// Array int[] numbers = new int[3];
