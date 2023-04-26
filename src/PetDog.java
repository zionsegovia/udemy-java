public class PetDog implements Companion {
    private String name;

    public PetDog(String name) {
        this.name = name;
    }

    @Override
    public String snuggle() {
        return name + " wants to snuggle";
    }
}

