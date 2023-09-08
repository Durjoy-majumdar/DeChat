package d60;

import android.os.Bundle;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: d60.c0 */
public final class C58127c0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C58130e0 f166513d;

    /* renamed from: e */
    public final /* synthetic */ Bundle f166514e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58127c0(C58130e0 e0Var, Bundle bundle) {
        super(0);
        this.f166513d = e0Var;
        this.f166514e = bundle;
    }

    public Object invoke() {
        this.f166513d.f166523f.statusChange(C58124b.C58125b.POST_LIKE, this.f166514e);
        return C13598b0.f38549a;
    }
}
