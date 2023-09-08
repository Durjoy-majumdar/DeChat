package lm0;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appusage.C81500i0;
import com.tencent.p014mm.plugin.appbrand.appusage.C81523q1;
import com.tencent.p014mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Parameter;
import com.tencent.p014mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Result;
import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Llm0/i;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/appbrand/jsapi/rencentusage/JsApiOperateRecentUsageList$Companion$Parameter;", "Lcom/tencent/mm/plugin/appbrand/jsapi/rencentusage/JsApiOperateRecentUsageList$Companion$Result;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: lm0.i */
public final class C88590i implements C80883e<JsApiOperateRecentUsageList$Companion$Parameter, JsApiOperateRecentUsageList$Companion$Result> {
    public void invoke(Object obj, C1256g gVar) {
        JsApiOperateRecentUsageList$Companion$Parameter jsApiOperateRecentUsageList$Companion$Parameter = (JsApiOperateRecentUsageList$Companion$Parameter) obj;
        Class cls = C81500i0.class;
        if (jsApiOperateRecentUsageList$Companion$Parameter != null && gVar != null) {
            int ordinal = jsApiOperateRecentUsageList$Companion$Parameter.f242418d.ordinal();
            if (ordinal == 0) {
                Log.m105924i("MicroMsg.operateRecentUsageList", "REMOVE_FROM_RECENT_USAGE_LIST  appId=" + jsApiOperateRecentUsageList$Companion$Parameter.f242420f + "  versionType=" + jsApiOperateRecentUsageList$Companion$Parameter.f242421g);
                C81523q1.m100016a(jsApiOperateRecentUsageList$Companion$Parameter.f242419e, jsApiOperateRecentUsageList$Companion$Parameter.f242420f, jsApiOperateRecentUsageList$Companion$Parameter.f242421g);
                gVar.mo894a(JsApiOperateRecentUsageList$Companion$Result.f242422g);
            } else if (ordinal == 1) {
                Log.m105924i("MicroMsg.operateRecentUsageList", "ADD_TO_MY_COLLECTION   username=" + jsApiOperateRecentUsageList$Companion$Parameter.f242419e + "  versionType=" + jsApiOperateRecentUsageList$Companion$Parameter.f242421g);
                int jo = ((C81500i0) C81161g2.Bx0(cls)).mo113794jo(jsApiOperateRecentUsageList$Companion$Parameter.f242419e, jsApiOperateRecentUsageList$Companion$Parameter.f242421g);
                if (jo == -3) {
                    gVar.mo894a(new JsApiOperateRecentUsageList$Companion$Result(false, C88589h.FAIL_ADD_STAR_BLOCKED, "action be blocked"));
                } else if (jo == -2) {
                    gVar.mo894a(new JsApiOperateRecentUsageList$Companion$Result(false, C88589h.FAIL_ADD_STAR_REACHED_MAXIMUM_LIMIT, "star app's count reached maximum limit"));
                } else if (jo == -1) {
                    gVar.mo894a(JsApiOperateRecentUsageList$Companion$Result.f242423h);
                } else if (jo != 0) {
                    gVar.mo894a(JsApiOperateRecentUsageList$Companion$Result.f242423h);
                } else {
                    gVar.mo894a(JsApiOperateRecentUsageList$Companion$Result.f242422g);
                }
            } else if (ordinal == 2) {
                Log.m105924i("MicroMsg.operateRecentUsageList", "REMOVE_FROM_MY_COLLECTION username=" + jsApiOperateRecentUsageList$Companion$Parameter.f242419e + "  versionType=" + jsApiOperateRecentUsageList$Companion$Parameter.f242421g);
                if (((C81500i0) C81161g2.Bx0(cls)).mo113795kD(jsApiOperateRecentUsageList$Companion$Parameter.f242419e, jsApiOperateRecentUsageList$Companion$Parameter.f242421g, true)) {
                    gVar.mo894a(JsApiOperateRecentUsageList$Companion$Result.f242422g);
                } else {
                    gVar.mo894a(JsApiOperateRecentUsageList$Companion$Result.f242423h);
                }
            }
        }
    }
}
