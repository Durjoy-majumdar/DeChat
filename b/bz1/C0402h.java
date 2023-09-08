package bz1;

import java.util.HashMap;
import java.util.Map;
import xy1.C15912f;
import xy1.C15913g;

/* renamed from: bz1.h */
public final class C0402h implements C15913g.C15916c {

    /* renamed from: a */
    public final /* synthetic */ HashMap<String, C15912f> f1010a;

    /* renamed from: b */
    public final /* synthetic */ C15913g.C15916c f1011b;

    public C0402h(HashMap<String, C15912f> hashMap, C15913g.C15916c cVar) {
        this.f1010a = hashMap;
        this.f1011b = cVar;
    }

    /* renamed from: a */
    public final void mo445a(Map<String, C15912f> map) {
        this.f1010a.putAll(map);
        this.f1011b.mo445a(this.f1010a);
    }
}
