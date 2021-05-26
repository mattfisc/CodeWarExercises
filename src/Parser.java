import java.util.Scanner;

public class Parser {

    public static int parseInt(String numStr) {
        int answer = 0;

        String[] tokens = numStr.split("-| ");

        int count = 0;
        for(int i = tokens.length; i >= 0; i--){
            String word = tokens[i];

            if(word.equals("hundred") || word.equals("thousand")){
                count = convert_string_to_int(word) * convert_string_to_int(tokens[i--]);
                i--;
            }
            else
                count = convert_string_to_int(word);

            answer += count;

            if( count == -1)
                return -1;

        }
        return answer;
    }

    public static int convert_string_to_int(String num){
        switch (num) {
            case "one": return 1;
            case "two": return 2;
            case "three": return 3;
            case "four" : return 4;
            case "five" : return 5;
            case "six" : return 6;
            case "seven" : return 7;
            case "eight" : return 8;
            case "nine" : return 9;
            case "ten" : return 10;
            case "eleven" : return 11;
            case "twelve" : return 12;
            case "thirteen" : return 13;
            case "fourteen" : return 14;
            case "fiveteen" : return 15;
            case "sixteen" : return 16;
            case "seventeen" : return 17;
            case "eighteen"  : return 18;
            case "nineteen" : return  19;
            case "twenty" : return 20;
            case "thirty" : return 30;
            case "fourty" : return 40;
            case "fifty" : return 50;
            case "sixty" : return 60;
            case "seventy" : return 70;
            case "eighty" : return 80;
            case "ninety" : return 90;
            case "hundred" : return 100;
            case "thousand" : return 1000;


        }

        return -1;
    }
}