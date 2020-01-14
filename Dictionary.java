import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {

        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");
        Scanner Word = new Scanner(System.in);
        System.out.println( "input your English word : ");
        String search = Word.nextLine();
        String result = dictionary.get(search);
        if (result != null) {
            System.out.println("Your Word : " + search);
            System.out.println("Meaning : " + result);
        } else {
            System.out.println("Not found");
        }
    }
}
