package zp3;

import android.view.ViewGroup;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import zp3.C23555k;

/* renamed from: zp3.p */
public final class C23568p extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C23555k.C23559e f67558d;

    /* renamed from: e */
    public final /* synthetic */ ViewGroup f67559e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23568p(C23555k.C23559e eVar, ViewGroup viewGroup) {
        super(0);
        this.f67558d = eVar;
        this.f67559e = viewGroup;
    }

    public Object invoke() {
        C13598b0 b0Var = null;
        if (this.f67558d != null) {
            C23570r b = C23564m.m28132b(this.f67559e);
            if (b != null) {
                b.f67567f = this.f67558d;
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                ViewGroup viewGroup = this.f67559e;
                C23555k.C23559e eVar = this.f67558d;
                C23570r rVar = new C23570r(viewGroup);
                rVar.f67567f = eVar;
                C23564m.m28131a(viewGroup.hashCode(), rVar);
            }
        } else {
            C23570r b2 = C23564m.m28132b(this.f67559e);
            if (b2 != null) {
                ViewGroup viewGroup2 = this.f67559e;
                b2.f67567f = null;
                if (b2.f67566e == null) {
                    b2.f67562a.removeOnAttachStateChangeListener(b2.f67565d);
                    C23564m.m28134d(viewGroup2.hashCode());
                }
            }
        }
        return C13598b0.f38549a;
    }
}
