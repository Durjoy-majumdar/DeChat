package hp1;

import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.finder.search.FinderFeedSearchUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import pe3.C89349b;
import rx3.C13598b0;

/* renamed from: hp1.u */
public final class C8699u extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedSearchUI f27923d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8699u(FinderFeedSearchUI finderFeedSearchUI) {
        super(1);
        this.f27923d = finderFeedSearchUI;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, "suggestion");
        Log.m105924i("Finder.FinderFeedSearchUI", "onSuggestion Click :" + str);
        FTSSearchView fTSSearchView = this.f27923d.f16503o;
        if (fTSSearchView != null) {
            fTSSearchView.getFtsEditText().mo70358n(str, (List<FTSSearchView.C6996f>) null, true);
            C46091u0 u0Var = this.f27923d.f16476P;
            if (u0Var != null) {
                u0Var.mo71529c(str);
                FinderFeedSearchUI finderFeedSearchUI = this.f27923d;
                finderFeedSearchUI.f16464C = 4;
                finderFeedSearchUI.f16466E = 0;
                finderFeedSearchUI.mo3891a8();
                FinderFeedSearchUI finderFeedSearchUI2 = this.f27923d;
                finderFeedSearchUI2.f16481S = null;
                FinderFeedSearchUI.m3651d8(finderFeedSearchUI2, str, (C89349b) null, false, false, 14, (Object) null);
                return C13598b0.f38549a;
            }
            C87412m.m108603p("historyLogic");
            throw null;
        }
        C87412m.m108603p("searchView");
        throw null;
    }
}
