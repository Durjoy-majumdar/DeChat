package jo0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONException;
import org.json.JSONObject;
import p932bd.C79688b;

/* renamed from: jo0.d */
public class C87997d implements C79688b {

    /* renamed from: a */
    public C81823b f254609a;

    /* renamed from: jo0.d$b */
    public static final class C87999b extends C82919r2 {
        private static final int CTRL_INDEX = 710;
        private static final String NAME = "onXWebLivePlayerAudioVolume";

        public C87999b(C87998a aVar) {
        }
    }

    /* renamed from: jo0.d$c */
    public static final class C88000c extends C82919r2 {
        private static final int CTRL_INDEX = 839;
        private static final String NAME = "onXWebLivePlayerBackgroundPlaybackChange";

        public C88000c(C87998a aVar) {
        }
    }

    /* renamed from: jo0.d$d */
    public static final class C88001d extends C82919r2 {
        private static final int CTRL_INDEX = 575;
        private static final String NAME = "onXWebLivePlayerEvent";

        public C88001d(C87998a aVar) {
        }
    }

    /* renamed from: jo0.d$e */
    public static final class C88002e extends C82919r2 {
        private static final int CTRL_INDEX = 576;
        private static final String NAME = "onXWebLivePlayerNetStatus";

        public C88002e(C87998a aVar) {
        }
    }

    /* renamed from: a */
    public final void mo122451a(C82919r2 r2Var, JSONObject jSONObject) {
        C82381f g;
        if (r2Var != null) {
            if (!r2Var.mo114779e().equalsIgnoreCase("onXWebLivePlayerEvent") && !r2Var.mo114779e().equalsIgnoreCase("onXWebLivePlayerNetStatus") && !r2Var.mo114779e().equalsIgnoreCase("onXWebLivePlayerAudioVolume")) {
                Log.m105925i("MicroMsg.SameLayer.AppBrandLivePlayerEventHandler", "dispatch event:%s, data:%s", r2Var.mo114779e(), jSONObject.toString());
            }
            C82919r2 m = r2Var.mo115163m(jSONObject.toString());
            C81823b bVar = this.f254609a;
            if (bVar != null && (g = bVar.mo62544g()) != null) {
                if (g instanceof C81925i2) {
                    C81925i2 i2Var = (C81925i2) g;
                    i2Var.mo109669n(m, (int[]) null);
                    C83780d1 l0 = i2Var.mo114341l0();
                    if (l0 != null) {
                        l0.mo109669n(m, (int[]) null);
                    }
                } else if (g instanceof C83780d1) {
                    C83780d1 d1Var = (C83780d1) g;
                    d1Var.mo109669n(m, (int[]) null);
                    C81925i2 O0 = d1Var.mo116160O0();
                    if (O0 != null) {
                        O0.mo109669n(m, (int[]) null);
                    }
                } else {
                    g.mo109669n(m, (int[]) null);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo122452b(int i, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewId", i);
            jSONObject.put("playInBackground", z);
            mo122451a(new C88000c((C87998a) null), jSONObject);
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.SameLayer.AppBrandLivePlayerEventHandler", "onXWebLivePlayerBackgroundPlaybackChange fail", e);
        }
    }
}
