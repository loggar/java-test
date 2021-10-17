# Running test

## As a java application

`Main.java`

```java
class Main {
  public static void main(String[] args) {
    TestRunner tr = new TestRunner();
    tr.main();
  }
}
```

`TestRunner.java`

```java
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
  public static void main() {
    Result result = JUnitCore.runClasses(CompTest.class);

    for (Failure failure : result.getFailures()) {
      System.out.println(failure.toString());
    }

    System.out.println(result.wasSuccessful());
  }
}
```

`CompTest.java`

```java
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CompTest {
   @Test
   public void testAdd() {
      Comp c = new Comp(8, 10);
      assertEquals(18, c.add());
      // assertEquals(17, c.add());
   }
}
```

command (compile)

```
javac -classpath .:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar:/run_dir/json-simple-1.1.1.jar -d . Main.java Ex.java ExTest.java TestRunner.java
```

command (run Main app)

```
java -classpath .:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar:/run_dir/json-simple-1.1.1.jar Main
```
