import java.util.Scanner;

public class Main {
    static String inputString =
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                    "sed do eiusmod tempor incididunt ut labore et dolore magna " +
                    "aliqua. Ut enim ad minim veniam, quis nostrud exercitation " +
                    "ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis " +
                    "aute irure dolor in reprehenderit in voluptate velit esse " +
                    "cillum dolore eu fugiat nulla pariatur. Excepteur sint " +
                    "occaecat cupidatat non proident, sunt in culpa qui officia " +
                    "deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;

        WordsChecker wordChecker = new WordsChecker(inputString);

        while (true) {
            System.out.println("Введите слово для проверки или <end> для выхода:");
            s = sc.nextLine();
            if (s.equals("end")) {
                break;
            }
            System.out.printf("Слово %s %s в тексте.\n", s, (wordChecker.hasWord(s) ? "присутствует" : "отсутствует"));
        }
    }
}
