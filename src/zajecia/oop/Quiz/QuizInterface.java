package zajecia.oop.Quiz;

import zajecia.oop.Quiz.question.Question;
import zajecia.oop.Quiz.result.Result;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-25.
 */
public class QuizInterface {

    private Scanner scanner;

    public QuizInterface(){ //konstruktor
        this.scanner = new Scanner(System.in);
    }

    public int menu(){
        System.out.println("1. Start");
        System.out.println("2. Wyniki");
        System.out.println("3. Koniec");
        int answer = this.scanner.nextInt();
        this.scanner.nextLine();
        return answer;
    }

    public String insertName(){
        System.out.println("insert your name");
        return this.scanner.nextLine();
    }

    public void beforeStart(){
        System.out.println("press enter to start");
        this.scanner.nextLine();

    }

    public boolean showQuestion(Question question){
        System.out.println(question.getQuestion());
        String[] possibleAnswers = question.getAnswer();
        for (int i = 0; i < question.getAnswer().length; i++) {
            System.out.println((i+1)+". "+ possibleAnswers[i]);
        }
        int answerFromUser = scanner.nextInt();
        scanner.nextLine();
        return question.checkAnswer(answerFromUser-1); //dlaczego question z malej
    }

    public void incorrectAnswer(){
        System.out.println("incorrect answer");
        scanner.nextLine();
    }

    public void correctAnswer(){
        System.out.println("correct Answer");
        scanner.nextLine();
    }

    public void showResult(String name, int result){
        System.out.println("Congartulations "+name+" youve finishes the game with score: "+result);
    }

    public void showResults(Result[] results){
        System.out.println("Hall of fame");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i+1) +". "+results[i].getPlayerName()+ "\t" +results[i].getResult());
        }
        scanner.nextLine();
    }

    public void showTopResults(Result[] topResults){
        System.out.println("Hall of fame");
        for (int i = 0; i < topResults.length; i++) {
            System.out.println((i+1)+". ");
            if(topResults!=null){
                System.out.println(topResults[i].getPlayerName()+"\t"+ topResults[i].getResult());
            }
        }
    }
}
