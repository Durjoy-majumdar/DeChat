package c52;

import com.tencent.p014mm.plugin.magicbrush.C30204k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import d42.C31068j;
import di3.C86312j;
import e42.C31415g;
import e42.C7596h;
import gy3.C87412m;
import java.util.HashMap;
import z04.C112550d0;

/* renamed from: c52.a */
public final class C28497a {
    /* renamed from: a */
    public final HashMap<String, Object> mo56007a(C7596h hVar, String str) {
        String str2;
        C87412m.m108594g(hVar, "data");
        C87412m.m108594g(str, "metaInstanceName");
        String optString = hVar.optString("key");
        String str3 = null;
        String optString2 = hVar.optString("instanceName", (String) null);
        Log.m105924i("MBJsApiGetLocalDataSync", "key:" + optString + ",instanceName:" + optString2);
        String g0 = C112550d0.m153797g0(str, "-", str);
        C31068j wt02 = ((C30204k0) C86312j.m106911c(C30204k0.class)).wt0(g0, optString2 != null ? C112550d0.m153797g0(optString2, "-", optString2) : null);
        if (wt02 != null) {
            Object[] w = wt02.mo57966w(g0, optString);
            C87412m.m108593f(w, "it.get(bizName,key)");
            Object obj = w[0];
            C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.magicbrush.base.MBErrorInfo");
            C31415g gVar = (C31415g) obj;
            C31415g gVar2 = C31415g.C7595b.f25862a;
            if (C87412m.m108589b(gVar, gVar2)) {
                Object obj2 = w[1];
                C87412m.m108592e(obj2, "null cannot be cast to non-null type kotlin.String");
                str2 = (String) obj2;
            } else {
                str2 = null;
            }
            if (C87412m.m108589b(gVar, gVar2)) {
                Object obj3 = w[2];
                C87412m.m108592e(obj3, "null cannot be cast to non-null type kotlin.String");
                str3 = obj3;
            }
            if (!C87412m.m108589b(gVar, gVar2) || str2 == null) {
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("error", gVar);
                return hashMap;
            }
            HashMap<String, Object> hashMap2 = new HashMap<>();
            hashMap2.put("error", gVar2);
            hashMap2.put("data", str2);
            hashMap2.put("type", str3);
            return hashMap2;
        }
        HashMap<String, Object> hashMap3 = new HashMap<>();
        hashMap3.put("error", C31415g.C31417c.f84094a);
        return hashMap3;
    }
}
