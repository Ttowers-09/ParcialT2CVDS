import com.parcialT2.parcialT2.models.Buy;
import com.parcialT2.parcialT2.models.PaymentDetails;
import com.parcialT2.parcialT2.models.Product;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BuyAdvancedTest {

    @Test
    public void testEmptyPaymentDetailsList() {
        Buy buy = new Buy(200, new ArrayList<>(), 0.0);

        assertEquals(200, buy.getIdBuy());
        assertNotNull(buy.getPaymentDetails());
        assertTrue(buy.getPaymentDetails().isEmpty());
        assertEquals(0.0, buy.getTotal());
    }

    @Test
    public void testNullPaymentDetails() {
        Buy buy = new Buy(201, null, 0.0);

        assertEquals(201, buy.getIdBuy());
        assertNull(buy.getPaymentDetails());
        assertEquals(0.0, buy.getTotal());
    }

    @Test
    public void testUpdatePaymentDetailsAndTotal() {
        Product product = new Product("P001", "Teclado", 50.0);
        PaymentDetails detail1 = new PaymentDetails(1, product, 50.0, new Date(), null, 2);
        PaymentDetails detail2 = new PaymentDetails(2, product, 50.0, new Date(), null, 1);

        Buy buy = new Buy(300, List.of(detail1), 100.0);
        assertEquals(100.0, buy.getTotal());
        assertEquals(1, buy.getPaymentDetails().size());

        // Actualizar detalles y total
        buy.setPaymentDetails(List.of(detail1, detail2));
        buy.setTotal(150.0);

        assertEquals(2, buy.getPaymentDetails().size());
        assertEquals(150.0, buy.getTotal());
    }

    @Test
    public void testNegativeTotalAmount() {
        Buy buy = new Buy(400, null, -500.0);
        assertEquals(-500.0, buy.getTotal());

        buy.setTotal(0.0);
        assertEquals(0.0, buy.getTotal());
    }

    @Test
    public void testSetIdBuy() {
        Buy buy = new Buy(0, null, 0.0);
        buy.setIdBuy(12345);
        assertEquals(12345, buy.getIdBuy());
    }
}
