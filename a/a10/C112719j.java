package a10;

import com.tencent.pigeon.FlutterMemoryPigeon;
import gy3.C87412m;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;

/* renamed from: a10.j */
public final class C112719j implements FlutterPlugin {

    /* renamed from: d */
    public FlutterMemoryPigeon.FlutterMemoryHost f337494d;

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        this.f337494d = new FlutterMemoryPigeon.FlutterMemoryHost(flutterPluginBinding.getBinaryMessenger());
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "p0");
        this.f337494d = null;
    }
}
