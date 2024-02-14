package winterpep_github;
// Lecture 21 - What Are Threads/Threads In JAVA

/*

Typically, we can define threads as a subprocess with lightweight with the smallest unit of processes and also has separate paths of execution.
These threads use shared memory but they act independently
hence if there is an exception in threads that do not affect the working of other threads despite them sharing the same memory.

1. New State
2. Active State
3. Waiting/Blocked State
4. Timed Waiting State
5. Terminated State

What is Main Thread?
As we are familiar, we create Main Method in each and every Java Program,
which acts as an entry point for the code to get executed by JVM,
Similarly in this Multithreading Concept, Each Program has one Main Thread which was provided by default by JVM,
hence whenever a program is being created in java, JVM provides the Main Thread for its Execution.
 */

//import java.io.*;
//import java.util.*

class Main extends Thread {
    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}
