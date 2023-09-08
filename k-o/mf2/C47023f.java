package mf2;

import cm1.C0740i2;
import gy3.C87412m;
import te3.C49425fi;
import tf1.C13914m;

/* renamed from: mf2.f */
public final class C47023f implements C0740i2 {

    /* renamed from: d */
    public final C49425fi f126381d;

    public C47023f(C49425fi fiVar) {
        C87412m.m108594g(fiVar, "topicInfo");
        this.f126381d = fiVar;
    }

    /* renamed from: c */
    public int mo75c() {
        return 0;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        return (!(mVar instanceof C47023f) || ((C47023f) mVar).f126381d.f133513g != this.f126381d.f133513g) ? -1 : 0;
    }

    public long getItemId() {
        return this.f126381d.f133513g;
    }
}
