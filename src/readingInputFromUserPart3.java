public class readingInputFromUserPart3 {

    public static void main(String[] args) {
//        Scanner scanner= new Scanner(System.in);
//        boolean isNum =false;
//        double min=0;
//        double max=0;
//        int loopCount=0;
//        do {
//            System.out.println("please enter a number");
//            String numberInput = scanner.nextLine();
//            try {
//                double number = Double.parseDouble(numberInput);
//                if ((loopCount==0)||(number<min)){
//                    min=number;
//                }
//                if ((loopCount==0)||(number>max)){
//                    max=number;
//                }
//                loopCount++;
//                isNum=true;
//            } catch (Exception e){
//                System.out.println("YOU SELECT TO EXIT");
//                System.out.println("The minimum number is  "+ min);
//                System.out.println("The MAXIMUM number is  "+ max);
//
//            }
//        } while (isNum);

//        HourlyEmployee roi = new HourlyEmployee("roi","23/10/1981","11/11/2018",23.5);
//        System.out.println(roi);
//        System.out.println("the age of " +roi.name+ " is "+ roi.calculateAge());

        BankAccount roiAccount = new BankAccount("1223",500,"roi",
                "roi@roi",
                "0503332221");

        roiAccount.deposit(100);
        roiAccount.withdraw(800);
        roiAccount.setBalance(6000);
        roiAccount.withdraw(800);
        roiAccount.getBalance();
        System.out.println("THE CUSTOMER NAME IS " + roiAccount.getCustomerName() );
        roiAccount.setCustomerName("roiNew");
        System.out.println("THE CUSTOMER NAME IS " + roiAccount.getCustomerName() );



    }


}
