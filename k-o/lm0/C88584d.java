package lm0;

import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Parameter;
import com.tencent.p014mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Result;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import kotlin.Metadata;
import q20.C89449a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Llm0/d;", "Lcom/tencent/mm/ipcinvoker/d;", "Lcom/tencent/mm/plugin/appbrand/jsapi/rencentusage/JsApiGetRecentUsageList$Companion$Parameter;", "Lcom/tencent/mm/plugin/appbrand/jsapi/rencentusage/JsApiGetRecentUsageList$Companion$Result;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C89449a
/* renamed from: lm0.d */
public final class C88584d implements C1255d<JsApiGetRecentUsageList$Companion$Parameter, JsApiGetRecentUsageList$Companion$Result> {
    public void invoke(Object obj, C1256g gVar) {
        JsApiGetRecentUsageList$Companion$Parameter jsApiGetRecentUsageList$Companion$Parameter = (JsApiGetRecentUsageList$Companion$Parameter) obj;
        if (jsApiGetRecentUsageList$Companion$Parameter != null && gVar != null) {
            C88581a aVar = new C88581a(jsApiGetRecentUsageList$Companion$Parameter, gVar, this);
            C88583c cVar = new C88583c(jsApiGetRecentUsageList$Companion$Parameter, aVar, gVar);
            long j = jsApiGetRecentUsageList$Companion$Parameter.f242413e;
            if (0 == j) {
                aVar.invoke(Long.valueOf(MAlarmHandler.NEXT_FIRE_INTERVAL));
                cVar.invoke(Boolean.TRUE, Long.valueOf(MAlarmHandler.NEXT_FIRE_INTERVAL));
                return;
            }
            cVar.invoke(Boolean.FALSE, Long.valueOf(j));
        }
    }
}
