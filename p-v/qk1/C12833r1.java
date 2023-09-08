package qk1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ig1.C8916d;
import o40.C61926c;
import qk1.C12814m1;
import rx3.C13598b0;
import yh1.C16011a;

/* renamed from: qk1.r1 */
public final class C12833r1 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ C12814m1.C12815a f36727d;

    /* renamed from: e */
    public final /* synthetic */ C12814m1 f36728e;

    /* renamed from: f */
    public final /* synthetic */ C8916d f36729f;

    /* renamed from: qk1.r1$a */
    public static final class C12834a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12814m1 f36730d;

        /* renamed from: e */
        public final /* synthetic */ C12814m1.C12815a f36731e;

        /* renamed from: f */
        public final /* synthetic */ C8916d f36732f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12834a(C12814m1 m1Var, C12814m1.C12815a aVar, C8916d dVar) {
            super(0);
            this.f36730d = m1Var;
            this.f36731e = aVar;
            this.f36732f = dVar;
        }

        public Object invoke() {
            C16011a aVar = this.f36730d.f36680h;
            if (aVar != null) {
                View view = this.f36731e.f36691z;
                C87412m.m108592e(view, "null cannot be cast to non-null type android.view.ViewGroup");
                aVar.mo12005a((ViewGroup) view, this.f36732f);
            }
            return C13598b0.f38549a;
        }
    }

    public C12833r1(C12814m1.C12815a aVar, C12814m1 m1Var, C8916d dVar) {
        this.f36727d = aVar;
        this.f36728e = m1Var;
        this.f36729f = dVar;
    }

    public boolean onPreDraw() {
        this.f36727d.f36691z.getViewTreeObserver().removeOnPreDrawListener(this);
        C61926c.m72666K(300, new C12834a(this.f36728e, this.f36727d, this.f36729f));
        return true;
    }
}
