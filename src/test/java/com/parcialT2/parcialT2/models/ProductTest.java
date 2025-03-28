import com.parcialT2.parcialT2.models.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    public void testConstructorAndGetters() {
        Product product = new Product("1", "Mouse", 25.0);

        assertEquals("1", product.getId());
        assertEquals("Mouse", product.getName());
        assertEquals(25.0, product.getPrice());
    }

    @Test
    public void testSetters() {
        Product product = new Product();

        product.setId("2");
        product.setName("Keyboard");
        product.setPrice(45.0);

        assertEquals("2", product.getId());
        assertEquals("Keyboard", product.getName());
        assertEquals(45.0, product.getPrice());
    }
}
