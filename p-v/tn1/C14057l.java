package tn1;

import cm1.C0740i2;
import gy3.C87412m;
import tf1.C13914m;

/* renamed from: tn1.l */
public final class C14057l implements C0740i2 {

    /* renamed from: d */
    public final int f39432d;

    /* renamed from: e */
    public final String f39433e;

    /* renamed from: f */
    public int f39434f;

    /* renamed from: g */
    public boolean f39435g;

    public C14057l(int i, String str, int i2) {
        C87412m.m108594g(str, "tabTitle");
        this.f39432d = i;
        this.f39433e = str;
        this.f39434f = i2;
    }

    /* renamed from: c */
    public int mo75c() {
        return C14057l.class.hashCode();
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        return (!(mVar instanceof C14057l) || ((C14057l) mVar).f39432d != this.f39432d) ? -1 : 0;
    }

    public long getItemId() {
        return (long) this.f39432d;
    }
}
