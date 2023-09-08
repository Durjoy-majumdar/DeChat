package tf0;

import com.tencent.pigeon.FlutterPlatformPigeon;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import z04.C112550d0;

/* renamed from: tf0.l1 */
public final class C64913l1 implements FlutterPlugin, FlutterPlatformPigeon.FlutterPlatformChannel {

    /* renamed from: tf0.l1$a */
    public static final class C64914a {
        public C64914a(C8480h hVar) {
        }
    }

    static {
        new C64914a((C8480h) null);
    }

    public String getAppVersion() {
        if ("1.0.0-5023-5ec677d6-wechat-2.10".length() == 0) {
            return "";
        }
        List U = C112550d0.m153785U("1.0.0-5023-5ec677d6-wechat-2.10", new String[]{"-"}, false, 0, 6, (Object) null);
        return U.size() > 3 ? (String) U.get(2) : "";
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
    }
}
