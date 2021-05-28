import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary(new String[]{"javascript", "java", "ruby", "php", "python", "coffeescript"});
        String x = dictionary.findMostSimilar("java"); // must return "strawberry"
        String y = dictionary.findMostSimilar("javascript"); // must return "cherry"

        System.out.println(x);
        System.out.println(y);
    }


}

