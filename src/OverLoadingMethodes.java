public class OverLoadingMethodes {
 // there are 2 metamodels with same names but different signature
    public static int calculateScore(String playerName, int score) {

        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {

        return calculateScore("Anonymous", score);
    }

    public static int calculateScore() {

        System.out.println("No player name, no player score.");
        return 0;
    }


    public static double convertToCentimeters (int inch) {
        double centimeters= inch*2.54;
        return centimeters;
    }

    public static double convertToCentimeters (int feet , int inch) {
         int convertedFeetToInch = feet * 12;
         double convertedInchToCm = convertToCentimeters(inch);
         double feetToCm= convertToCentimeters(convertedFeetToInch);
        double centimeters= convertedInchToCm+feetToCm;
        return centimeters;
    }

    public static void main(String[] args) {
        double inchToCm = convertToCentimeters(15);
        System.out.println("the value of 15inch is " +inchToCm+" cm");
        double footToCm = convertToCentimeters(15,15);
        System.out.println(footToCm);

    }
}
