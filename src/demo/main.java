package demo;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        StaffManager nhanvien1 = new StaffManager(10);
        Scanner input = new Scanner(System.in);
        int choice;

        //sử dụng do...while để lặp lại yêu cầu menu
        do {
            System.out.println("Menu");
            System.out.println("1. Thêm Student");
            System.out.println("2. Sửa thông tin Student");
            System.out.println("3. Xóa Student");
            System.out.println("4. Hiển thị thông tin Student");
            System.out.println("0. Thoát");
            System.out.println("Nhập vào lựa chọn của bạn: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    StaffManager.addStaff(scanner);
                    break;
                case 2:
                    StaffManager.updateStaff();
                    break;
                case 3:
                    StaffManager.deleteStaff();
                    break;
                case 4:
                    StaffManager.display();
                    break;
            }
            System.out.println("-------------------------");
        } while (choice != 0);
    }
}