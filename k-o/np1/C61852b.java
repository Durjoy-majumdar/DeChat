package np1;

import ak1.C54067f0;
import ak1.C54116w;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout;
import di0.C86299o;
import di3.C7335d;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ok1.C62042e;
import org.json.JSONObject;
import qj1.C62660c;
import rx3.C13598b0;
import te3.C49712hj1;
import tf0.C64916p1;

/* renamed from: np1.b */
public final class C61852b extends C87413o implements C32227p<Boolean, C86299o, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C61817a f175873d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61852b(C61817a aVar) {
        super(2);
        this.f175873d = aVar;
    }

    public Object invoke(Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        C86299o oVar = (C86299o) obj2;
        if (oVar != null) {
            C61817a aVar = this.f175873d;
            C61881v.f175961a.mo86813e(oVar);
            C61817a.m72534c(aVar, oVar);
            C64916p1 p1Var = (C64916p1) C86312j.m106911c(C64916p1.class);
            C62660c cVar = aVar.f175776i;
            C49712hj1 hj12 = null;
            C56032b z0 = cVar != null ? cVar.mo14484z0() : null;
            FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = z0 instanceof FinderLiveVisitorPluginLayout ? (FinderLiveVisitorPluginLayout) z0 : null;
            if (finderLiveVisitorPluginLayout != null) {
                hj12 = finderLiveVisitorPluginLayout.getReportObj();
            }
            p1Var.mo76728y(hj12, 18054, C62042e.m72804V(C62042e.f176370a, aVar.f175774g, 26, (String) null, 0, 12, (Object) null));
            if (aVar.f175773f.getLiveRole() == 0) {
                C7335d c = C86312j.m106911c(C54116w.class);
                C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w.Rx0((C54116w) c, C54067f0.C54081r0.CommerceActionGoodsOrderButtonClick, oVar.f250940l, (String) null, (String) null, (String) null, (String) null, 0, 0, (JSONObject) null, 504, (Object) null);
            }
        }
        return C13598b0.f38549a;
    }
}
