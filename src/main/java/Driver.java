import src.main.java.Calculator;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("Pilih operasi:");
            System.out.println("1. Penjumlahan");
            System.out.println("2. kureng");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("0. Keluar");

            System.out.print("Masukkan pilihan: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            System.out.print("Masukkan nilai pertama: ");
            int a = scanner.nextInt();

            System.out.print("Masukkan nilai kedua: ");
            int b = scanner.nextInt();

            int result;

            switch (choice) {
                case 1:
                    result = calculator.add(a, b);
                    System.out.println("Hasil penjumlahan: " + result);
                    break;
                case 2:
                    result = calculator.subtract(a, b);
                    System.out.println("Hasil pengurangan: " + result);
                    break;
                case 3:
                    result = calculator.multiply(a, b);
                    System.out.println("Hasil perkalian: " + result);
                    break;
                case 4:
                    try {
                        result = calculator.divide(a, b);
                        System.out.println("Hasil pembagian: " + result);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }
}
