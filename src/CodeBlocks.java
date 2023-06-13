public class CodeBlocks {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int levelCompleated = 8;
        int bonus = 200;

        int highScore = calculatedScore(gameOver,score,levelCompleated,bonus);
        System.out.println("the high score is "+ highScore);

        int highScore2 = calculatedScore(true,20000,7,600);
        System.out.println("the high score is "+ highScore2);

        int highScore3= calculateHighScorePosition(1000);
        displayHighScorePosition("player1",highScore3);

        int highScore4= calculateHighScorePosition(1500);
        displayHighScorePosition("player2",highScore4);

        int highScore5= calculateHighScorePosition(500);
        displayHighScorePosition("player3",highScore5);

        int highScore6= calculateHighScorePosition(100);
        displayHighScorePosition("player4",highScore6);

        int highScore7= calculateHighScorePosition(25);
        displayHighScorePosition("player5",highScore7);
    }

    public static int calculatedScore(boolean gameOver, int score, int levelCompleated, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleated * bonus);
        }
        return finalScore;
    }

    public static void displayHighScorePosition (String playerName ,int position ) {
        System.out.println("the player: "+ playerName+" is in the "+ position +"th place in the score table");
    }

    public static int calculateHighScorePosition (int score) {
        int result=4;
        if (score>=1000) {
            result=1;
        } else if (score < 1000 && score >= 500) {
            result=2;
        } else if (score < 500 && score >= 100) {
            result=3;
        }
        return result;
    }


}
