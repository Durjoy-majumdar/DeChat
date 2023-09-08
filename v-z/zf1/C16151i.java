package zf1;

import cm1.C0740i2;
import gy3.C87412m;
import tf1.C13914m;

/* renamed from: zf1.i */
public final class C16151i implements C0740i2 {

    /* renamed from: d */
    public final C16150h f43344d;

    /* renamed from: e */
    public boolean f43345e;

    public C16151i(C16150h hVar) {
        C87412m.m108594g(hVar, "galleryTabData");
        this.f43344d = hVar;
    }

    /* renamed from: c */
    public int mo75c() {
        return 1;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        return (!(mVar instanceof C16151i) || ((C16151i) mVar).f43344d.f43342a != this.f43344d.f43342a) ? -1 : 0;
    }

    public long getItemId() {
        return (long) this.f43344d.f43342a;
    }
}
