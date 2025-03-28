package Lambda_Expression;

public class ThreadDemo {

    public static void main(String[] args) {
        
        Runnable thread1 = () -> {
            for (int i = 0; i < 15; i++) {
                System.out.println("Value of i: "+i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        };
        Thread thread = new Thread(thread1);
        thread.setName("John");
        thread.run();


        Runnable thread2 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("I = : " +i);

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        };
        Thread thread3 = new Thread(thread2);
        thread3.setName("new");
        thread3.start();
        thread3.run();
    }
}
