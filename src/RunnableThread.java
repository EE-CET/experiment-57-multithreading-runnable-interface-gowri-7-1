class MyRunnable implements Runnable {
    // Override run() method
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
    }
}

public class RunnableThread {
    public static void main(String[] args) {
        // Create an instance of MyRunnable
        MyRunnable r = new MyRunnable();
        
        // Create a Thread object passing the runnable instance
        Thread t = new Thread(r);
        
        // Start the thread
        t.start();
    }
}

