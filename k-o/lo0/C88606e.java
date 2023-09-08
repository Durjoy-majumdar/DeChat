package lo0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fl0.C86918c;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p954dd.C86227b;

/* renamed from: lo0.e */
public class C88606e implements C86227b {

    /* renamed from: a */
    public C81823b f255893a;

    /* renamed from: lo0.e$b */
    public static final class C88608b extends C82919r2 {
        private static final int CTRL_INDEX = 784;
        private static final String NAME = "onXWebLivePusherAudioVolume";

        public C88608b(C88607a aVar) {
        }
    }

    /* renamed from: lo0.e$c */
    public static final class C88609c extends C82919r2 {
        private static final int CTRL_INDEX = 573;
        private static final String NAME = "onXWebLivePusherBGMComplete";

        public C88609c(C88607a aVar) {
        }
    }

    /* renamed from: lo0.e$d */
    public static final class C88610d extends C82919r2 {
        private static final int CTRL_INDEX = 572;
        private static final String NAME = "onXWebLivePusherBGMProgress";

        public C88610d(C88607a aVar) {
        }
    }

    /* renamed from: lo0.e$e */
    public static final class C88611e extends C82919r2 {
        private static final int CTRL_INDEX = 571;
        private static final String NAME = "onXWebLivePusherBGMStart";

        public C88611e(C88607a aVar) {
        }
    }

    /* renamed from: lo0.e$f */
    public static final class C88612f extends C82919r2 {
        private static final int CTRL_INDEX = 574;
        private static final String NAME = "onXWebLivePusherError";

        public C88612f(C88607a aVar) {
        }
    }

    /* renamed from: lo0.e$g */
    public static final class C88613g extends C82919r2 {
        private static final int CTRL_INDEX = 569;
        private static final String NAME = "onXWebLivePusherEvent";

        public C88613g(C88607a aVar) {
        }
    }

    /* renamed from: lo0.e$h */
    public static final class C88614h extends C82919r2 {
        private static final int CTRL_INDEX = 570;
        private static final String NAME = "onXWebLivePusherNetStatus";

        public C88614h(C88607a aVar) {
        }
    }

    /* renamed from: a */
    public final void mo123052a(C82919r2 r2Var, JSONObject jSONObject) {
        C82381f g;
        if (r2Var != null) {
            if (!r2Var.mo114779e().equalsIgnoreCase("onXWebLivePusherEvent") && !r2Var.mo114779e().equalsIgnoreCase("onXWebLivePusherNetStatus")) {
                Log.m105925i("MicroMsg.SameLayer.AppBrandLivePusherEventHandler", "dispatch event:%s, data:%s", r2Var.mo114779e(), jSONObject.toString());
            }
            C82919r2 m = r2Var.mo115163m(jSONObject.toString());
            C81823b bVar = this.f255893a;
            if (bVar != null && (g = bVar.mo62544g()) != null) {
                if (g instanceof C81925i2) {
                    ((C81925i2) g).mo109669n(m, (int[]) null);
                } else if (g instanceof C83780d1) {
                    ((C83780d1) g).mo109669n(m, (int[]) null);
                } else {
                    g.mo109669n(m, (int[]) null);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo123053b(int i, C86918c cVar, int i2, String str, HashMap<String, Object> hashMap) {
        C88612f fVar = new C88612f((C88607a) null);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("viewId", i);
            jSONObject.put("errno", cVar.f252304a);
            jSONObject.put("errCode", i2);
            jSONObject.put("errMsg", Util.nullAsNil(str));
            if (hashMap != null && !hashMap.isEmpty()) {
                jSONObject.put("data", new JSONObject(hashMap));
            }
            mo123052a(fVar, jSONObject);
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.SameLayer.AppBrandLivePusherEventHandler", "onXWebLivePusherError fail", e);
        }
    }
}
