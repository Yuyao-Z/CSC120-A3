import java.util.Scanner; 
import java.util.ArrayList;
import java.util.List;
class Conversation{

  public static void main(String[] arguments) {
    Scanner sc = new Scanner (System.in);

    System.out.println("Please enter how many rounds you want the conversation to go:");
    System.out.println("Hi, how are you doing today");
    int numRounds = sc.nextInt();
    System.out.println("Please enter the start of the conversation:");
    for (int i = 0; i -1 < numRounds; i++){
      String userInput = sc.nextLine();
      String[] wordsArray = userInput.split(" ");
      List<String> wordsList = new ArrayList<>();
      String response = "";
      for (String word : wordsArray) {
        wordsList.add(word);
    }
    
      List<String> sentence = new ArrayList<>();
          boolean containswords = true;
          for (String word:wordsList) {
            if (word.equals("me")) {
            } else if (word.equals("I")) {
                word = "you";
                
            } else if (word.equals("My")) {
                word = "Your";
            } else if (word.equals("my")) {
                word = "your";
            } else if (word.equals("Mine")) {
                word = "Yours";
            } else if (word.equals("mine")) {
                word = "yours";
            } else if (word.equals("am")){
                word = "are"; 
            }

            sentence.add(word);
          
          


        }
      for (String word1:sentence){
        response += word1 + " ";
      }
      response +=".";
      System.out.println(response);
      

}}}
      
    // You will start the conversation here.
 
