import java.util.Random;

/**
 * Created by hyunchoi on 2/14/17.
 */
public class ThreadRunner {
    private String name;
    private int restChance;
    private int speed;

    public ThreadRunner() {

    }

    public ThreadRunner(String name, int restChance, int speed) {
        this.name = name;
        this.restChance = restChance;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getrestChance() {
        return restChance;
    }

    public int getSpeed() {
        return speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRestChance(int restChance) {
        this.restChance = restChance;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void run() {
        System.out.println("Testing thread is running " + this.name);
        Random rn = new Random();
        int distance = 0;

        try {
            while (distance <= 1000) {
                int random = rn.nextInt(100) + 1;

                if (random <= this.restChance) {
                    distance += this.speed;
                    System.out.println(this.name + ": " + distance);
                }
                Thread.sleep(100);
            }

        } catch (InterruptedException e) {
            System.out.println("The race was interrupted and has ended.");
        }
        finished();
    }

    public void finished() {
        System.out.println(this.name + " has won the race!");

    }

}
