package dcevm.example;

public class Main {

    public static void main(String[] args) {
	/* This purpose of this console application is to demonstrate the value of DCEVM.
	*  The DCEVM is a JVM that supports hot swapping function signatures, member
	*  variables, and many more code implementations subject to change. Normal Java
	*  hot-swapping is limited to the internals of methods, DCEVM is much more powerful
	*  and a superior productivity tool for local development
	*
	*  Check out the README for how to setup DCEVM
	*/

	// Lets say we have a long server startup
        Imagine.aLongServerStartUp();

    // Now that the server has started we now see log activity
        Imagine.logActivity();

    // Our fake server did a good job, now it needs a break
        Imagine.theServerStops();

    /* Developers might need to make a change, here they have two options:
    *  Option 1 The Slow Way: Make changes, stop the server, then start it up again
    *  Option 2 Use DCEVM: Make changes, recompile the classes changed, immediately see
    *  the changes.
    *
    *  To see DCEVM in action, run this application and make changes in FakeApplication.java.
    *  Once you make your changes recompile the class.
    *  (For IntelliJ right click the class name in the Project Explorer, and select Recompile)
    *
    *  After playing around with DCEVM it should be easy to see the benefit of using this tool.
    *  Real application servers could take anywhere between 5 to 60 minutes to start up, without
    *  DCEVM a developer would spend more time waiting instead of working. This is because every
    *  change they make, even small ones, may require the server to be restarted in order to be
    *  seen. This is a horrible waste of time and is 100% rectified by DCEVM!
    */
    }
}
