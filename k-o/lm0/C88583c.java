package lm0;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.appusage.C81516o;
import com.tencent.p014mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Parameter;
import com.tencent.p014mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Result;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: lm0.c */
public final class C88583c extends C87413o implements C32227p<Boolean, Long, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ JsApiGetRecentUsageList$Companion$Parameter f255841d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<Long, C13598b0> f255842e;

    /* renamed from: f */
    public final /* synthetic */ C1256g<JsApiGetRecentUsageList$Companion$Result> f255843f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88583c(JsApiGetRecentUsageList$Companion$Parameter jsApiGetRecentUsageList$Companion$Parameter, C32226l<? super Long, C13598b0> lVar, C1256g<JsApiGetRecentUsageList$Companion$Result> gVar) {
        super(2);
        this.f255841d = jsApiGetRecentUsageList$Companion$Parameter;
        this.f255842e = lVar;
        this.f255843f = gVar;
    }

    public Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        long longValue = ((Number) obj2).longValue();
        if (C81516o.m100008vF() || booleanValue) {
            C81516o.m100007qq().mo113802Lo(Util.nowMilliSecond(), false, (Bundle) null, 3, 0, this.f255841d.f242412d, longValue, new C88582b(this.f255842e, longValue, this.f255843f));
        } else {
            this.f255842e.invoke(Long.valueOf(longValue));
        }
        return C13598b0.f38549a;
    }
}
