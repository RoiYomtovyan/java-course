public class main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(2,7);

        System.out.println("the sum of 2 and 7 is:  " + calculator.sum());
        System.out.println("the manipulation of 2 and 7 is: " + calculator.multiplication());
        System.out.println("the deviation of 2 and 7 is: " + calculator.division());
        System.out.println("the subscription of 2 and 7 is: " + calculator.subtraction());

        calculator.setInputNum1(3);

        System.out.println("the sum of 3 and 7 is:  " + calculator.sum());
        System.out.println("the manipulation of 3 and 7 is: " + calculator.multiplication());
        System.out.println("the deviation of 3 and 7 is: " + calculator.division());
        System.out.println("the subscription of 3 and 7 is: " + calculator.subtraction());
    }
}
