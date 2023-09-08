package p172io.flutter.plugins.webviewflutter;

import android.content.res.AssetManager;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.plugin.common.PluginRegistry;

/* renamed from: io.flutter.plugins.webviewflutter.FlutterAssetManager */
abstract class FlutterAssetManager {
    public final AssetManager assetManager;

    /* renamed from: io.flutter.plugins.webviewflutter.FlutterAssetManager$PluginBindingFlutterAssetManager */
    public static class PluginBindingFlutterAssetManager extends FlutterAssetManager {
        public final FlutterPlugin.FlutterAssets flutterAssets;

        public PluginBindingFlutterAssetManager(AssetManager assetManager, FlutterPlugin.FlutterAssets flutterAssets2) {
            super(assetManager);
            this.flutterAssets = flutterAssets2;
        }

        public String getAssetFilePathByName(String str) {
            return this.flutterAssets.getAssetFilePathByName(str);
        }
    }

    @Deprecated
    /* renamed from: io.flutter.plugins.webviewflutter.FlutterAssetManager$RegistrarFlutterAssetManager */
    public static class RegistrarFlutterAssetManager extends FlutterAssetManager {
        public final PluginRegistry.Registrar registrar;

        public RegistrarFlutterAssetManager(AssetManager assetManager, PluginRegistry.Registrar registrar2) {
            super(assetManager);
            this.registrar = registrar2;
        }

        public String getAssetFilePathByName(String str) {
            return this.registrar.lookupKeyForAsset(str);
        }
    }

    public FlutterAssetManager(AssetManager assetManager2) {
        this.assetManager = assetManager2;
    }

    public abstract String getAssetFilePathByName(String str);

    public String[] list(String str) {
        return this.assetManager.list(str);
    }
}
