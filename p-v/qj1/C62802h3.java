package qj1;

import cj1.C54795n5;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import fy3.C32224a;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: qj1.h3 */
public final class C62802h3 implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C62696d3 f178271d;

    /* renamed from: qj1.h3$a */
    public static final class C62803a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62696d3 f178272d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62803a(C62696d3 d3Var) {
            super(0);
            this.f178272d = d3Var;
        }

        public Object invoke() {
            C62696d3 d3Var = this.f178272d;
            int i = d3Var.f178022s - 1;
            d3Var.f178022s = i;
            d3Var.f178021r.setText(String.valueOf(i));
            if (d3Var.f178022s <= 0) {
                ((MTimerHandler) ((C36570n) d3Var.f178024u).getValue()).stopTimer();
                d3Var.mo10792g(8);
                if (d3Var.f178023t) {
                    d3Var.f178023t = false;
                } else {
                    C54795n5 D0 = d3Var.mo14476D0();
                    if (D0 != null) {
                        D0.mo75727c(2, 0, new C62790g3(d3Var));
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C62802h3(C62696d3 d3Var) {
        this.f178271d = d3Var;
    }

    public final boolean onTimerExpired() {
        C61926c.m72668M(new C62803a(this.f178271d));
        return true;
    }
}
