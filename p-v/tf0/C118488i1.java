package tf0;

import com.tencent.pigeon.C19927c;
import com.tencent.pigeon.FlutterHostAssetPigeon;
import fu1.C116899b;
import fu1.C32171c;
import gy3.C87412m;
import java.util.HashMap;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;

/* renamed from: tf0.i1 */
public final class C118488i1 implements FlutterPlugin, FlutterHostAssetPigeon.FlutterHostAssetHost {
    public byte[] load(String str) {
        C116899b bVar;
        C87412m.m108594g(str, "key");
        HashMap<String, C116899b> hashMap = C32171c.f85529a;
        HashMap<String, C116899b> hashMap2 = C32171c.f85529a;
        synchronized (hashMap2) {
            bVar = hashMap2.get(str);
        }
        if (bVar != null) {
            return bVar.load(str);
        }
        return null;
    }

    public String loadString(String str, Boolean bool) {
        C116899b bVar;
        bool.booleanValue();
        C87412m.m108594g(str, "key");
        HashMap<String, C116899b> hashMap = C32171c.f85529a;
        HashMap<String, C116899b> hashMap2 = C32171c.f85529a;
        synchronized (hashMap2) {
            bVar = hashMap2.get(str);
        }
        if (bVar != null) {
            return bVar.mo180863a(str);
        }
        return null;
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        C19927c.m21717d(flutterPluginBinding.getBinaryMessenger(), this);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        C19927c.m21717d(flutterPluginBinding.getBinaryMessenger(), (FlutterHostAssetPigeon.FlutterHostAssetHost) null);
    }
}
