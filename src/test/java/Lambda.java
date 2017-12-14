import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Ein Lambda-Ausdruck ist eine anonyme Funktion.
 * Mit Lambda-Ausdrücken können lokale Funktionen (anonyme Funktionen) geschrieben werden,
 * die als Argumente übergeben oder als Wert von Funktionsaufrufen zurückgegeben werden können.
 * Runnable
 * Supplier<T>
 * Consumer<T>
 * Function<T, R>
 * Predicate<T> // And Then
 * <p>
 * <p>
 * Default-Methoden // z.B. Iterator, List.
 * Die Möglichkeiten:
 * C erbt von C1 und I1. C1 wird verwendet.
 * C implementiert I1, I1 implementiert I2. -> I1 wird verwendet
 * C implementiert I1, I2 // Fehler -> I2.super.method()
 * <p>
 * <p>
 * Methodenreferenzen // Konstruktor-Referenz,  Statische Referenz, ObjektmethodenReferenz (obj, args) -> obj.instanceMethod(args)
 * <p>
 * Default-Methoden: toString, equals, hashCode können nicht überschrieben werden
 * <p>
 * Defaults are supposed to be defaults. Adding a default to an interface where there was none (anywhere in the hierarchy) should not affect the
 * semantics of concrete implementing classes. But if defaults could "override" Object methods, that wouldn't be true.
 * <p>
 * <p>
 * Fallstricke:
 * Consumer<String> t = (a) -> System.out.println(a);
 * t.andThen((a) -> System.out.println(a));
 * t.accept("ab");
 * <p>
 * Stream:
 * limit und filter
 */
public class Lambda {




















    // Method references
    @Test
    public void test() {
        C c = new C();
        Consumer<String> stringSupplier = c::printSomething;
        Runnable runnable = c::printSomething;
        Consumer<String> staticConsumer = C::staticPrintSomething;
        BiConsumer<C,String> objectCall = C::printSomething;

        Supplier<C> supplier = C::new;

        System.out.println("Lambda Test");
    }

}
