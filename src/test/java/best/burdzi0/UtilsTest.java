package best.burdzi0;

import org.junit.Test;

import java.util.UUID;

import static best.burdzi0.Utils.validateUUID;
import static org.junit.Assert.*;

public class UtilsTest {

    @Test
    public void validateUUIDShouldReturnTrue() {
        assertTrue(validateUUID(UUID.randomUUID().toString()));
    }

    @Test
    public void validateUUIDShouldReturnFalse() {
        assertFalse(validateUUID(""));
        assertFalse(validateUUID("Not a valid UUID"));
    }
}