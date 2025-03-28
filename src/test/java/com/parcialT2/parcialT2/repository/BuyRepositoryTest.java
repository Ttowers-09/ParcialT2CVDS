package com.parcialT2.parcialT2.repository;

import com.parcialT2.parcialT2.models.Buy;
import com.parcialT2.parcialT2.models.PaymentDetails;
import com.parcialT2.parcialT2.models.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataMongoTest
public class BuyRepositoryTest {

    @Autowired
    private buyRepository buyRepository;

    @Test
    public void testSaveAndFindById() {
        Product product = new Product("P1", "Notebook", 1000.0);
        PaymentDetails detail = new PaymentDetails(1, product, 1000.0, new Date(), null, 1);
        Buy buy = new Buy(1001, List.of(detail), 1000.0);

        buyRepository.save(buy);

        Optional<Buy> result = buyRepository.findById(1001);
        assertTrue(result.isPresent());
        assertEquals(1001, result.get().getIdBuy());
        assertEquals(1, result.get().getPaymentDetails().size());
    }

    @Test
    public void testDeleteBuy() {
        Buy buy = new Buy(2002, List.of(), 0.0);
        buyRepository.save(buy);

        buyRepository.deleteById(2002);

        Optional<Buy> deleted = buyRepository.findById(2002);
        assertFalse(deleted.isPresent());
    }

    @Test
    public void testFindAll() {
        buyRepository.save(new Buy(3001, List.of(), 50.0));
        buyRepository.save(new Buy(3002, List.of(), 75.0));

        List<Buy> allBuys = buyRepository.findAll();
        assertTrue(allBuys.size() >= 2); // Puede haber más si se acumulan en la DB embebida
    }
}