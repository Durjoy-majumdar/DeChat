package lm0;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Result;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import kr0.C88267e;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: lm0.j */
public final class C88591j<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ C88267e f255854d;

    /* renamed from: e */
    public final /* synthetic */ int f255855e;

    /* renamed from: f */
    public final /* synthetic */ C88592k f255856f;

    public C88591j(C88267e eVar, int i, C88592k kVar) {
        this.f255854d = eVar;
        this.f255855e = i;
        this.f255856f = kVar;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        JsApiOperateRecentUsageList$Companion$Result jsApiOperateRecentUsageList$Companion$Result = (JsApiOperateRecentUsageList$Companion$Result) obj;
        if (jsApiOperateRecentUsageList$Companion$Result.f242424d) {
            this.f255854d.mo109647a(this.f255855e, this.f255856f.mo115112m("ok", C90364q0.m113146e(new C13604l(OpenSDKTool4Assistant.EXTRA_ERROR_CODE, Integer.valueOf(jsApiOperateRecentUsageList$Companion$Result.f242425e.f255853d)))));
            return;
        }
        C88267e eVar = this.f255854d;
        int i = this.f255855e;
        C88592k kVar = this.f255856f;
        String str = "fail:" + jsApiOperateRecentUsageList$Companion$Result.f242426f;
        kVar.mo123035w(str, "");
        eVar.mo109647a(i, kVar.mo115112m(str, C90364q0.m113146e(new C13604l(OpenSDKTool4Assistant.EXTRA_ERROR_CODE, Integer.valueOf(jsApiOperateRecentUsageList$Companion$Result.f242425e.f255853d)))));
    }
}
