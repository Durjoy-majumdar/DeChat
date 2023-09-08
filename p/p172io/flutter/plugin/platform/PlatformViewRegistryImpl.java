package p172io.flutter.plugin.platform;

import java.util.HashMap;
import java.util.Map;

/* renamed from: io.flutter.plugin.platform.PlatformViewRegistryImpl */
class PlatformViewRegistryImpl implements PlatformViewRegistry {
    private final Map<String, PlatformViewFactory> viewFactories = new HashMap();

    public PlatformViewFactory getFactory(String str) {
        return this.viewFactories.get(str);
    }

    public boolean registerViewFactory(String str, PlatformViewFactory platformViewFactory) {
        if (this.viewFactories.containsKey(str)) {
            return false;
        }
        this.viewFactories.put(str, platformViewFactory);
        return true;
    }
}
