import java.util.Scanner;
import java.util.HashMap;

public class Quiz extends QuestionsandOptions {

    public static void main(String[] args) {
        // declaring score
        int score = 0;

        // setting answers as per question code
        final HashMap<String, String> answers = new HashMap<>();
        answers.put("01","c");
        answers.put("02","a");
        answers.put("03","b");

        //creating the QuestionsandOptions object to access questions 
        QuestionsandOptions questions_and_options = new QuestionsandOptions();

        // scanner object
        Scanner sc = new Scanner(System.in);
        
        // for each loop 
        for(String question: questions_and_options.questions.keySet()){
            System.out.println(" ");
            System.out.println("_____________________________________________");
            System.out.println(" ");
            System.out.println(question);

            for(String option: questions_and_options.questions.get(question)){
                System.out.println(option);
            }

            String code = question.substring(0, 2);
            String solution = answers.get(code);
            
            // loop until the user enters a valid option
            while (true) {
                System.out.println("Enter your option or type 'skip' to move to next question: ");
                String selected_option = sc.nextLine();
                
                if(selected_option.equals("skip")){
                    System.out.println("Current Score: "+score);
                    break;
                }
                else if(selected_option.equals(solution)){
                    score += 10;
                    System.out.println(" ");
                    System.out.println("You are CORRECT!!! :) ");
                    System.out.println("Current Score: "+score );
                    break;
                }
                else if(selected_option.matches("[a-d]")){ // check if selected_option is a valid option (a, b, c or d)
                    score -= 10;
                    System.out.println(" ");
                    System.out.println("Sorry INCORRECT!!! :( ");
                    System.out.println("Current Score: "+score);
                    break;
                }
                else{
                    System.out.println("Invalid option. Please try again.");
                }
            }
        }
        sc.close();
        System.out.println(" ");
        System.out.println("---- Test Completed ----");
        System.out.println("Your Final Score >>> "+score);
        
    }
    
}
