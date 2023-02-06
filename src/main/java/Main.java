import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run(new Scanner(System.in));
    }

    public void run(Scanner scanner) {
        ArrayList<Integer> numbers = inputNumbers(scanner);
        printReversedNumbers(numbers);
        printResultOfAdding(numbers);
        printTheSmallestNumber(numbers);
        printTheBiggestNumber(numbers);

        // napisz swój program tutaj. Do wczytywania danych użyj przekazanego w parametrze scannera
    }

    private void printTheSmallestNumber(ArrayList<Integer> numbers) {
        int smallestNumber = numbers.get(0);
        for (Integer number : numbers) {
            if (number < smallestNumber) {
                smallestNumber = number;
            }
        }
        System.out.println("Najmniejsza liczba w liście to " + smallestNumber);
    }

    private void printTheBiggestNumber(ArrayList<Integer> numbers) {
        int biggestNumber = numbers.get(0);
        for (Integer number : numbers) {
            if (number > biggestNumber) {
                biggestNumber = number;
            }
        }
        System.out.println("Największa liczba w liście to " + biggestNumber);
    }

    private void printResultOfAdding(ArrayList<Integer> numbers) {
        if (!numbers.isEmpty()) {
            int sum = 0;
            StringBuilder sb = new StringBuilder();
            for (Integer number : numbers) {
                sb.append(number);
                sb.append(" + ");
                sum += number;
            }
            sb.replace(sb.length() - 2, sb.length(), "= ");
            sb.append(sum);
            System.out.println(sb);
        }

    }

    private void printReversedNumbers(ArrayList<Integer> numbers) {
        if (!numbers.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (int i = numbers.size() - 1; i >= 0; i--) {
                sb.append(numbers.get(i));
                sb.append(", ");
            }
            sb.replace(sb.length() - 2, sb.length(), "");
            System.out.println(sb);
        }

    }

    private static ArrayList<Integer> inputNumbers(Scanner scanner) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int status = 1;
        do {
            int number = scanner.nextInt();
            if (number < 0) {
                status = number;
                break;
            }
            numbers.add(number);
        } while (status >= 0);
        return numbers;
    }
}
