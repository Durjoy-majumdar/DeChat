package p543h0;

import gy3.C8480h;
import p175j0.C108494d2;
import p175j0.C108500f2;
import p175j0.C108507n2;
import p175j0.C60690y0;
import p436a1.C103272w;

/* renamed from: h0.g */
public final class C107951g {

    /* renamed from: a */
    public final C60690y0 f323279a;

    /* renamed from: b */
    public final C60690y0 f323280b;

    /* renamed from: c */
    public final C60690y0 f323281c;

    /* renamed from: d */
    public final C60690y0 f323282d;

    /* renamed from: e */
    public final C60690y0 f323283e;

    /* renamed from: f */
    public final C60690y0 f323284f;

    /* renamed from: g */
    public final C60690y0 f323285g;

    /* renamed from: h */
    public final C60690y0 f323286h;

    /* renamed from: i */
    public final C60690y0 f323287i;

    /* renamed from: j */
    public final C60690y0 f323288j;

    /* renamed from: k */
    public final C60690y0 f323289k;

    /* renamed from: l */
    public final C60690y0 f323290l;

    /* renamed from: m */
    public final C60690y0 f323291m;

    public C107951g(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j15, long j16, long j17, boolean z, C8480h hVar) {
        long j18 = j;
        C103272w wVar = new C103272w(j);
        C108507n2 n2Var = C108507n2.f324831a;
        this.f323279a = C108500f2.m146995b(wVar, n2Var);
        long j19 = j2;
        this.f323280b = C108500f2.m146995b(new C103272w(j2), n2Var);
        long j25 = j3;
        this.f323281c = C108500f2.m146995b(new C103272w(j3), n2Var);
        long j26 = j4;
        this.f323282d = C108500f2.m146995b(new C103272w(j4), n2Var);
        long j27 = j5;
        this.f323283e = C108500f2.m146995b(new C103272w(j5), n2Var);
        this.f323284f = C108500f2.m146995b(new C103272w(j6), n2Var);
        this.f323285g = C108500f2.m146995b(new C103272w(j7), n2Var);
        this.f323286h = C108500f2.m146995b(new C103272w(j8), n2Var);
        this.f323287i = C108500f2.m146995b(new C103272w(j9), n2Var);
        this.f323288j = C108500f2.m146995b(new C103272w(j15), n2Var);
        this.f323289k = C108500f2.m146995b(new C103272w(j16), n2Var);
        this.f323290l = C108500f2.m146995b(new C103272w(j17), n2Var);
        this.f323291m = C108500f2.m146995b(Boolean.valueOf(z), n2Var);
    }

    /* renamed from: a */
    public static C107951g m146243a(C107951g gVar, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j15, long j16, long j17, boolean z, int i, Object obj) {
        C107951g gVar2 = gVar;
        int i2 = i;
        long f = (i2 & 1) != 0 ? gVar.mo158359f() : j;
        long j18 = (i2 & 2) != 0 ? ((C103272w) ((C108494d2) gVar2.f323280b).getValue()).f304517a : j2;
        long j19 = (i2 & 4) != 0 ? ((C103272w) ((C108494d2) gVar2.f323281c).getValue()).f304517a : j3;
        long j25 = (i2 & 8) != 0 ? ((C103272w) ((C108494d2) gVar2.f323282d).getValue()).f304517a : j4;
        long b = (i2 & 16) != 0 ? gVar.mo158355b() : j5;
        long g = (i2 & 32) != 0 ? gVar.mo158360g() : j6;
        long j26 = (i2 & 64) != 0 ? ((C103272w) ((C108494d2) gVar2.f323285g).getValue()).f304517a : j7;
        long c = (i2 & 128) != 0 ? gVar.mo158356c() : j8;
        long d = (i2 & 256) != 0 ? gVar.mo158357d() : j9;
        long j27 = (i2 & 512) != 0 ? ((C103272w) ((C108494d2) gVar2.f323288j).getValue()).f304517a : j15;
        long e = (i2 & 1024) != 0 ? gVar.mo158358e() : j16;
        long j28 = (i2 & 2048) != 0 ? ((C103272w) ((C108494d2) gVar2.f323290l).getValue()).f304517a : j17;
        boolean h = (i2 & 4096) != 0 ? gVar.mo158361h() : z;
        gVar.getClass();
        return new C107951g(f, j18, j19, j25, b, g, j26, c, d, j27, e, j28, h, (C8480h) null);
    }

    /* renamed from: b */
    public final long mo158355b() {
        return ((C103272w) this.f323283e.getValue()).f304517a;
    }

    /* renamed from: c */
    public final long mo158356c() {
        return ((C103272w) this.f323286h.getValue()).f304517a;
    }

    /* renamed from: d */
    public final long mo158357d() {
        return ((C103272w) this.f323287i.getValue()).f304517a;
    }

    /* renamed from: e */
    public final long mo158358e() {
        return ((C103272w) this.f323289k.getValue()).f304517a;
    }

    /* renamed from: f */
    public final long mo158359f() {
        return ((C103272w) this.f323279a.getValue()).f304517a;
    }

    /* renamed from: g */
    public final long mo158360g() {
        return ((C103272w) this.f323284f.getValue()).f304517a;
    }

    /* renamed from: h */
    public final boolean mo158361h() {
        return ((Boolean) this.f323291m.getValue()).booleanValue();
    }

    public String toString() {
        return "Colors(primary=" + C103272w.m136787i(mo158359f()) + ", primaryVariant=" + C103272w.m136787i(((C103272w) ((C108494d2) this.f323280b).getValue()).f304517a) + ", secondary=" + C103272w.m136787i(((C103272w) ((C108494d2) this.f323281c).getValue()).f304517a) + ", secondaryVariant=" + C103272w.m136787i(((C103272w) ((C108494d2) this.f323282d).getValue()).f304517a) + ", background=" + C103272w.m136787i(mo158355b()) + ", surface=" + C103272w.m136787i(mo158360g()) + ", error=" + C103272w.m136787i(((C103272w) ((C108494d2) this.f323285g).getValue()).f304517a) + ", onPrimary=" + C103272w.m136787i(mo158356c()) + ", onSecondary=" + C103272w.m136787i(mo158357d()) + ", onBackground=" + C103272w.m136787i(((C103272w) ((C108494d2) this.f323288j).getValue()).f304517a) + ", onSurface=" + C103272w.m136787i(mo158358e()) + ", onError=" + C103272w.m136787i(((C103272w) ((C108494d2) this.f323290l).getValue()).f304517a) + ", isLight=" + mo158361h() + ')';
    }
}
