public class Dictionary {

    private final String[] words;

    public Dictionary(String[] words) {
        this.words = words;
    }

    public String findMostSimilar(String to) {


        int max_correct_count = 0;
        String most_correct_word = "";

        // check each word
        for(String word : words){
            int correct_count = 0;

            // check each letter in parameter word "to"
            for(int char_index = 0; char_index < to.length(); char_index++){
                if( word.charAt(char_index) == to.charAt(char_index) ){
                    correct_count++;
                    if(correct_count > max_correct_count){
                        most_correct_word = word;
                        max_correct_count = correct_count;
                    }

                }
            }
        }
        if(most_correct_word.equals(""))
            return null;
        else
            return most_correct_word;
    }
}