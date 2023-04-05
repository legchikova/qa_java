import com.example.Animal;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    private Feline feline;

    @Test
    public void getKittensWithoutParametersTest() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void getKittensWithParametersTest() {
        int actual = feline.getKittens(5);
        assertEquals(5, actual);
    }

    @Test
    public void getFamilyTest() {
        String actual = feline.getFamily();
        assertEquals("Кошачьи", actual);
    }

    @Test
    public void eatMeatTest() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"),feline.eatMeat());
    }
}

