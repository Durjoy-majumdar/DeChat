package iw2;

import fy3.C32224a;
import gw2.C98266k;
import gy3.C87413o;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: iw2.z */
public final class C98884z extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C98880x f289872d;

    /* renamed from: e */
    public final /* synthetic */ long f289873e;

    /* renamed from: f */
    public final /* synthetic */ boolean f289874f;

    /* renamed from: g */
    public final /* synthetic */ boolean f289875g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98884z(C98880x xVar, long j, boolean z, boolean z2) {
        super(0);
        this.f289872d = xVar;
        this.f289873e = j;
        this.f289874f = z;
        this.f289875g = z2;
    }

    public Object invoke() {
        C98880x xVar = this.f289872d;
        C98266k kVar = (C98266k) C110818d0.m150917O(xVar.f289859i, xVar.f289863p);
        boolean z = false;
        if (kVar != null && kVar.f288081d == this.f289873e) {
            z = true;
        }
        if (z) {
            this.f289872d.f289856f.mo134394b(this.f289874f, this.f289875g);
        }
        return C13598b0.f38549a;
    }
}
