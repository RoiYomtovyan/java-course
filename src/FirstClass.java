public class FirstClass {
    public static void main(String[] args) {
        System.out.println("roi");
        System.out.println("yomtovyan");
        boolean isAlien = false;

        if (!isAlien) {
            System.out.println("this is not an Alien ");
        }

        int topScore=100;
        if (topScore == 100){
            System.out.println("this is hight score");
        }

        int secondScore =60;
        if ((topScore > secondScore) && (topScore <= 100)){
            System.out.println("this is good");
        }

        if ((topScore>=90)||(secondScore>=80)){
            System.out.println("this is very very good");
        }

        String makeOfCar = "mazda1";
        //define here a boolean var and compare it to makeOFcar if its mazda the value is true and the other is false
        boolean isDomestic = makeOfCar=="mazda"? true : false;
        // defined string S that checks if domestic is true if yes it prints "this is a domestic car" else it prints "this is not a domestic car"
        String s = isDomestic? "this is a domestic car":"this is not a domestic car";
        System.out.println(s);

        double value1 =20.00d;
        double value2 = 80.00d;
        double result = (value1+value2)*100d;
        System.out.println("results is "+ result);
        double reminder= result % 40.00d;
        System.out.println("reminder is "+ reminder);
        boolean isReminder = (reminder==0.0) ? false : true;
        String message=isReminder?"there is a reminder" :"there is no reminder";
        System.out.println(message);

    }
}
