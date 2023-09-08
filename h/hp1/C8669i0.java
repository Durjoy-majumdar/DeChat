package hp1;

import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.finder.search.FinderMixSearchPresenter;
import com.tencent.p014mm.plugin.finder.search.FinderMixSearchUI;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import pe3.C89349b;
import rx3.C13598b0;

/* renamed from: hp1.i0 */
public final class C8669i0 extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderMixSearchUI f27862d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8669i0(FinderMixSearchUI finderMixSearchUI) {
        super(1);
        this.f27862d = finderMixSearchUI;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        FinderMixSearchUI finderMixSearchUI = this.f27862d;
        C60055x0 x0Var = finderMixSearchUI.f16602r;
        if (x0Var != null) {
            x0Var.f171399r = str;
            FTSSearchView fTSSearchView = finderMixSearchUI.f16599o;
            if (fTSSearchView != null) {
                fTSSearchView.getFtsEditText().mo70356l(str, (List<FTSSearchView.C6996f>) null);
                FinderMixSearchPresenter N7 = this.f27862d.presenter;
                if (N7 != null) {
                    N7.mo3919x(str, 2, false, (C89349b) null, this.f27862d.f16604t);
                    return C13598b0.f38549a;
                }
                C87412m.m108603p("presenter");
                throw null;
            }
            C87412m.m108603p("searchView");
            throw null;
        }
        C87412m.m108603p("searchSuggestionManager");
        throw null;
    }
}
