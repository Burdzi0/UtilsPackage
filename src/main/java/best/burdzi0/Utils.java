package best.burdzi0;

import java.util.UUID;

public class Utils {

    public static boolean validateUUID(String uuid) {
        try {
            UUID.fromString(uuid);
            return true;
        } catch (IllegalArgumentException ex) {
            return false;
        }
    }
}
