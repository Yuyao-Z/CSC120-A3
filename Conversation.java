import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Conversation {

  public static void main(String[] arguments) {
    Scanner sc = new Scanner(System.in);
    List<String> conversation = new ArrayList();
    System.out.println("Please enter how many rounds you want the conversation to go:");
    System.out.println("Hi, how are you doing today");
    int numRounds = sc.nextInt();
    System.out.println("Please enter the start of the conversation:");
    for (int i = 0; i - 1 < numRounds; i++) {
      String userInput = sc.nextLine();
      userInput += " ";
      conversation.add(userInput);
      String[] wordsArray = userInput.split(" ");
      List<String> wordsList = new ArrayList<>();
      for (String word : wordsArray) {
        wordsList.add(word);
      }
      List<String>wordsneedtobereplaced = new ArrayList();
      wordsneedtobereplaced.add("me");
      wordsneedtobereplaced.add("I");
      wordsneedtobereplaced.add("My");
      wordsneedtobereplaced.add("my");
      wordsneedtobereplaced.add("Mine");
      wordsneedtobereplaced.add("mine");
      wordsneedtobereplaced.add("am");
      wordsneedtobereplaced.add("you");
      wordsneedtobereplaced.add("your");
      wordsneedtobereplaced.add("yours");
      wordsneedtobereplaced.add("Your");
      wordsneedtobereplaced.add("You");
      wordsneedtobereplaced.add("Your");
      wordsneedtobereplaced.add("are");
      wordsneedtobereplaced.add("Are");
      String response = new String();
      List<String> sentence = new ArrayList<>();
      Boolean containswords = false;
      for (String element:wordsneedtobereplaced){
        //System.out.println(element);
        if (wordsList.contains(element)){
          //System.out.println("0");
          containswords = true;

        }
      }
    
      if (containswords == true){

        for (String word :wordsList ){
              if (word.equals("me")) {
                word = "you";
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
              } else if (word.equals("am")) {
                word = "are";
              }else if (word.equals("you")){
                word = "I";
              }else if (word.equals("your")){
                word = "my";
              } else if (word.equals("yours")){
                word = "mine";
              } else if (word.equals("You")){
                word = "I";
              } else if (word.equals ("Your")){
                word = "My";
              } else if (word.equals("are")){
                word = "am";
              } else if (word.equals("Are")){
                word = "Am";
              }response = response + word + " ";}}
    
      if (containswords == false){
          if (i > 0){    
            System.out.println("not bad");}
                }

    System.out.println(response);
    conversation.add(response.toString());
    }
    sc.close();
    System.out.println("Goodbye");
    for (String item : conversation) {
      System.out.println(item);
    }
    
  }}
    

// You will start the conversation here.
