package cm1;

import gy3.C87412m;
import te3.C51108rh0;
import tf1.C13914m;

/* renamed from: cm1.o */
public final class C0757o implements C0740i2 {

    /* renamed from: d */
    public final C51108rh0 f1784d;

    /* renamed from: e */
    public boolean f1785e;

    public C0757o(C51108rh0 rh02) {
        C87412m.m108594g(rh02, "collectionInfo");
        this.f1784d = rh02;
    }

    /* renamed from: c */
    public int mo75c() {
        return C0757o.class.getName().hashCode();
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        return (!(mVar instanceof C0757o) || ((C0757o) mVar).f1784d.f140917d != this.f1784d.f140917d) ? -1 : 0;
    }

    public long getItemId() {
        return this.f1784d.f140917d;
    }
}
