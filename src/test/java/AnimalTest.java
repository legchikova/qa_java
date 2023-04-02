import com.example.Animal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class AnimalTest {
    private final Animal animal = new Animal();

    @Test
    public void getFamilyTest() {
        String actual = animal.getFamily();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи",
                actual);
    }

    @Test
    public void getFoodNegativeTest() {
        try {
            animal.getFood("Веган");
        } catch (Exception ex) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", ex.getMessage());
        }
    }
}
