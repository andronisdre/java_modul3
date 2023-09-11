public class expressions {
    public static void main(String[] args) {

        int myFirstNumber = (10+5) + (2*10);
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        //int myTotalNumber = myFirstNumber + mySecondNumber + myThirdNumber;

        System.out.println(myFirstNumber);
        System.out.println(mySecondNumber);
        System.out.println(myThirdNumber);
        //System.out.println(myTotalNumber);

        myThirdNumber = myFirstNumber * 2;

        System.out.println(myThirdNumber);

        int myTotalNumber = myFirstNumber + mySecondNumber + myThirdNumber;

        System.out.println(myTotalNumber);
    }
}
