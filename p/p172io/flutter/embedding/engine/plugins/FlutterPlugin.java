package p172io.flutter.embedding.engine.plugins;

import android.content.Context;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.platform.PlatformViewRegistry;
import p172io.flutter.view.TextureRegistry;

/* renamed from: io.flutter.embedding.engine.plugins.FlutterPlugin */
public interface FlutterPlugin {

    /* renamed from: io.flutter.embedding.engine.plugins.FlutterPlugin$FlutterAssets */
    public interface FlutterAssets {
        String getAssetFilePathByName(String str);

        String getAssetFilePathByName(String str, String str2);

        String getAssetFilePathBySubpath(String str);

        String getAssetFilePathBySubpath(String str, String str2);
    }

    /* renamed from: io.flutter.embedding.engine.plugins.FlutterPlugin$FlutterPluginBinding */
    public static class FlutterPluginBinding {
        private final Context applicationContext;
        private final BinaryMessenger binaryMessenger;
        private final FlutterAssets flutterAssets;
        private final FlutterEngine flutterEngine;
        private final PlatformViewRegistry platformViewRegistry;
        private final TextureRegistry textureRegistry;

        public FlutterPluginBinding(Context context, FlutterEngine flutterEngine2, BinaryMessenger binaryMessenger2, TextureRegistry textureRegistry2, PlatformViewRegistry platformViewRegistry2, FlutterAssets flutterAssets2) {
            this.applicationContext = context;
            this.flutterEngine = flutterEngine2;
            this.binaryMessenger = binaryMessenger2;
            this.textureRegistry = textureRegistry2;
            this.platformViewRegistry = platformViewRegistry2;
            this.flutterAssets = flutterAssets2;
        }

        public Context getApplicationContext() {
            return this.applicationContext;
        }

        public BinaryMessenger getBinaryMessenger() {
            return this.binaryMessenger;
        }

        public FlutterAssets getFlutterAssets() {
            return this.flutterAssets;
        }

        @Deprecated
        public FlutterEngine getFlutterEngine() {
            return this.flutterEngine;
        }

        public PlatformViewRegistry getPlatformViewRegistry() {
            return this.platformViewRegistry;
        }

        public TextureRegistry getTextureRegistry() {
            return this.textureRegistry;
        }
    }

    void onAttachedToEngine(FlutterPluginBinding flutterPluginBinding);

    void onDetachedFromEngine(FlutterPluginBinding flutterPluginBinding);
}
