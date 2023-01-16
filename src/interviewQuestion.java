public class interviewQuestion {
    public static void main(String[] args) {

     String word = "Hello";
    int wordCounter = 0;
    String wordHolder = "";

     for(int i = 0; i < word.length(); i++) {

         for(int j = 0; j < word.length(); j++) {


                 if (word.charAt(i) == word.charAt(i)) {

                     wordCounter++;

                 }

                     System.out.println(word.charAt(j) + "--" + wordCounter);

         }

     }

    }

}
