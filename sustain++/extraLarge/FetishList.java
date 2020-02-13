package extraLarge;

import java.util.HashMap;

public class FetishList extends HashMap<String, String> {
    int searchByType(String key, String value) {
        if (!this.containsKey(key)) {
            return -1;
        }
        if (this.get(key).equals(value)) {
            return -1;
        }
        return 1;
    }
}
