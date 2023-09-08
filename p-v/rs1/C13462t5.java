package rs1;

import com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: rs1.t5 */
public final class C13462t5 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C13298k5 f38161d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13462t5(C13298k5 k5Var) {
        super(0);
        this.f38161d = k5Var;
    }

    public Object invoke() {
        FinderFeedShareRelativeListLoader g3 = this.f38161d.mo12749g3();
        C13298k5 k5Var = this.f38161d;
        g3.f13561d = k5Var.f37737d;
        k5Var.mo12749g3().mo2706d(this.f38161d.f37740g);
        this.f38161d.mo12749g3().requestRefresh();
        this.f38161d.mo12752k3(true);
        return C13598b0.f38549a;
    }
}
