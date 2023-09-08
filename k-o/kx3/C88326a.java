package kx3;

import android.content.Context;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MethodChannel;

/* renamed from: kx3.a */
public class C88326a implements FlutterPlugin {

    /* renamed from: d */
    public MethodChannel f255314d;

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        this.f255314d = new MethodChannel(binaryMessenger, "dev.fluttercommunity.plus/device_info");
        this.f255314d.setMethodCallHandler(new C88327b(applicationContext.getContentResolver(), applicationContext.getPackageManager()));
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f255314d.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        this.f255314d = null;
    }
}
