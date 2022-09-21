import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


class ManagerTest {

    private Manager morse;

    @Test
    public void testarenglishToMorse() {
        Manager morse = new Manager();
        morse.mapManager();
        String result = morse.englishToMorse("hej");
        assertEquals("......---", result);

    }


    @Test
    public void testarogiltigtTeckenEngelska() {
        Manager morse = new Manager();
        try {
            morse.englishToMorse("å");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("ogiltligt tecken", e.getMessage());
        }
    }

    @Test
    public void testarogiltigtTeckenMorse() {
        try {
            morse.morseToEnglish("a");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("ogiltligt tecken", e.getMessage());
        }
    }
}
