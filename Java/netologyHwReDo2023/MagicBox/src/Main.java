import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MagicBox<String> magicBox = new MagicBox<>(5);
        magicBox.add("23");
        magicBox.add("24");
        magicBox.add("25");
        magicBox.add("26");
        magicBox.add("27");
//        magicBox.add("28");


        System.out.println(Arrays.toString(magicBox.getItems()));

        System.out.println(magicBox.pick());

    }
}
