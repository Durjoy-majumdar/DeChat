package il1;

import android.os.Bundle;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: il1.m8 */
public final class C60460m8 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60424h8 f172370d;

    /* renamed from: e */
    public final /* synthetic */ Bundle f172371e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60460m8(C60424h8 h8Var, Bundle bundle) {
        super(0);
        this.f172370d = h8Var;
        this.f172371e = bundle;
    }

    public Object invoke() {
        this.f172370d.f172285p.statusChange(C58124b.C58125b.POST_LIKE, this.f172371e);
        return C13598b0.f38549a;
    }
}
