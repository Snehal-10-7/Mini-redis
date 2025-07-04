import java.util.*;

public class RedisCore {
    private Map<String, String> store = new HashMap<>();

    public void set(String key, String value) {
        store.put(key, value);
    }

    public String get(String key) {
        return store.containsKey(key) ? store.get(key) : "(nil)";
    }

    public void del(String key) {
        store.remove(key);
    }

    public Set<String> keys() {
        return store.keySet();
    }

    public void flushAll() {
        store.clear();
    }
}
