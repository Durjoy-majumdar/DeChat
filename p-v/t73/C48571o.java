package t73;

import fy3.C32226l;
import gy3.C87412m;
import java.util.HashMap;
import rx3.C13598b0;
import s73.C48255c;

/* renamed from: t73.o */
public abstract class C48571o {

    /* renamed from: a */
    public C48255c f129943a;

    /* renamed from: b */
    public HashMap<String, Integer> f129944b;

    /* renamed from: a */
    public boolean mo73123a(int i, String str, C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(lVar, "onCompleted");
        return false;
    }

    /* renamed from: b */
    public boolean mo63601b(String str, String str2, String str3, String str4) {
        C87412m.m108594g(str3, "event");
        return false;
    }

    /* renamed from: c */
    public C48255c.C36631a mo73186c(String str, String str2) {
        C87412m.m108594g(str, "type");
        C87412m.m108594g(str2, "appId");
        return new C48255c.C36631a(str2, mo73188e().mo72991B1(str).getLong("idKey"));
    }

    /* renamed from: d */
    public final HashMap<String, Integer> mo73187d() {
        HashMap<String, Integer> hashMap = this.f129944b;
        if (hashMap != null) {
            return hashMap;
        }
        C87412m.m108603p("contextMap");
        throw null;
    }

    /* renamed from: e */
    public final C48255c mo73188e() {
        C48255c cVar = this.f129943a;
        if (cVar != null) {
            return cVar;
        }
        C87412m.m108603p("jsEngine");
        throw null;
    }

    /* renamed from: f */
    public boolean mo63709f(int i, C48555a aVar, String str, C32226l<? super String, C13598b0> lVar) {
        C87412m.m108594g(aVar, "manifest");
        C87412m.m108594g(str, "script");
        C87412m.m108594g(lVar, "onCallback");
        return false;
    }
}
