class PrinterManager {

    private static PrinterManager instance;
    private int jobCount = 0;
    private PrinterManager() {
    }
    public static PrinterManager getInstance() {
        if (instance == null) {
            instance = new PrinterManager();
        }
        return instance;
    }

    public void printJob(String jobName) {
        jobCount++;
        System.out.println("Printing: " + jobName);
    }

    public int getJobCount() {
        return jobCount;
    }
}

public class Main {
    public static void main(String[] args) {


        PrinterManager p1 = PrinterManager.getInstance();
        PrinterManager p2 = PrinterManager.getInstance();

        p1.printJob("Document 1");
        p2.printJob("Document 2");
        p1.printJob("Document 3");


        System.out.println("Total Jobs: " + p1.getJobCount());


        System.out.println("Same Instance: " + (p1 == p2));
    }
}
