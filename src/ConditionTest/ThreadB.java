package ConditionTest;


public class ThreadB extends Thread {



    private MyService myService;

    public ThreadB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {

        while (true) {
            myService.get();
        }

    }
}
