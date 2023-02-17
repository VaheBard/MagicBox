import java.util.Random;

public class MagicBox<T> {
    private int maxAmountOfObject;
    private T[] items; //= (T[]) new Object[maxAmountOfObject - 1];

    Random random = new Random();


    public MagicBox(int maxAmountOfObject) {
        this.maxAmountOfObject = maxAmountOfObject;
        this.items = (T[]) new Object[maxAmountOfObject];
    }

    public T[] getItems() {
        return items;
    }

    protected boolean add(T item) {
        for (int i = 0; i < items.length; i++) {

            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        System.out.println("No available cell");
        return false;
    }

    protected T pick() throws RuntimeException {
        int randomInt = random.nextInt(maxAmountOfObject);
        int counter = 0;

        for (T item : items) {
            if (item == null) {
                counter++;
            }
        }
        if (counter != 0) {
            if (counter == 1) {
                throw new RuntimeException("there is one empty cell, it should be field in: " + counter);
            } else {
                throw new RuntimeException("there are " + counter + " empty cells, they should be field in");

            }
        } else {
            System.out.print("This a random object from our array: ");
            return items[randomInt];

        }
    }
}



