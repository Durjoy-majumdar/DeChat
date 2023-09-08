package c52;

import e42.C31415g;
import e42.C7596h;
import e42.C7597n;
import e42.C86432k;
import gy3.C87412m;
import java.util.HashMap;

/* renamed from: c52.c */
public final class C79934c extends C86432k<C7597n> {

    /* renamed from: c */
    public final C28497a f234156c = new C28497a();

    /* renamed from: e */
    public String mo16e() {
        return "getLocalDataSync";
    }

    /* renamed from: o */
    public C7596h mo62167o(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        HashMap<String, Object> a = this.f234156c.mo56007a(hVar, mo120841d().f26666a);
        Object obj = a.get("error");
        C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.magicbrush.base.MBErrorInfo");
        C31415g gVar = (C31415g) obj;
        if (!C87412m.m108589b(gVar, C31415g.C7595b.f25862a)) {
            return mo120842g(gVar.f84089a, gVar.f84090b);
        }
        HashMap hashMap = new HashMap();
        Object obj2 = a.get("data");
        C87412m.m108592e(obj2, "null cannot be cast to non-null type kotlin.String");
        hashMap.put("data", (String) obj2);
        Object obj3 = a.get("type");
        C87412m.m108592e(obj3, "null cannot be cast to non-null type kotlin.String");
        hashMap.put("type", (String) obj3);
        return mo120846k(hashMap);
    }
}
