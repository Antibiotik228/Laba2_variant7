import java.io.IOException;
import java.util.Scanner;

public class Tasks {
    /*
     * 7. а) видаляє всі слова, що містять непарну кількість приголосних літер;
     * б) видаляє з тексту всі слова-паліндроми.
     * */
    public static void task1() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть рядок : ");
        String str = scanner.nextLine();

        String[] words = str.split("[\\s]+");

        if(str.length() == 0 || words.length == 0){
            throw new IOException("Не був введений рядок!");
        }

        task1_a(words.clone());
        task1_b(words.clone());
    }

    /*
    * а) видаляє всі слова, що містять непарну кількість приголосних літер;
    * */
    private static void task1_a(String[] words){
        char[] vowels={'e', 'y', 'u', 'i', 'o', 'a', 'у', 'е', 'ї', 'і', 'а', 'о', 'є', 'я', 'и', 'ю'};

        String str = "";
        for (String p : words) {
            char[] chars = p.toCharArray();
            int count = 0;
            for(char ch : chars) {
                boolean flag = true;
                for (char ch1 : vowels)
                    if (ch == ch1) {
                        flag = false;
                        break;
                    }

                    if(flag == true)
                        count++;
            }

            if(count == 0)
                str += p + " ";
            else if(count%2 == 0)
                str += p + " ";
        }

        System.out.println("\nРезультат виконання завдання 'a' :\n" + str);
        System.out.println();
}

    /*
    * б) видаляє з тексту всі слова-паліндроми
    * */
    private static void task1_b(String[] words){
        String str = "";
        for (String p : words) {
            char[] word = p.toCharArray();
            boolean flag = true;
            for(int i = 0;i<word.length/2;i++)
                if(word[i] != word[word.length - i - 1]){
                    flag = false;
                    break;
                }

            if(!flag)
                str += p + " ";
        }

        System.out.println("\nОтриманий рядок після завдання 'б' :\n" + str);
    }
}
