import org.junit.Test;
import static org.junit.Assert.*;

public class Task2Test {

    @Test
    public void checkIsAdultWhenAgeIsLessThan18False() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(17);
        assertEquals("Если возраст меньше 18, метод должен вернуть false", false, isAdult);
    }

    @Test
    public void checkIsAdultWhenAgeIs18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(18);
        assertEquals("Если возраст равен 18, метод должен вернуть true", true, isAdult);
    }
}
