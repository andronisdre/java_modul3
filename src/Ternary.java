public class Ternary {
    public static void main(String[] args) {

        String dog = "BullTerrier";
        //boolean isShortHairBreed = false;

        boolean isShortHairBreed = dog == "BullTerrier" ? true : false;

        if (isShortHairBreed) {
            System.out.println("Bullterrier is a shorthaired breed");
        }

        String breed = isShortHairBreed ? "this dog is a shorthaired breed" : "this dog is a longhaired breed";
        System.out.println(breed);
    }
}
