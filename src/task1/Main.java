package task1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();


        Scanner sc = new Scanner(System.in);


        System.out.println("Введите количество элементов в коллекции:");
        int n = sc.nextInt();


        System.out.println("Введите элементы коллекции:");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            list.add(x);
        }

        sc.close();

        int sum = list.stream()
                .distinct()
                .filter((Integer r) -> r % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();


        System.out.println("Сумма четных элементов без дубликатов: " + sum);
    }
}
