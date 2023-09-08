package cm1;

import gy3.C87412m;
import te3.C51270sn1;
import tf1.C13914m;

/* renamed from: cm1.g2 */
public final class C0734g2 implements C0740i2 {

    /* renamed from: d */
    public final C51270sn1 f1749d;

    /* renamed from: e */
    public final int f1750e;

    /* renamed from: f */
    public boolean f1751f;

    /* renamed from: g */
    public boolean f1752g;

    public C0734g2(C51270sn1 sn12, int i) {
        C87412m.m108594g(sn12, "topicInfo");
        this.f1749d = sn12;
        this.f1750e = i;
    }

    /* renamed from: c */
    public int mo75c() {
        return this.f1750e;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        return (!(mVar instanceof C0734g2) || ((C0734g2) mVar).f1749d.f141618e != this.f1749d.f141618e) ? -1 : 0;
    }

    public long getItemId() {
        return this.f1749d.f141618e;
    }
}
