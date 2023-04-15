import java.util.LinkedHashMap;
import java.util.Map;

public class QuestionsandOptions{
   
      
   // Hashmap for key as Questions and value as options string array
   public Map<String, String[]> questions = new LinkedHashMap<>();
   String question1 = "01. which of the following is not a primitive data type?";
   String[] question1_options = {"a. int", "b. bool", "c. Array", "d. float"};
   String question2 = "02. what is java?";
   String[] question2_options = {"a. programming language", "b. A database Management System", "c. A web browser", "d. A Harware"};
   String question3 = "03. What is the purpose of a constructor in Java?";
   String[] question3_options = {"a. To create a new object", "b. To initialize the instance variables of an object", "c. To destroy an object","d. To perform a calculation" };
   
   
   // adding questions and options to Hashmap
   public QuestionsandOptions(){

   questions.put(question1, question1_options);
   questions.put(question2, question2_options);
   questions.put(question3, question3_options);
   
   }
   
 
}