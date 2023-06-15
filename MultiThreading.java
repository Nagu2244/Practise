package NagaPractice.com;

public class MultiThreading extends Thread {
    public static int i = 0;
    public void run(){

        for (int i = 1; i<=100; i++)

            System.out.println("hello");
    }
}
class MultiThreading2 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++)
            System.out.println("how are you");
    }

    public static void main(String args[]) {
        Thread myThread = new Thread();
        while (myThread.isAlive()) {
            System.out.println("Waiting...");
            MultiThreading obj1 = new MultiThreading();
            MultiThreading2 obj2 = new MultiThreading2();

            obj1.start();
            obj2.start();

        }
    }
}