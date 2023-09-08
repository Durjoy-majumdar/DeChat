package il1;

import android.view.animation.AccelerateInterpolator;
import com.tencent.p014mm.p136ui.C75044y4;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: il1.x0 */
public final class C46272x0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60535v0 f124727d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f124728e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46272x0(C60535v0 v0Var, C32224a<C13598b0> aVar) {
        super(0);
        this.f124727d = v0Var;
        this.f124728e = aVar;
    }

    public Object invoke() {
        this.f124727d.f172551e.animate().translationX(((float) C75044y4.m89990b(this.f124727d.f172547a.getContext()).x) / 2.0f).setInterpolator(new AccelerateInterpolator()).setListener(new C46271w0(this.f124728e)).start();
        return C13598b0.f38549a;
    }
}
