/*Подключи библиотеки: Jacoco, Mockito, JUnit 4.
- Покрой тестами класс IngredientType
- Используй моки, стабы и параметризацию там, где нужно.
- Процент покрытия должен быть не ниже 70%.
*/

package unitTests;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import praktikum.IngredientType;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class IngredientTypeTest {

    @Test
    @Parameters({
            "SAUCE, SAUCE",
            "FILLING, FILLING"
    })
    public void testIngredientTypeValueOf(String name, IngredientType expectedType) {
        assertEquals(expectedType, IngredientType.valueOf(name));
    }
}
