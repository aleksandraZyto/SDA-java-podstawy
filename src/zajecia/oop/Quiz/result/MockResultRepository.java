package zajecia.oop.Quiz.result;

/**
 * Created by RENT on 2017-04-25.
 */
public class MockResultRepository {

    private Result[] result;

    public MockResultRepository() {
        result = new Result[2];

        result[0] = new Result("Andrzej", 3);
        result[1] = new Result("Jan", 2);

    }

    public Result [] getAllResults(){
        return result;
    }


}
