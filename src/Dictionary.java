// Did you mean
public class Dictionary {

    private final String[] words;

    public Dictionary(String[] words) {
        this.words = words;
    }

    public String findMostSimilar(String to) {


        int max_score = 0;
        String most_correct_word = "";

        // check each word
        for(String word : words){
            int temp_score = 0;

            boolean in_a_row = false;

            // correct word
            for(int i = 0, position = 0; i < word.length(); i++){

                // input word
                for(int j = position; j < to.length(); j++){

                    // correct char found in second word
                    if(word.charAt(i) == to.charAt(j)){
                        temp_score++;

                        // extra point for in a row
                        if(in_a_row)
                            temp_score++;
                        else
                            in_a_row = true;

                        // save word position and letters not getting double counted
                        position = j;

                        // break for time complexity
                        break;
                    }
                    // not found
                    in_a_row = false;
                }

                // most similar word found

                double t = temp_score -  Math.abs( to.length() - word.length() );
                double m = max_score - Math.abs( most_correct_word.length() - word.length() );



                if( t > m ) {
                    most_correct_word = word;
                    max_score = temp_score;
                }


            }
        }
        System.out.print("max: ");
        System.out.println(most_correct_word + " " +
                max_score );


        if(most_correct_word.equals(""))
            return null;
        else
            return most_correct_word;
    }
}