package zk1;

import com.tencent.p014mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C8477a0;
import gy3.C87413o;
import ph1.C62293i;
import rx3.C13598b0;
import uh1.C65358b;
import x50.C15625a;

/* renamed from: zk1.a */
public final class C66870a extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveExitAnimateOpUIC f192097d;

    /* renamed from: e */
    public final /* synthetic */ C8477a0 f192098e;

    /* renamed from: f */
    public final /* synthetic */ C65358b f192099f;

    /* renamed from: g */
    public final /* synthetic */ C15625a f192100g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66870a(FinderLiveExitAnimateOpUIC finderLiveExitAnimateOpUIC, C8477a0 a0Var, C65358b bVar, C15625a aVar) {
        super(1);
        this.f192097d = finderLiveExitAnimateOpUIC;
        this.f192098e = a0Var;
        this.f192099f = bVar;
        this.f192100g = aVar;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        String str = this.f192097d.f160012d;
        Log.m105924i(str, "setNotifyVisibilityFunction: " + intValue + " isHandler: " + this.f192098e.f27482d);
        if (intValue == 0) {
            C8477a0 a0Var = this.f192098e;
            if (!a0Var.f27482d) {
                a0Var.f27482d = true;
                FinderLiveExitAnimateOpUIC finderLiveExitAnimateOpUIC = this.f192097d;
                C65358b bVar = this.f192099f;
                finderLiveExitAnimateOpUIC.getClass();
                bVar.mo84316a();
                C62293i.f177081a.mo87358c();
            }
        }
        this.f192100g.f42253d = null;
        return C13598b0.f38549a;
    }
}
