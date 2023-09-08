package com.tencent.p014mm.plugin.appbrand.jsapi.fakenative;

import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.luggage.sdk.config.AppBrandInitWindowConfig;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82794c;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84499c0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import kr0.C76630x0;
import org.json.JSONObject;
import wi0.C90973a0;
import wi0.C91003z;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.fakenative.f */
public class C82394f implements OpenBusinessViewUtil.C40463b {

    /* renamed from: a */
    public final /* synthetic */ C81879g f241448a;

    /* renamed from: b */
    public final /* synthetic */ int f241449b;

    /* renamed from: c */
    public final /* synthetic */ int f241450c;

    /* renamed from: d */
    public final /* synthetic */ C82794c.C82795a f241451d;

    /* renamed from: e */
    public final /* synthetic */ JSONObject f241452e;

    /* renamed from: f */
    public final /* synthetic */ C82398i f241453f;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.fakenative.f$a */
    public class C82395a implements C82794c.C82798c {

        /* renamed from: a */
        public final /* synthetic */ String f241454a;

        /* renamed from: b */
        public final /* synthetic */ String f241455b;

        /* renamed from: c */
        public final /* synthetic */ boolean f241456c;

        public C82395a(String str, String str2, boolean z) {
            this.f241454a = str;
            this.f241455b = str2;
            this.f241456c = z;
        }

        /* renamed from: a */
        public void mo1732a(boolean z, String str) {
            if (z) {
                Log.m105924i("MicroMsg.JsApiOpenBusinessView", "openBusinessViewByMiniProgram success");
                return;
            }
            Log.m105921e("MicroMsg.JsApiOpenBusinessView", "openBusinessViewByMiniProgram fail, reason=%s", str);
            C82394f fVar = C82394f.this;
            fVar.f241453f.mo114795x(fVar.f241448a, fVar.f241449b, -1, "fail system error");
        }

        /* renamed from: b */
        public void mo1733b(AppBrandInitConfig appBrandInitConfig) {
            boolean z = !((C76630x0) C86312j.m106911c(C76630x0.class)).fn0();
            AppBrandInitConfigLU appBrandInitConfigLU = (AppBrandInitConfigLU) appBrandInitConfig;
            boolean z2 = appBrandInitConfigLU.f234804H.f239451D;
            boolean b = C84499c0.m104088b();
            Log.m105925i("MicroMsg.JsApiOpenBusinessView", "openBusinessViewByMiniProgram-onBeforeNavigate, target appId:%s, path:%s, transparent(svr?:%b, compatibility?:%b, app?:%b, app.debug_switch?:%b)", this.f241454a, this.f241455b, Boolean.valueOf(this.f241456c), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(b));
            if (this.f241456c && z) {
                if (z2 || b) {
                    AppBrandInitWindowConfig appBrandInitWindowConfig = new AppBrandInitWindowConfig();
                    appBrandInitWindowConfig.f234851f = C90973a0.TRANSPARENT;
                    C91003z zVar = C91003z.DISABLED;
                    appBrandInitWindowConfig.f234854i = zVar;
                    appBrandInitWindowConfig.f234855j = zVar;
                    appBrandInitConfigLU.f234828Y = appBrandInitWindowConfig;
                }
            }
        }
    }

    public C82394f(C82398i iVar, C81879g gVar, int i, int i2, C82794c.C82795a aVar, JSONObject jSONObject) {
        this.f241453f = iVar;
        this.f241448a = gVar;
        this.f241449b = i;
        this.f241450c = i2;
        this.f241451d = aVar;
        this.f241452e = jSONObject;
    }

    /* renamed from: A */
    public void mo63221A(String str, String str2, boolean z) {
        C82398i iVar = this.f241453f;
        iVar.getClass();
        MMHandlerThread.postToMainThread(new C82397h(iVar));
        if (!this.f241453f.f241462g) {
            if (Util.isNullOrNil(str)) {
                Log.m105920e("MicroMsg.JsApiOpenBusinessView", "openBusinessViewByMiniProgram, invalid businessType");
                this.f241453f.mo114795x(this.f241448a, this.f241449b, -4, "fail invalid businessType");
                return;
            }
            this.f241453f.getClass();
            C82403p.f241473c.mo115046b(this.f241448a, str, this.f241450c, str2, this.f241451d, this.f241452e, (HalfScreenConfig) null, new C82395a(str, str2, z));
        }
    }

    /* renamed from: z */
    public void mo63222z(int i, String str) {
        C82398i iVar = this.f241453f;
        iVar.getClass();
        MMHandlerThread.postToMainThread(new C82397h(iVar));
        Log.m105921e("MicroMsg.JsApiOpenBusinessView", "openBusinessViewByMiniProgram fail, CGI errCode:%d, errMsg:%s", Integer.valueOf(i), str);
        this.f241453f.mo114795x(this.f241448a, this.f241449b, -2, "fail CGI error");
    }
}
