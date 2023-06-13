public class Switch {

    public static String natoConvertValue (char letter){
        return switch (letter) {
            case 'A' -> "ABLE";
            case 'B' -> "BAKAR";
            case 'C' -> "CHARLIE";
            case 'D' -> "DOG";
            case 'E' -> "EASY";
            default -> "not a valid char!";
        };

    }

    public static void printDayOfWeek (int day){
        String dayOfWeek;
        switch (day) {
            case 0:
                dayOfWeek="Sunday";
                break;
            case 1:
               dayOfWeek="Monday";
                break;
            case 2:
                dayOfWeek="Tuesday";
                break;
            case 3:
                dayOfWeek="Wednesday";
                break;
            case 4:
                dayOfWeek="Thursday";
                break;
            case 5:
                dayOfWeek="Friday";
                break;
            case 6:
                dayOfWeek="Saturday";
                break;
            default:
                dayOfWeek="not a valid day value";
        }
        System.out.println(dayOfWeek);
    }

    public static void main(String[] args) {

        char letter = 'v';
        System.out.println("the value of "+letter+ " is "+ natoConvertValue(letter));
        int day=0;
        for ( day = 0; day < 7; day++) {
            printDayOfWeek(day);
        }
    }

}
