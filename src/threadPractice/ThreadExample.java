package threadPractice;

public class ThreadExample {
    /**
     * A Thread is an execution environment.
     * If a program has only one execution environment then it will be single threaded program.
     * A thread executes a piece of code on a computer.
     * <p>
     * In a web application every user request runs on a separate thread.
     * In java main method will be executed in a thread which is called main thread.
     * <p>
     * In java there are two ways for working with thread one is java.lang.Thread class and other is java.lang.Runnable interface.
     * <p>
     * currentThread() return a reference to the currently executing thread object.
     **/

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        MyRunnable runnable = new MyRunnable();
        var thread = new Thread(runnable);
        thread.start();
    }
}

class MyThread extends Thread {

    /**
     * Create a class extending the java.lang.Thread class
     * Override the run() method in it.
     * Put the code that you want to be executed by this Thread in the run method.
     * Create an instance of this class and then call start() method of its instance. That’s it.
     **/

    @Override
    public void run() {
        System.out.println("Executing code from: " + Thread.currentThread());
    }
}

class MyRunnable implements Runnable {

    /**
     * Create a class that implements a java.lang.Runnable interface.
     * Put your desired code in the run() method.
     * Create an instance of the class that implements the Runnable interface.
     * Use this instance as an argument of java.lang.Thread’s constructor and create an instance of it.
     * Call the start() method of the newly created instance of Thread.
     * **/

    @Override
    public void run() {
        System.out.println("Executing code from: " + Thread.currentThread());
    }
}