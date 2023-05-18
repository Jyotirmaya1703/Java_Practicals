public class TortoiseAndHare {
    public static void main(String[] args) {
        Thread tortoise = new Thread(new Tortoise(), "Tortoise");
        Thread hare = new Thread(new Hare(), "Hare");
        tortoise.start();
        hare.start();
    }
}

class Tortoise implements Runnable {
    private int distance = 0;
    private final int FINISH_LINE = 100;
    
    public void run() {
        while (distance < FINISH_LINE) {
            System.out.println("Tortoise has moved " + ++distance + " steps");
            try {
                Thread.sleep(100); // slow down the tortoise
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Tortoise wins!");
    }
}

class Hare implements Runnable {
    private int distance = 0;
    private final int NAP_DISTANCE = 50;
    private final int FINISH_LINE = 100;
    
    public void run() {
        while (distance < FINISH_LINE) {
            if (distance == NAP_DISTANCE) {
                try {
                    System.out.println("Hare is taking a nap...");
                    Thread.sleep(5000); // hare takes a nap for 5 seconds
                    System.out.println("Hare wakes up!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Hare has moved " + ++distance + " steps");
                try {
                    Thread.sleep(100); // slow down the hare
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Hare loses!");
    }
}
