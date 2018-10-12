package two;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean run = true;

        List<String> list = new ArrayList<>();

        while (run) {
            System.out.println("Podaj liczbę");
            String line = scanner.next();
            if (line.equals("koniec")) {
                run = false;
            } else {
                list.add(line);
            }

        }

        System.out.println("Elementów jest " + list.size());

        for (String elem: list
             ) {
            System.out.println(elem);
        }

        System.out.println(list.toString());


    }
}