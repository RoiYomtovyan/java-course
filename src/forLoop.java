public class forLoop {

    public static boolean isPrime (int wholeNumber){

        if (wholeNumber <= 2){
            return (wholeNumber == 2);
        }
        for (int divisor =2 ; divisor <= wholeNumber/2 ; divisor++){
            if (wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }

    public static int counter (int maxRange) {
        int counter=0;

        for (int i=2 ; i<=maxRange ; i++){
            if (maxRange>1000){
                System.out.println("the max range is too big");
                break;
            }
           boolean isPrime= isPrime(i);
            if (isPrime=true){
                System.out.println("the number " + i +" is prime");
                counter++;
            }

            if (counter==3){
                break;
            }

        }
        return counter;
    }

    public static boolean isOdd (int number){
        if (number < 0){
            return false;
        }
        if (number%2 == 0){
            return false;

        } else {
            return true;
        }
    }


    public static int sumOdd (int start, int end ){
        int sum=0;
        if ((start<0) || (end<0) || (start<end)){
            return -1;
        }
        for ( int i= start; i <end; i++) {
        boolean isOdd = isOdd(i);
        if (isOdd==true){
            sum=sum+i;
        }
        }
        return sum;
    }

    public static boolean isDevided (int number){
        if ((number%3 == 0) && (number%5 == 0)){
            return true;
        }
        else {
            return false;
        }
    }


        public static int sumDigits(int number) {

            if (number < 0) {
                return -1;
            }

            int sum = 0;

            while (number > 9) {
                sum += (number % 10);
                number = number / 10;
            }

            sum += number;

            return sum;
        }


    public static void main(String[] args) {
//        counter(1001);
//        int count =0;
//        int sum=0;
//        for (int i=0; i<=1000; i++) {
//            boolean isDev = (isDevided(i));
//            if ((isDev == true) && (count <= 5)) {
//                    System.out.println("the number "+ i+ " is devided by 3 and 5");
//                    count++;
//                    sum=sum+i;
//
//                }
//
//            }
//        System.out.println("The sum of the numbers in the rage is  "+ sum);
//        int j=5;
//        while (j<=20){
//            boolean isEven= isOdd(j);
//            if (isEven==false){
//                System.out.println("the number "+ j + " is even");
//            }
//            j++;
//        }

        int sum= sumDigits(1234);
        System.out.println(sum);
    }
}

