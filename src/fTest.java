import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FraudTest {

    @Test
    void testHighAmountFraud() {
        boolean result = FraudService.isFraud(10000);
        assertTrue(result);  // Expected: Fraud
    }

    @Test
    void testNormalTransaction() {
        boolean result = FraudService.isFraud(2000);
        assertFalse(result);  // Expected: Not Fraud
    }

    @Test
    void testBoundaryValue() {
        boolean result = FraudService.isFraud(5000);
        assertFalse(result);  // Edge case: exactly 5000 → Not Fraud
    }

    @Test
    void testZeroTransaction() {
        boolean result = FraudService.isFraud(0);
        assertFalse(result);  // No transaction → Not Fraud
    }

    @Test
    void testNegativeTransaction() {
        boolean result = FraudService.isFraud(-100);
        assertFalse(result);  // Invalid → Not Fraud
    }
}