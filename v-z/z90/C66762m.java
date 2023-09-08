package z90;

import fy3.C32224a;
import gy3.C87413o;
import p175j0.C60690y0;
import rx3.C13598b0;

/* renamed from: z90.m */
public final class C66762m extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60690y0<Boolean> f191833d;

    /* renamed from: e */
    public final /* synthetic */ boolean f191834e;

    /* renamed from: f */
    public final /* synthetic */ C66759i f191835f;

    /* renamed from: g */
    public final /* synthetic */ C60690y0<C66737a> f191836g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66762m(C60690y0<Boolean> y0Var, boolean z, C66759i iVar, C60690y0<C66737a> y0Var2) {
        super(0);
        this.f191833d = y0Var;
        this.f191834e = z;
        this.f191835f = iVar;
        this.f191836g = y0Var2;
    }

    public Object invoke() {
        this.f191836g.setValue(C66737a.MusicPanel);
        this.f191833d.setValue(Boolean.valueOf(!this.f191834e));
        this.f191835f.mo90776a();
        return C13598b0.f38549a;
    }
}
