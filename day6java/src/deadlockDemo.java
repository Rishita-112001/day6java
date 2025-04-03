public class deadlockDemo {
    public static void main(String[] args){
        final String res1 = "cdac";
        final String res2 = "pgdai";

        Thread t1 = new Thread() {
            public void run() {
                synchronized (res1) {
                    System.out.println("Thread 1 locked rest1");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                    synchronized (res1) {
                        System.out.println("Thread 2 : locked rest2");
                    }

                }
            }
        };
        Thread t2 = new Thread(){
            public void run() {
                synchronized (res2) {
                    System.out.println("Thread 2: locked rest1");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                    synchronized (res2) {
                        System.out.println("Thread 2 : locked rest1");
                    }

                }
            }
        };
        t1.start();
        t2.start();

    }
}

//Using lambda same program:

//public class deadlockDemo {
//    public static void main(String[] args) {
//        final String resource1 = "resource1";
//        final String resource2 = "resource2";
//
//        // Thread 1
//        Thread t1 = new Thread(() -> {
//            synchronized (resource1) {
//                System.out.println("Thread 1: Holding resource 1...");
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("Thread 1: Waiting for resource 2...");
//                synchronized (resource2) {
//                    System.out.println("Thread 1: Acquired resource 2!");
//                }
//            }
//        });
//
//        // Thread 2
//        Thread t2 = new Thread(() -> {
//            synchronized (resource2) {
//                System.out.println("Thread 2: Holding resource 2...");
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("Thread 2: Waiting for resource 1...");
//                synchronized (resource1) {
//                    System.out.println("Thread 2: Acquired resource 1!");
//                }
//            }
//        });
//
//        t1.start();
//        t2.start();
//    }
//}
