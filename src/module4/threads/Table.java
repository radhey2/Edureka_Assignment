package module4.threads;

public class Table {
    public static void main(String[] args) {

        FiveTable task = new FiveTable();
        task.start();

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0)
                System.out.println("[Main]Even Number is " + i);

        }

    }

}

class FiveTable extends Thread {

    public void run() {

        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0)
                System.out.println("[Thread]" + i);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}