package junit;

import org.junit.*;

import java.io.IOException;

public class Junit4Test {

    @BeforeClass
    public static void runsBeforeEverything() {
        System.out.println("Before Running a Test Class");
    }

    @Before
    public void runsBeforeEveryMethod() {
        System.out.println("Before Running a Test Method");
    }

    @Test
    public void aTestMethodAssertingTrue() {
        Assert.assertTrue(true);
    }

    @Test
    public void aTestMethodAssertingEquals() {
        String expected = "bob";
        Assert.assertEquals(expected, "bob");
    }

    @Test
    public void aTestMethodAssertingWithMessage() {
        String expected = "bob";
        Assert.assertEquals("Because we always expect bob", expected, "bob");
    }

    @Ignore("because if this ran it would fail")
    @Test
    public void anIgnoredDisabledTest() {
        Assert.assertFalse(true);
    }

    @Test(expected = IOException.class)
    public void shouldThrowAnCheckedException() throws IOException {
        throw new IOException("We interrupt this test to throw an checked exception");
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowAnRuntimeException() {
        throw new NullPointerException("We interrupt this test to throw an runtime exception");
    }

    @After
    public void runsAfterEveryMethod() {
        System.out.println("After Finished Running a Test Method");
    }

    @AfterClass
    public static void runsAfterEverything() {
        System.out.println("After Finished Running a Test Class");
    }
}