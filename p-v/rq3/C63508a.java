package rq3;

import gy3.C87412m;

/* renamed from: rq3.a */
public final class C63508a {

    /* renamed from: c */
    public static final C63508a f180124c;

    /* renamed from: d */
    public static final C63508a f180125d;

    /* renamed from: e */
    public static final C63508a f180126e;

    /* renamed from: f */
    public static final C63508a f180127f;

    /* renamed from: g */
    public static final C63508a f180128g;

    /* renamed from: h */
    public static final C63508a f180129h;

    /* renamed from: i */
    public static final C63508a[] f180130i;

    /* renamed from: a */
    public final int f180131a;

    /* renamed from: b */
    public final boolean f180132b;

    static {
        C63508a aVar = new C63508a(0, false);
        f180124c = aVar;
        C63508a aVar2 = new C63508a(1, true);
        C63508a aVar3 = new C63508a(2, false);
        f180125d = aVar3;
        C63508a aVar4 = new C63508a(3, true);
        C63508a aVar5 = new C63508a(4, false);
        f180126e = aVar5;
        C63508a aVar6 = new C63508a(5, true);
        C63508a aVar7 = new C63508a(6, false);
        f180127f = aVar7;
        C63508a aVar8 = new C63508a(7, true);
        C63508a aVar9 = new C63508a(8, false);
        f180128g = aVar9;
        C63508a aVar10 = new C63508a(9, true);
        f180129h = aVar10;
        f180130i = new C63508a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, new C63508a(10, false), new C63508a(10, true)};
    }

    public C63508a(int i, boolean z) {
        this.f180131a = i;
        this.f180132b = z;
    }

    /* renamed from: a */
    public final boolean mo88357a(C63508a aVar) {
        C87412m.m108594g(aVar, "status");
        int i = this.f180131a;
        int i2 = aVar.f180131a;
        return i < i2 || ((!this.f180132b || f180129h == this) && i == i2);
    }
}
