import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class GreeterTest {

    private final Account japan = new Account("hanakoSUZUKI", Country.valueOf("JAPAN"));
    private final Greeter greeterJapan = GreeterFactory.getGreeter(japan);

    private final Account france = new Account("hanakoSUZUKI", Country.valueOf("FRANCE"));
    private final Greeter greeterFrance = GreeterFactory.getGreeter(france);

    private final Account germany = new Account("hanakoSUZUKI", Country.valueOf("GERMANY"));
    private final Greeter greeterGermany = GreeterFactory.getGreeter(germany);

    private final Account usa = new Account("hanakoSUZUKI", Country.valueOf("USA"));
    private final Greeter greeterUsa = GreeterFactory.getGreeter(usa);

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main(GreeterTest.class.getName());
    }

    @Test
    public void doTestJAPAN_login() {
        assertThat(greeterJapan.login(japan),is("こんにちは、hanakoSUZUKIさん。"));
    }

    @Test
    public void doTestJAPAN_logout() {
        assertThat(greeterJapan.logout(japan),is("さようなら。"));
    }

    @Test
    public void doTestJAPAN_like() {
        assertThat(greeterJapan.like(japan),is("ありがとうございました。"));
    }


    @Test
    public void doTestFRANCE_login() {
        assertThat(greeterFrance.login(france),is("Bonjour,hanakoSUZUKI."));
    }

    @Test
    public void doTestFRANCE_logout() {
        assertThat(greeterFrance.logout(france),is("Au revoir."));
    }

    @Test
    public void doTestFRANCE_like() {
        assertThat(greeterFrance.like(france),is("Merci beaucoup."));
    }

    @Test
    public void doTestGERMANY_login() {
        assertThat(greeterGermany.login(germany),is("Guten Tag,hanakoSUZUKI."));
    }

    @Test
    public void doTestGERMANY_logout() {
        assertThat(greeterGermany.logout(germany),is("Aus Wiedersehen."));
    }

    @Test
    public void doTestGERMANY_like() {
        assertThat(greeterGermany.like(germany),is("Danke schon"));
    }

    @Test
    public void doTestUSA_login() {
        assertThat(greeterUsa.login(usa),is("Hello,hanakoSUZUKI."));
    }

    @Test
    public void doTestUSA_logout() {
        assertThat(greeterUsa.logout(usa),is("Goodbye."));
    }

    @Test
    public void doTestUSA_like() {
        assertThat(greeterUsa.like(usa),is("Thank you."));
    }
}
