package fm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82644m7;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import zt3.C119157j;

/* renamed from: fm0.l */
public class C86954l extends C82016a0<C81879g> {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "initReady";

    /* renamed from: fm0.l$a */
    public class C86955a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C81879g f252391d;

        /* renamed from: e */
        public final /* synthetic */ JSONObject f252392e;

        /* renamed from: f */
        public final /* synthetic */ String f252393f;

        public C86955a(C86954l lVar, C81879g gVar, JSONObject jSONObject, String str) {
            this.f252391d = gVar;
            this.f252392e = jSONObject;
            this.f252393f = str;
        }

        public void run() {
            C83780d1 a = C82644m7.m101430a(this.f252391d);
            boolean optBoolean = this.f252392e.optBoolean("ignoreWebviewPreload", false);
            int componentId = a != null ? a.getComponentId() : 0;
            boolean z = a != null && a.isRunning();
            Log.m105925i("MicroMsg.JsApiInitReady", "invoke, appId:%s, webviewId:%s, isRunning:%b, ignoreWebviewPreload:%b, url:%s", this.f252393f, Integer.valueOf(componentId), Boolean.valueOf(z), Boolean.valueOf(optBoolean), a != null ? a.mo116162Q0() : "");
            if (z) {
                if (!optBoolean) {
                    a.getRuntime().mo113042Z().mo116339e0(a);
                }
                a.mo116176e1(C86954l.NAME);
            }
        }
    }

    /* renamed from: v */
    public String mo1731t(C81879g gVar, JSONObject jSONObject) {
        String appId = gVar.getAppId();
        ((C119157j) C119157j.f356862d).mo183895z(new C86955a(this, gVar, jSONObject, appId));
        return mo115109j("ok");
    }
}
