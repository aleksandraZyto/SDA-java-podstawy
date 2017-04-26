package zajecia.oop.Quiz;

import zajecia.oop.Quiz.question.MockQuestionsRepository;
import zajecia.oop.Quiz.question.Question;
import zajecia.oop.Quiz.result.MockResultRepository;

/**
 * Created by RENT on 2017-04-25.
 */
public class Quiz {
    public static void main(String[] args) {
        MockQuestionsRepository questionsRepository = new MockQuestionsRepository();
        MockResultRepository resultsRepository = new MockResultRepository();
        QuizInterface quizInterface = new QuizInterface();

        int decision = quizInterface.menu();
        if (decision == 1) {
            String playerName = quizInterface.insertName();
            quizInterface.beforeStart();
            Question[] questions = questionsRepository.getQuestions();
            int correctAnswerCounter = 0;
            for (int i = 0; i < questions.length; i++) {
                boolean result = quizInterface.showQuestion(questions[i]);
                if (result) {
                    quizInterface.correctAnswer();
                    correctAnswerCounter++;
                } else {
                    quizInterface.incorrectAnswer();
                }
            }

            quizInterface.showResult(playerName, correctAnswerCounter);

        } else if (decision == 2) {
            quizInterface.showResults(resultsRepository.getAllResults());
        } else {
            System.out.println("end of the game");
        }
    }
}
