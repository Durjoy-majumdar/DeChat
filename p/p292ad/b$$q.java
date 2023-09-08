package p292ad;

import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83129y;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tav.core.AssetExtension;
import org.json.JSONObject;
import p1066yc.C91398c;
import p830xc.C91165a;
import p980id.C87695a;

/* renamed from: ad.b$$q */
public class b$$q extends C91398c {

    /* renamed from: i */
    public final /* synthetic */ C79502b f233135i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b$$q(C79502b bVar, C87695a aVar, C83129y yVar) {
        super(aVar, yVar);
        this.f233135i = bVar;
    }

    /* renamed from: a */
    public void mo109535a(String str, C91165a aVar) {
        mo125354c(aVar);
        JSONObject b = aVar.mo62539b();
        if (str.contains("insert") || str.contains("update")) {
            if (b.has(V2TXJSAdapterConstants.PLAYER_KEY_AUTO_PLAY)) {
                this.f262104d = b.optBoolean(V2TXJSAdapterConstants.PLAYER_KEY_AUTO_PLAY);
            }
            Boolean valueOf = b.has("autoRotation") ? Boolean.valueOf(b.optBoolean("autoRotation", false)) : null;
            if (valueOf != null) {
                this.f262105e = valueOf.booleanValue();
            }
        } else if (str.contains("operate")) {
            String optString = b.optString("type");
            if (!Util.isNullOrNil(optString) && (optString.equalsIgnoreCase(AssetExtension.SCENE_PLAY) || optString.equalsIgnoreCase("resume"))) {
                this.f262104d = true;
            }
        } else if (str.contains("remove")) {
            this.f262104d = false;
        }
        String v = this.f233135i.mo109516v();
        Log.m105918d(v, "mAutoRotationPluginHandlerCommons.handleJsApi, mIsNeedNotify: " + this.f262104d + ", mIsAutoRotationEnabled: " + this.f262105e);
    }

    /* renamed from: b */
    public boolean mo109536b() {
        return !this.f233135i.f233078D;
    }
}
