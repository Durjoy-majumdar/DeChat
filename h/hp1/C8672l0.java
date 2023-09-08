package hp1;

import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.finder.search.FinderMixSearchPresenter;
import com.tencent.p014mm.plugin.finder.search.FinderMixSearchUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import pe3.C89349b;
import rx3.C13598b0;

/* renamed from: hp1.l0 */
public final class C8672l0 extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderMixSearchUI f27864d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8672l0(FinderMixSearchUI finderMixSearchUI) {
        super(1);
        this.f27864d = finderMixSearchUI;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, "suggestion");
        Log.m105924i("Finder.FinderMixSearchUI", "onSuggestion Click :" + str);
        FTSSearchView fTSSearchView = this.f27864d.f16599o;
        if (fTSSearchView != null) {
            fTSSearchView.getFtsEditText().mo70356l(str, (List<FTSSearchView.C6996f>) null);
            C46091u0 u0Var = this.f27864d.f16601q;
            if (u0Var != null) {
                u0Var.mo71529c(str);
                FinderMixSearchPresenter N7 = this.f27864d.presenter;
                if (N7 != null) {
                    N7.mo3919x(str, 4, false, (C89349b) null, this.f27864d.f16604t);
                    return C13598b0.f38549a;
                }
                C87412m.m108603p("presenter");
                throw null;
            }
            C87412m.m108603p("historyLogic");
            throw null;
        }
        C87412m.m108603p("searchView");
        throw null;
    }
}
