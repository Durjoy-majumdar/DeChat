package p172io.flutter.embedding.engine;

import java.util.HashMap;
import java.util.Map;

/* renamed from: io.flutter.embedding.engine.FlutterEngineCache */
public class FlutterEngineCache {
    private static FlutterEngineCache instance;
    private final Map<String, FlutterEngine> cachedEngines = new HashMap();

    public static FlutterEngineCache getInstance() {
        if (instance == null) {
            instance = new FlutterEngineCache();
        }
        return instance;
    }

    public void clear() {
        this.cachedEngines.clear();
    }

    public boolean contains(String str) {
        return this.cachedEngines.containsKey(str);
    }

    public FlutterEngine get(String str) {
        return this.cachedEngines.get(str);
    }

    public void put(String str, FlutterEngine flutterEngine) {
        if (flutterEngine != null) {
            this.cachedEngines.put(str, flutterEngine);
        } else {
            this.cachedEngines.remove(str);
        }
    }

    public void remove(String str) {
        put(str, (FlutterEngine) null);
    }
}
