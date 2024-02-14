package winterpep_github;
// Lecture 22 - How To Create Threads In Java (Demonstration) And Practice Exercise
import java.util.*;

/*
run is a predefined method. When a thread is started it auto looks for run method
The job of a thread is defined inside run method

start method is used to start a thread, which indirectly calls run() method.
 */

class Worker extends Thread {
    public void run() {
        for(int i=0;i<=10;i++)
        {
            System.out.println("Thread is running: " + new java.util.Date());
            try {
                Thread.sleep(1000); // 1000 ms= 1 sec
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
class Worker1 implements Runnable{
    public void run() {
        for(int i=0;i<=20;i++)
        {
            System.out.println("Thread One is working: ");
            try {
                Thread.sleep(1000); // 1000 ms= 1 sec
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Worker2 implements Runnable{
    public void run() {
        for(int i=0;i<=20;i++)
        {
            System.out.println("Hello from Thread Two");
            try {
                Thread.sleep(1000); // 1000 ms= 1 sec
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class lecture22 {

    Thread t1,t2;
    lecture22(){
        t1=new Thread(new Worker1());
        t2=new Thread(new Worker2());

        t1.setPriority(5);
        t2.setPriority(10); // Priority range is 1 to 10. 1=minimum and 10=maximum

        t1.start();
        t2.start();
    }

    public static void main(String[] args) {
//        Worker w1=new Worker();
//        w1.start();

        new lecture22();

    }
}
