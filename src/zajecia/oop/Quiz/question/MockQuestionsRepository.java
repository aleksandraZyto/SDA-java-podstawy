package zajecia.oop.Quiz.question;

/**
 * Created by RENT on 2017-04-25.
 */
public class MockQuestionsRepository {
    public Question[] getQuestions(){

        Question[] questions = new Question[3];
        String[] answers1 = {"24","13","45"};
        String[] answers2 = {"1","34","3"};
        String[] answers3 = {"Poznan","Warszawa","Lubiln"};
        questions[0]= new Question("Ile lat ma prezydent", 2, answers1);
        questions[1]= new Question("ile jest 3 plus 8", 2, answers2);
        questions[2]= new Question("stolica", 2, answers3);
        return questions;
    }
}
