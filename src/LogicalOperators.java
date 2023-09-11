public class LogicalOperators {
    public static void main(String[] args) {
        int testNum1 = 96;
        int testNum2 = 80;

        //och operatorn

        if (testNum1 > testNum2 && testNum1 < 100) {
            System.out.println("testnum1 is less tahn 100 and greater than number 2");
        }

        //eller operatorn
        if (testNum1 > 90 || testNum2 <= 90) {
            System.out.println("either or both conditions are true");
        }
    }
}
