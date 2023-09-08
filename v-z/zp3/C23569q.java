package zp3;

import android.view.View;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import zp3.C23555k;

/* renamed from: zp3.q */
public final class C23569q extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C23555k.C23562d f67560d;

    /* renamed from: e */
    public final /* synthetic */ View f67561e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23569q(C23555k.C23562d dVar, View view) {
        super(0);
        this.f67560d = dVar;
        this.f67561e = view;
    }

    public Object invoke() {
        C13598b0 b0Var = null;
        if (this.f67560d != null) {
            C23570r c = C23564m.m28133c(this.f67561e);
            if (c != null) {
                c.f67566e = this.f67560d;
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                View view = this.f67561e;
                C23555k.C23562d dVar = this.f67560d;
                C23570r rVar = new C23570r(view);
                rVar.f67563b = true;
                rVar.f67566e = dVar;
                C23564m.m28131a(view.hashCode(), rVar);
            }
        } else {
            C23570r c2 = C23564m.m28133c(this.f67561e);
            if (c2 != null) {
                View view2 = this.f67561e;
                c2.f67566e = null;
                if (c2.f67567f == null) {
                    c2.f67562a.removeOnAttachStateChangeListener(c2.f67565d);
                    C23564m.m28134d(view2.hashCode());
                }
            }
        }
        return C13598b0.f38549a;
    }
}
