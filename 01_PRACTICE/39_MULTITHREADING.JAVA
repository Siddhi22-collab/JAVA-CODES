class MyThread implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread: " + i);
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new MyThread());
        t.start();
    }
}
