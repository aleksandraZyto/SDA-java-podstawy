package zajecia;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-20.
 */
public class WheelAndCross {
    public static void main(String[] args) {
        char[][] gameBoard = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};

        int i=0;
        while(!isGameEnded(gameBoard, i)){

            displayBoard(gameBoard);
            int position = getPositionromUser(gameBoard);
            int[] positions = convertPosition(position);
            gameBoard[positions[0]][positions[1]] = (i % 2 == 0) ? 'X' : 'O';
            i++;
        }
        System.out.println("End of game");
        displayBoard(gameBoard);
    }

    public static int getPositionromUser(char[][] gameBoard) {
        Scanner scanner = new Scanner(System.in);
        boolean inputFromUserFlag=false;
        int position = 0;
        while (!inputFromUserFlag) {
            System.out.println("insert position");
            position = scanner.nextInt();
            inputFromUserFlag = validatePositionFromUser(position, gameBoard);
            if (!inputFromUserFlag) {
                System.out.println("invalid data");
            }
        }
        return position;
    }

    public static boolean isGameEnded(char[][] gameBoard, int gameStep) {
        return (checkRows(gameBoard) || checkColumns(gameBoard) || checkDiagonals(gameBoard)) || !(gameStep>9);
    }

    public static boolean checkRows(char[][] gameBoard) {

        boolean result = false;
        int i = 0;

        while (i < gameBoard.length && !result) {
            result = (gameBoard[i][0] == gameBoard[i][1]) && (gameBoard[i][1] == gameBoard[i][2]);
            i++;
        }
        return result;
    }

    public static boolean checkColumns(char[][] gameBoard) {
        boolean result = false;
        int i = 0;

        while (i < gameBoard.length && result == false){
            result = gameBoard[0][i] == gameBoard[1][i] && gameBoard[1][i] == gameBoard[2][i];
            i++;
        }
        return result;
    }

    public static boolean checkDiagonals(char[][] gameBoard) {
        boolean result = false;
        if (isFieldEmpty(gameBoard, 1, 1) == false) {
            result = gameBoard[1][1] == gameBoard[0][0] && gameBoard[1][1] == gameBoard[2][2] || gameBoard[1][1] == gameBoard[0][2] && gameBoard[1][1] == gameBoard[2][0];
        }
        return result;
    }

    public static boolean validatePositionFromUser(int positionFromUser, char[][] gameBoard) {
        int[] ints = convertPosition(positionFromUser);
        return (positionFromUser > 0 && positionFromUser < 10 && isFieldEmpty(gameBoard, ints[0], ints[1]));
    }

    public static boolean isFieldEmpty(char[][] gameBoard, int i, int j) {
        return !(gameBoard[i][j] == 'X' || gameBoard[i][j] == 'O');
    }

    public static int[] convertPosition(int positionFromUser) {
        int[] position = new int[2];
        position[0] = (positionFromUser - 1) / 3;
        position[1] = (positionFromUser - 1) % 3;
        return position;
    }

    public static void displayBoard(char[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[0].length; j++) {
                System.out.print(gameBoard[i][j]);
                if (j != gameBoard[0].length - 1) {
                    System.out.print("|");
                }
            }
            if (i != gameBoard.length - 1) {
                System.out.print("\n-----\n");
            }
        }
        System.out.println();
    }
}
