/**
 *
 */
public class C{


    /**
     * Konstruktor.
     */
    public C() {
    }

    /**
     * Konstruktor mit Parametern.
     * @param test
     */
    public C(String test) {
    }


    public void printSomething() {
        System.out.println("Printing...");
    }

    public void printSomething(String test) {
        System.out.println(test);
    }

    /**
     * Statischer Aufruf.
     * @param test
     */
     static void staticPrintSomething(String test) {
         System.out.println(test);
     }
}
