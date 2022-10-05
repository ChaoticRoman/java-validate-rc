import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorRCTest {
    @Test
     void validate_only_letters() {
        assertFalse(ValidatorRC.validate("asdfg"));
    }

    @Test
    void validate_too_short() {
        assertFalse(ValidatorRC.validate("1"));
        assertFalse(ValidatorRC.validate("88052600"));
    }

    @Test
    void validate_too_long() {
        assertFalse(ValidatorRC.validate("88052600000"));
    }

    @Test
    void validate_correct() {
        assertTrue(ValidatorRC.validate("120101000"));
        assertTrue(ValidatorRC.validate("0001010000"));
    }
}