public class SecondAndMinutesChallenge {

    public static String getDurationString (int sec) {
        int minutes =0;
        if ( sec < 0){
            return "the value is not valid";
        } else {
            minutes=(sec/60);
        }
        return getDurationString(minutes,sec);
    }
    public static String getDurationString (int minutes ,int sec) {
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds=sec % 60;

        return hours + "h " + remainingMinutes + " m "+ remainingSeconds +" s ";

    }

    public static void printEqual (int x , int y, int z){
        if ((x<0) || (y<0) || (z<0)){
            System.out.println("Invalid Value");
        } else if ((x==y) && (x==z)) {
            System.out.println("All numbers are equal");
        } else if ((x==z) || (y==z) || (x==y)){
            System.out.println("Neither all are equal or different");
        } else
            System.out.println("All numbers are different");
    }

    public static double area (double radius){
        if (radius<0){
            return -1;
        } else {
            double area = radius * radius * Math.PI;
            return area;
        }
    }

    public static double area (double x, double y){
        if ((x<0) || (y<0)){
            return -1;
        } else {
            double area = x*y;
            return area;
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean isPlay=false;
        if ((summer) && (temperature>=25) && (temperature<=45)){
            return isPlay=true;
        } else if ((!summer) && (temperature>=25) && (temperature<=35)){
            return isPlay=true;
        }
        return isPlay;
    }

    public static void main(String[] args) {
        System.out.println( getDurationString(5000));
    }
}
