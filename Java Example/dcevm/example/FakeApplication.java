package dcevm.example;

/* Uncomment lines, delete variables, write new functions, add a new class and reference it here.
*  Recompile and see what happens with DCEVM and without DCEVM. DCEVM does not work with changes
*  in hierarchies though!
*/

public class FakeApplication {
    private String nonsense = "This string is meaningless";
    //private String riddle = null;

    public String printFakeActivity() {
        //riddle = "What has fewer holes when you add a hole to it?";
        int number = simpleMethod(nonsense);
        int anotherNumber = simpleMethod(nonsense/*, riddle/*, badMethod() */);
        return "The fake server is running!!: " + (number + anotherNumber);
    }

    private int simpleMethod(String... strings) {
        return strings.length;
    }

    /* private String badMethod() {
        return "T" + "H" + "I" + "S" + " " + "I" + "S" + " a bad string....";
     } */
}
