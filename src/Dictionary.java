// Did you mean
public class Dictionary {

    private final String[] words;

    public Dictionary(String[] words) {
        this.words = words;
    }

    public String findMostSimilar(String to) {


        int max_correct_char_count= 0;
        int max_correct_in_a_row_count = 0;
        String most_correct_word = "";

        // check each word
        for(String word : words){
            int correct_chr_count = 0;
            int correct_in_a_row_count = 0;

            // correct word
            for(int i = 0, position=0; i < word.length(); i++){
                boolean in_a_row = false;
                // input word
                for(int j = position; j < to.length(); j++){

                    // correct char found in second word
                    if(word.charAt(i) == to.charAt(j)){
                        correct_chr_count++;

                        if(in_a_row)
                            correct_in_a_row_count++;
                        else
                            in_a_row = true;

                        // save word position
                        position = j;
                    }
                    else{
                        in_a_row = false;
                    }


                }

                // most similar word found
                double temp_to = (correct_chr_count + correct_in_a_row_count);
                double max = (max_correct_char_count + max_correct_in_a_row_count);
                if( temp_to > max ) {
                    most_correct_word = word;
                    max_correct_char_count = correct_chr_count;
                    max_correct_in_a_row_count = correct_in_a_row_count;
                }

                System.out.println("most correct");
                System.out.println(most_correct_word + " " +
                        max_correct_char_count + " " +
                        max_correct_in_a_row_count);
            }
        }
        if(most_correct_word.equals(""))
            return null;
        else
            return most_correct_word;
    }
}