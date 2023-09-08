package qr1;

import d03.C58010a;
import gy3.C87412m;
import u23.C65003a;

/* renamed from: qr1.d */
public final class C63320d extends C65003a {

    /* renamed from: n */
    public final C58010a f179677n;

    public C63320d(C58010a aVar) {
        C87412m.m108594g(aVar, "mediaInfo");
        this.f179677n = aVar;
        this.f187124d = 0;
        long j = aVar.f165935g;
        this.f187125e = j;
        this.f187126f = ((float) (j - 0)) / 1000.0f;
    }

    /* renamed from: a */
    public long mo88218a() {
        C58010a aVar = this.f179677n;
        return aVar.f165942n + aVar.f165943o;
    }

    /* renamed from: b */
    public float mo88219b() {
        return 1.0f;
    }

    /* renamed from: c */
    public long mo88220c() {
        return this.f179677n.f165942n;
    }

    /* renamed from: d */
    public long mo88221d() {
        return this.f179677n.f165935g;
    }

    /* renamed from: e */
    public boolean mo88222e() {
        String str = this.f179677n.f165948t;
        C87412m.m108593f(str, "mediaInfo.path");
        return str.length() == 0;
    }
}
