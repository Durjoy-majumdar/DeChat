package p172io.flutter.embedding.engine.plugins;

import java.util.Set;

/* renamed from: io.flutter.embedding.engine.plugins.PluginRegistry */
public interface PluginRegistry {
    void add(FlutterPlugin flutterPlugin);

    void add(Set<FlutterPlugin> set);

    FlutterPlugin get(Class<? extends FlutterPlugin> cls);

    boolean has(Class<? extends FlutterPlugin> cls);

    void remove(Class<? extends FlutterPlugin> cls);

    void remove(Set<Class<? extends FlutterPlugin>> set);

    void removeAll();
}
