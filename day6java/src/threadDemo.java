class car extends Thread{
    public void run(){
        System.out.println("Car has started");
    }
}
class bike implements Runnable{
    public void run(){
        System.out.println("Bike has started");
    }
}
class sleepThread extends Thread{
    public void run(){
        for (int i=1; i<5; i++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
class priorityThread extends Thread{
    public void run(){
        System.out.println("The name of the thread is"+ Thread.currentThread().getName());
        System.out.println("The priority of the thread is "+ Thread.currentThread().getPriority());
    }
}
class daemonThread extends Thread{
    public void run(){
        if (Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread in execution");
        }else {
            System.out.println("User thread");
        }
    }
}

public class threadDemo {
    public static void main(String[] args){
        daemonThread d1 = new daemonThread();
        daemonThread d2 = new daemonThread();
        d1.setDaemon(true);
        d1.start();
        d2.start();

//        priorityThread p1 = new priorityThread();
//        priorityThread p2 = new priorityThread();
//        p1.setPriority(Thread.MIN_PRIORITY);
//        p2.setPriority(4);
//        p1.start();
//        p2.start();

//        car c1 = new car();
//        c1.start();
//
//        bike b1 = new bike();
//        Thread t1 = new Thread(b1);
//        t1.start();
//        System.out.println("Thread");
//        sleepThread t2 = new sleepThread();
//        sleepThread t3 = new sleepThread();
//        t2.start();
//        t3.start();
//
//        System.out.println("The name of the thread :"+ t1.getName());
//        t1.setName("Sleeping pgdai");
//        System.out.println("New Name:"+ t1.getName());
    }
}
