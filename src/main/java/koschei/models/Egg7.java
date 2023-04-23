package koschei.models;

public class Egg7 {

    private final Needle8 needle;

    public Egg7(Needle8 needle) {
        this.needle = needle;
    }

    @Override
    public String toString() {
        return "в яйце - иголка, " + needle.toString()+ "";
    }
}
