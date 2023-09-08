package nj0;

import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import z04.C112551y;

/* renamed from: nj0.k */
public final class C88971k extends C88986z<Boolean> {

    /* renamed from: f */
    public static final HashMap<String, C88971k> f256561f = new HashMap<>();

    /* renamed from: c */
    public final String f256562c;

    /* renamed from: d */
    public final boolean f256563d;

    /* renamed from: e */
    public final boolean f256564e;

    /* renamed from: nj0.k$a */
    public static final class C88972a {
        public C88972a(C8480h hVar) {
        }

        /* renamed from: a */
        public static final void m111131a(C88972a aVar, C88971k kVar) {
            aVar.getClass();
            HashMap<String, C88971k> hashMap = C88971k.f256561f;
            String str = kVar.f256562c;
            C87412m.m108591d(str);
            hashMap.put(str, kVar);
        }
    }

    static {
        C88972a aVar = new C88972a((C8480h) null);
        C88972a.m111131a(aVar, new C88971k("localso", false, false, 4, (C8480h) null));
        C88972a.m111131a(aVar, new C88971k("renderprofiler", false, false, 4, (C8480h) null));
        C88972a.m111131a(aVar, new C88971k("debugNode", false, false, 4, (C8480h) null));
        C88972a.m111131a(aVar, new C88971k("tracejstask", false, false, 4, (C8480h) null));
    }

    public C88971k(String str, boolean z, boolean z2, int i, C8480h hVar) {
        z2 = (i & 4) != 0 ? true : z2;
        C87412m.m108594g(str, "kv");
        this.f256562c = str;
        this.f256563d = z;
        this.f256564e = z2;
        C112551y.m153811k(str);
    }

    /* renamed from: i */
    public static final C88971k m111126i(String str) {
        C87412m.m108594g(str, "kv_name");
        C88971k kVar = f256561f.get(str);
        C87412m.m108591d(kVar);
        return kVar;
    }

    /* renamed from: c */
    public boolean mo123351c() {
        return this.f256564e;
    }

    /* renamed from: d */
    public String mo123349d() {
        return this.f256562c;
    }

    /* renamed from: f */
    public Object mo123347f() {
        return Boolean.valueOf(this.f256563d);
    }

    /* renamed from: g */
    public Object mo123348g(String str) {
        return mo123354h(str);
    }
}
