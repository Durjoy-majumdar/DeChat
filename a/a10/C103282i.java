package a10;

import gy3.C87412m;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.StringCodec;

/* renamed from: a10.i */
public final class C103282i implements FlutterPlugin {

    /* renamed from: d */
    public BasicMessageChannel<String> f304526d;

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        this.f304526d = new BasicMessageChannel<>(flutterPluginBinding.getBinaryMessenger(), "mmflutter/host_event", StringCodec.INSTANCE);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        this.f304526d = null;
    }
}
