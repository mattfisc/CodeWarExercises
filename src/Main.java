import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Parser p = new Parser();

        int num = p.parseInt("one two three");
        System.out.println(num);
    }


}

