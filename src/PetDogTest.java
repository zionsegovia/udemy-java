public class PetDogTest {
    public static void main(String[] args) {
        PetDog dog = new PetDog("Buddy");
        String snuggleResponse = dog.snuggle();
        System.out.println(snuggleResponse);
    }
}
