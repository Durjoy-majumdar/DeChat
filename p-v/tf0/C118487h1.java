package tf0;

import com.tencent.pigeon.C116359b;
import com.tencent.pigeon.FlutterExptPigeon;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;

/* renamed from: tf0.h1 */
public final class C118487h1 implements FlutterExptPigeon.FlutterExptHost, FlutterPlugin {
    public FlutterExptPigeon.FlutterExptResponse get(FlutterExptPigeon.FlutterExptRequest flutterExptRequest) {
        C87412m.m108594g(flutterExptRequest, "request");
        FlutterExptPigeon.FlutterExptResponse build = new FlutterExptPigeon.FlutterExptResponse.Builder().setResult(((C32735h) C86312j.m106911c(C32735h.class)).mo58776F5(flutterExptRequest.getKey(), (String) null)).build();
        C87412m.m108593f(build, "Builder()\n            .s…ll))\n            .build()");
        return build;
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        C116359b.m163992c(flutterPluginBinding.getBinaryMessenger(), this);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
    }
}
