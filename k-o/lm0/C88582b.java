package lm0;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.appusage.C81516o;
import com.tencent.p014mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Result;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: lm0.b */
public final class C88582b implements C81516o.C68588b {

    /* renamed from: a */
    public final /* synthetic */ C32226l<Long, C13598b0> f255838a;

    /* renamed from: b */
    public final /* synthetic */ long f255839b;

    /* renamed from: c */
    public final /* synthetic */ C1256g<JsApiGetRecentUsageList$Companion$Result> f255840c;

    public C88582b(C32226l<? super Long, C13598b0> lVar, long j, C1256g<JsApiGetRecentUsageList$Companion$Result> gVar) {
        this.f255838a = lVar;
        this.f255839b = j;
        this.f255840c = gVar;
    }

    /* renamed from: a */
    public final void mo94253a(boolean z, String str) {
        Log.m105924i("MicroMsg.JsApiGetRecentUsageList", "fetchNextPageFromServer  success=" + z + " errorMsg=" + str);
        if (z) {
            this.f255838a.invoke(Long.valueOf(this.f255839b));
            return;
        }
        C1256g<JsApiGetRecentUsageList$Companion$Result> gVar = this.f255840c;
        C87412m.m108593f(str, OpenSDKTool4Assistant.EXTRA_ERROR_MSG);
        gVar.mo894a(new JsApiGetRecentUsageList$Companion$Result("", -1000, str));
    }
}
