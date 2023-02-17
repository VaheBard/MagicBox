import java.util.Random;

public class MagicBox <T>{
    protected int count;
    protected T value;
    protected T[] items;
    Random random = new Random();

    public MagicBox(int count, T value){
        this.count = count;
        this.value = value;
        this.items = (T[]) new Object[count];
    }

    boolean add(T item){
        for (int i = 0; i < items.length; i++) {
            if(items[i] == null){
              items[i] = item;
              return true;
            } else {
                return false;
            }
        }
        return true;
    }
    T pick(){
        int counter = 0;
            try {

                for (int i = 0; i < items.length; i++) {

                    if (items[i] == null) {
                        counter++;

                    }
                }
            }catch (RuntimeException e) {
                System.out.println("Осталось заполнить " + (count - counter) + " ячеек");
            }
        for (T item : items) {
            if(item != null){
                int randomInt = random.nextInt(count);
            }
        }
        return items[random.nextInt(count)];
        }
    }


