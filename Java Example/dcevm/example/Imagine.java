package dcevm.example;

// Imagine if everyone only used static classes in their java code....
// DCEVM does not work for static methods
public class Imagine {

    // Server startup here is only 30 seconds, but real applications could be much longer
    public static void aLongServerStartUp() {
        System.out.println("Fake Server is Starting Please wait 30 seconds");
        sleep(30);
        System.out.println("Fake Server has started!!");
        sleep(1);
    }

    // The "Application" runs for 5 minutes, giving you plenty of time to experiment with DCEVM
    public static void logActivity() {
        FakeApplication fakeApplication = new FakeApplication();
        int x = 1;
        while (x <= 300) {
            fakeApplication.printFakeActivity();
            System.out.println("Fake Log #" + ++x + " : " + fakeApplication.printFakeActivity());
            sleep(1);
        }
    }

    // Sleep helper method because Java needs some more syntactic sugar
    private static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    // Nice little message
    public static void theServerStops() {
        System.out.println("The server has stopped!!");
    }
}
