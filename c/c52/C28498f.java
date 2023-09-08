package c52;

import com.tencent.p014mm.plugin.magicbrush.C30204k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import d42.C31068j;
import di3.C86312j;
import e42.C31415g;
import e42.C7596h;
import gy3.C87412m;
import z04.C112550d0;

/* renamed from: c52.f */
public final class C28498f {
    /* renamed from: a */
    public final C31415g mo56008a(C7596h hVar, String str) {
        C87412m.m108594g(hVar, "data");
        C87412m.m108594g(str, "metaInstanceName");
        String optString = hVar.optString("key");
        String optString2 = hVar.optString("data");
        String str2 = null;
        String optString3 = hVar.optString("instanceName", (String) null);
        Log.m105924i("MBJsApiSetLocalDataSync", "key:" + optString + ",instanceName:" + optString3);
        String g0 = C112550d0.m153797g0(str, "-", str);
        if (optString3 != null) {
            str2 = C112550d0.m153797g0(optString3, "-", optString3);
        }
        C31068j wt02 = ((C30204k0) C86312j.m106911c(C30204k0.class)).wt0(g0, str2);
        if (wt02 == null) {
            return C31415g.C31417c.f84094a;
        }
        C31415g b = wt02.mo57964b(g0, optString, optString2, "String");
        C31415g gVar = C31415g.C7595b.f25862a;
        if (C87412m.m108589b(b, gVar)) {
            return gVar;
        }
        C87412m.m108593f(b, "error");
        return b;
    }
}
