package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {

    @Test
    public void DiscountHOMEandBUSINESStest(){
        Product productHOME = new Product("Item1", 100, "HOME");
        Product productBUSINESS = new Product("Item2", 100, "BUSINESS");

        ProductDao dao = Mockito.mock(ProductDao.class);

        List<Product> results = Arrays.asList(productHOME, productBUSINESS);
        Mockito.when(dao.all()).thenReturn(results);

        DiscountApplier discountApplier = new DiscountApplier(dao);

        discountApplier.setNewPrices();


        Assertions.assertEquals(100*0.9,productHOME.getPrice());
        Assertions.assertEquals(100*1.1,productBUSINESS.getPrice());
    }

}
