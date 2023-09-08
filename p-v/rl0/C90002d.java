package rl0;

import com.tencent.luggage.sdk.launching.C80242c;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gy3.C87412m;
import li0.C88508b;
import li0.C88509c;
import org.json.JSONObject;

/* renamed from: rl0.d */
public final class C90002d implements C88509c.C88512b {

    /* renamed from: d */
    public final /* synthetic */ C81879g f258581d;

    /* renamed from: e */
    public final /* synthetic */ int f258582e;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f258583f;

    /* renamed from: g */
    public final /* synthetic */ C80242c<IPCString> f258584g;

    /* renamed from: h */
    public final /* synthetic */ String f258585h;

    /* renamed from: i */
    public final /* synthetic */ C90004e f258586i;

    /* renamed from: rl0.d$a */
    public static final class C90003a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C81879g f258587d;

        /* renamed from: e */
        public final /* synthetic */ int f258588e;

        /* renamed from: f */
        public final /* synthetic */ JSONObject f258589f;

        /* renamed from: g */
        public final /* synthetic */ C80242c<IPCString> f258590g;

        /* renamed from: h */
        public final /* synthetic */ String f258591h;

        /* renamed from: i */
        public final /* synthetic */ C90004e f258592i;

        public C90003a(C81879g gVar, int i, JSONObject jSONObject, C80242c<IPCString> cVar, String str, C90004e eVar) {
            this.f258587d = gVar;
            this.f258588e = i;
            this.f258589f = jSONObject;
            this.f258590g = cVar;
            this.f258591h = str;
            this.f258592i = eVar;
        }

        public final void run() {
            try {
                Log.m105924i("MicroMsg.AppBrand.JsApiNavigateBackNative", "invoke onWXAppResult, appId:" + this.f258587d.getAppId() + ", callbackId:" + this.f258588e + " data:" + this.f258589f);
                C80242c<IPCString> cVar = this.f258590g;
                if (cVar != null) {
                    cVar.mo111345a(new IPCString(this.f258591h));
                }
                this.f258587d.mo109647a(this.f258588e, this.f258592i.mo115109j("ok"));
            } catch (Exception e) {
                C81879g gVar = this.f258587d;
                int i = this.f258588e;
                C90004e eVar = this.f258592i;
                gVar.mo109647a(i, eVar.mo115109j("fail " + e.getMessage()));
            }
        }
    }

    public C90002d(C81879g gVar, int i, JSONObject jSONObject, C80242c<IPCString> cVar, String str, C90004e eVar) {
        this.f258581d = gVar;
        this.f258582e = i;
        this.f258583f = jSONObject;
        this.f258584g = cVar;
        this.f258585h = str;
        this.f258586i = eVar;
    }

    /* renamed from: b */
    public void mo113102b(String str, C88508b bVar) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(bVar, "state");
        if (C88508b.BACKGROUND == bVar) {
            this.f258581d.getRuntime().f238113K.mo122982e(this);
            MMHandlerThread.postToMainThread(new C90003a(this.f258581d, this.f258582e, this.f258583f, this.f258584g, this.f258585h, this.f258586i));
        }
    }
}
