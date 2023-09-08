package dk1;

import al1.C54127h;
import cm1.C0740i2;
import gy3.C87412m;
import tf1.C13914m;

/* renamed from: dk1.a */
public final class C58307a implements C0740i2 {

    /* renamed from: d */
    public final C54127h f166953d;

    /* renamed from: e */
    public boolean f166954e;

    public C58307a(C54127h hVar) {
        C87412m.m108594g(hVar, "data");
        this.f166953d = hVar;
    }

    /* renamed from: c */
    public int mo75c() {
        return C58307a.class.hashCode();
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        if (mVar instanceof C58307a) {
            return this.f166953d.mo76f(((C58307a) mVar).f166953d);
        }
        return -1;
    }

    public long getItemId() {
        return this.f166953d.f151977d.f157064e;
    }
}
