package oa0;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p560i2.C108319b;
import p631o1.C109854n0;
import rx3.C13598b0;

/* renamed from: oa0.c */
public final class C110007c extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ double f329193d;

    /* renamed from: e */
    public final /* synthetic */ C109854n0 f329194e;

    /* renamed from: f */
    public final /* synthetic */ int f329195f;

    /* renamed from: g */
    public final /* synthetic */ int f329196g;

    /* renamed from: h */
    public final /* synthetic */ C109854n0 f329197h;

    /* renamed from: i */
    public final /* synthetic */ boolean f329198i;

    /* renamed from: j */
    public final /* synthetic */ C109854n0 f329199j;

    /* renamed from: n */
    public final /* synthetic */ C109854n0 f329200n;

    /* renamed from: o */
    public final /* synthetic */ int f329201o;

    /* renamed from: p */
    public final /* synthetic */ long f329202p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110007c(double d, C109854n0 n0Var, int i, int i2, C109854n0 n0Var2, boolean z, C109854n0 n0Var3, C109854n0 n0Var4, int i3, long j) {
        super(1);
        this.f329193d = d;
        this.f329194e = n0Var;
        this.f329195f = i;
        this.f329196g = i2;
        this.f329197h = n0Var2;
        this.f329198i = z;
        this.f329199j = n0Var3;
        this.f329200n = n0Var4;
        this.f329201o = i3;
        this.f329202p = j;
    }

    public Object invoke(Object obj) {
        C109854n0 n0Var;
        C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
        C87412m.m108594g(aVar, "$this$layout");
        if (this.f329193d < 1.0d) {
            C109854n0 n0Var2 = this.f329194e;
            if (n0Var2 != null) {
                C109854n0.C109855a.m149304c(aVar, n0Var2, 0, 0, 0.0f, 4, (Object) null);
            }
        } else {
            C109854n0 n0Var3 = this.f329194e;
            if (n0Var3 != null) {
                int i = (this.f329195f - this.f329196g) / 2;
                C109854n0 n0Var4 = this.f329197h;
                C109854n0.C109855a.m149304c(aVar, n0Var3, 0, (n0Var4 != null ? n0Var4.mo161167c0() : 0) + i, 0.0f, 4, (Object) null);
            }
        }
        if (this.f329198i && (n0Var = this.f329199j) != null) {
            C109854n0.C109855a.m149304c(aVar, n0Var, 0, C108319b.m146696g(this.f329202p) - n0Var.f328780e, 0.0f, 4, (Object) null);
        }
        C109854n0 n0Var5 = this.f329197h;
        if (n0Var5 != null) {
            C109854n0.C109855a.m149304c(aVar, n0Var5, 0, 0, 0.0f, 4, (Object) null);
        }
        C109854n0 n0Var6 = this.f329200n;
        if (n0Var6 != null) {
            C109854n0.C109855a.m149304c(aVar, n0Var6, 0, this.f329201o, 0.0f, 4, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
