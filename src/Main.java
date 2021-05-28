import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class Main {

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary(new String[]{"javascript", "java", "ruby", "php", "python", "coffeescript"});
        String x = dictionary.findMostSimilar("java"); // must return "strawberry"
        String y = dictionary.findMostSimilar("javascript"); // must return "cherry"


        Dictionary fruit = new Dictionary(new String[]{"cherry", "pineapple", "melon", "strawberry", "raspberry"});
        assertEquals("strawberry", fruit.findMostSimilar("strawbery"));
        assertEquals("cherry", fruit.findMostSimilar("berry"));
    }



}

