package one;

import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę");
        String line = scanner.nextLine();
        System.out.println("Podaj drugą liczbę");
        String line2 = scanner.nextLine();

        try {
            Integer integer = new Integer(line);
            Integer integer2 = Integer.valueOf(line2);

            int firstNumber = integer;
            int secondNumber = integer2;

            System.out.println(firstNumber + secondNumber);
        } catch(NumberFormatException e) {
            System.out.println("Nieprawidłowa wartość;");
        }


//        int liczba = scanner.nextInt();
//        System.out.println("Podaj drugą liczbę");
//        int liczba2 = scanner.nextInt();
//
//        Integer value1 = Integer.valueOf(liczba);
//        Integer value2 = liczba2;
//
//        System.out.println(value1);
//        System.out.println(value2);
//        System.out.println(value1 + value2);
    }

}
