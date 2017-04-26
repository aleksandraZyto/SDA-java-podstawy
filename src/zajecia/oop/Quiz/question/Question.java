package zajecia.oop.Quiz.question;

import java.util.Arrays;

/**
 * Created by RENT on 2017-04-25.
 */
public class Question {

    private String question;
    private int correctAnswer;
    private String[] answer;

    public Question(String question, int correctAnswer, String[] answer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answer = answer;
    }

    public boolean checkAnswer(int answer){
        return this.correctAnswer == answer;
    }

    public String getQuestion(){
        return question;
    }

    public String[] getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", correctAnswer=" + correctAnswer +
                ", answer=" + Arrays.toString(answer) +
                '}';
    }
}
