public class ifStatement {
    public static void main(String[] args) {
        boolean logictest = false;

        //if then
        if (logictest) {
            System.out.println("logic test is true");
        }

        int age = 21;
        if (age == 18 || age == 19) {
            System.out.println("you can go to the pub");
        } else if (age >= 20) {
            System.out.println("you can go to systembolaget");
        }
        else {
            System.out.println("you cant go to sytembolaget or the pub");
        }
    }
}
