import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Dictionary fruits = new Dictionary(new String[]{"cherry", "pineapple", "melon", "strawberry", "raspberry"});

        String x = fruits.findMostSimilar("strawbery"); // must return "strawberry"
        String y = fruits.findMostSimilar("berry"); // must return "cherry"

        System.out.println(x);
        System.out.println(y);
    }


}

