package hp1;

import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.finder.search.FinderContactSearchUI;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import rx3.C13598b0;

/* renamed from: hp1.f */
public final class C8660f extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderContactSearchUI f27825d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8660f(FinderContactSearchUI finderContactSearchUI) {
        super(1);
        this.f27825d = finderContactSearchUI;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        FinderContactSearchUI finderContactSearchUI = this.f27825d;
        C60055x0 x0Var = finderContactSearchUI.f16435I;
        if (x0Var != null) {
            x0Var.f171399r = str;
            FTSSearchView fTSSearchView = finderContactSearchUI.f16441p;
            if (fTSSearchView != null) {
                fTSSearchView.getFtsEditText().mo70356l(str, (List<FTSSearchView.C6996f>) null);
                FinderContactSearchUI finderContactSearchUI2 = this.f27825d;
                finderContactSearchUI2.f16433G = 2;
                finderContactSearchUI2.mo3874O7(str);
                return C13598b0.f38549a;
            }
            C87412m.m108603p("searchView");
            throw null;
        }
        C87412m.m108603p("searchSuggestionManager");
        throw null;
    }
}
