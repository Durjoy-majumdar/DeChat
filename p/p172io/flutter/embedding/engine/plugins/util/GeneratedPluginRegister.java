package p172io.flutter.embedding.engine.plugins.util;

import p172io.flutter.Log;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.plugins.GeneratedPluginRegistrant;

/* renamed from: io.flutter.embedding.engine.plugins.util.GeneratedPluginRegister */
public class GeneratedPluginRegister {
    private static final String TAG = "GeneratedPluginsRegister";

    public static void registerGeneratedPlugins(FlutterEngine flutterEngine) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", new Class[]{FlutterEngine.class}).invoke((Object) null, new Object[]{flutterEngine});
        } catch (Exception e) {
            Log.m165286e(TAG, "Tried to automatically register plugins with FlutterEngine (" + flutterEngine + ") but could not find or invoke the GeneratedPluginRegistrant.");
            Log.m165287e(TAG, "Received exception while registering", e);
        }
    }
}
