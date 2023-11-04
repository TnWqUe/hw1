package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String name = console.nextLine();
        while (name.length()==0) {
            System.out.println("Введена пустая строка. Введите повторно.");
            name = console.nextLine();
        }
        System.out.println("Введите натуральное число N:");
        int N = console.nextInt();
        if (N>0) {
            while (N>0) {
                System.out.println(name);
                N--;
            }
        } else  {
            System.out.println(name);
        }
    }
}
