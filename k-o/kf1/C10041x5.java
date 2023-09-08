package kf1;

import com.tencent.p014mm.plugin.finder.feed.C2829n;
import com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: kf1.x5 */
public final class C10041x5 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C2829n f30780d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10041x5(C2829n nVar) {
        super(0);
        this.f30780d = nVar;
    }

    public Object invoke() {
        FinderFeedShareRelativeListLoader e = this.f30780d.mo2930e();
        C2829n nVar = this.f30780d;
        e.f13561d = nVar.f14124t;
        nVar.mo2930e().mo2706d(this.f30780d.f14126v);
        this.f30780d.mo2930e().requestRefresh();
        this.f30780d.mo2932g().mo10409c(true);
        return C13598b0.f38549a;
    }
}
