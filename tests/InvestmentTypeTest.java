
import org.junit.Assert;

import SavingsAccount.src.*;

public class InvestmentTypeTest {

   @Test
   public void shouldReceiveAmount() {
      //given
      double noAmount = 0.0;
      //when
      InvestmentTypes newType = new InvestmentTypes(noAmount);
      //then
      Assert.assertTrue(newType.getBalance() != noAmount);     
 
   }

}
