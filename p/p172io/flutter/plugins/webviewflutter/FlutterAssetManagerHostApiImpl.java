package p172io.flutter.plugins.webviewflutter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p172io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* renamed from: io.flutter.plugins.webviewflutter.FlutterAssetManagerHostApiImpl */
public class FlutterAssetManagerHostApiImpl implements GeneratedAndroidWebView.FlutterAssetManagerHostApi {
    public final FlutterAssetManager flutterAssetManager;

    public FlutterAssetManagerHostApiImpl(FlutterAssetManager flutterAssetManager2) {
        this.flutterAssetManager = flutterAssetManager2;
    }

    public String getAssetFilePathByName(String str) {
        return this.flutterAssetManager.getAssetFilePathByName(str);
    }

    public List<String> list(String str) {
        try {
            String[] list = this.flutterAssetManager.list(str);
            return list == null ? new ArrayList() : Arrays.asList(list);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
