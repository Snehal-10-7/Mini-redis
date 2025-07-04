import java.util.*;

public class ExpiryManager {
    private Map<String, Long> expiryMap = new HashMap<>();

    public void setExpiry(String key, int seconds) {
        expiryMap.put(key, System.currentTimeMillis() + seconds * 1000);
    }

    public boolean isExpired(String key) {
        if (!expiryMap.containsKey(key)) return false;
        return System.currentTimeMillis() > expiryMap.get(key);
    }

    public long getTTL(String key) {
        if (!expiryMap.containsKey(key)) return -1;
        long ttl = (expiryMap.get(key) - System.currentTimeMillis()) / 1000;
        return ttl < 0 ? -1 : ttl;
    }
}
