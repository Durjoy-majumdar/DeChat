package zk1;

import com.tencent.p014mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8477a0;
import gy3.C87413o;
import ph1.C62293i;
import rx3.C13598b0;
import uh1.C65358b;

/* renamed from: zk1.b */
public final class C66871b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveExitAnimateOpUIC f192101d;

    /* renamed from: e */
    public final /* synthetic */ C8477a0 f192102e;

    /* renamed from: f */
    public final /* synthetic */ C65358b f192103f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66871b(FinderLiveExitAnimateOpUIC finderLiveExitAnimateOpUIC, C8477a0 a0Var, C65358b bVar) {
        super(0);
        this.f192101d = finderLiveExitAnimateOpUIC;
        this.f192102e = a0Var;
        this.f192103f = bVar;
    }

    public Object invoke() {
        String str = this.f192101d.f160012d;
        Log.m105924i(str, "attachToWindow safe remove isHandler: " + this.f192102e.f27482d);
        C8477a0 a0Var = this.f192102e;
        if (!a0Var.f27482d) {
            a0Var.f27482d = true;
            FinderLiveExitAnimateOpUIC finderLiveExitAnimateOpUIC = this.f192101d;
            C65358b bVar = this.f192103f;
            finderLiveExitAnimateOpUIC.getClass();
            bVar.mo84316a();
            C62293i.f177081a.mo87358c();
        }
        return C13598b0.f38549a;
    }
}
