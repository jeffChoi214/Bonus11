/**
 * Created by hyunchoi on 2/14/17.
 */
public class main {
    public static void main (String[] args) {
        ThreadRunner hare = new ThreadRunner("Hare", 90, 100);
        ThreadRunner tortoise = new ThreadRunner("Tortoise", 0, 10);

        hare.run();
        tortoise.run();


    }




}
