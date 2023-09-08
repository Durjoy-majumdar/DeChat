package il1;

import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87413o;
import i70.C87667c;
import p671qy.C63344h;
import qj1.C62660c;
import qj1.C62861l1;
import rx3.C13598b0;

/* renamed from: il1.y */
public final class C60552y extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveAnchorGameTogetherWidget f172596d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60552y(FinderLiveAnchorGameTogetherWidget finderLiveAnchorGameTogetherWidget) {
        super(1);
        this.f172596d = finderLiveAnchorGameTogetherWidget;
    }

    public Object invoke(Object obj) {
        String str;
        if (!((Boolean) obj).booleanValue()) {
            this.f172596d.f160038c.mo10792g(8);
            C62660c cVar = this.f172596d.f160038c;
            C62861l1 l1Var = cVar instanceof C62861l1 ? (C62861l1) cVar : null;
            if (l1Var != null) {
                Class cls = C63344h.class;
                Log.m105924i(l1Var.f178390q, "releaseDynamicCardEnv");
                C87667c<?, ?>.a aVar = l1Var.f178392s;
                if (!(aVar == null || (str = aVar.f253930e) == null)) {
                    ((C63344h) C86312j.m106911c(cls)).mo88242Eu(str);
                }
                l1Var.f178392s = null;
                ((C63344h) C86312j.m106911c(cls)).mo88244Pc((C63344h.C63346b) null);
                ((C63344h) C86312j.m106911c(cls)).mo88248t();
            }
        }
        return C13598b0.f38549a;
    }
}
