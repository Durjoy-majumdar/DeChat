package hp1;

import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.finder.search.FinderContactSearchUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import rx3.C13598b0;

/* renamed from: hp1.h */
public final class C8666h extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderContactSearchUI f27854d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8666h(FinderContactSearchUI finderContactSearchUI) {
        super(1);
        this.f27854d = finderContactSearchUI;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, "suggestion");
        String str2 = this.f27854d.f16440o;
        Log.m105924i(str2, "onSuggestion Click :" + str);
        FTSSearchView fTSSearchView = this.f27854d.f16441p;
        if (fTSSearchView != null) {
            fTSSearchView.getFtsEditText().mo70356l(str, (List<FTSSearchView.C6996f>) null);
            C46091u0 u0Var = this.f27854d.f16434H;
            if (u0Var != null) {
                u0Var.mo71529c(str);
            }
            FinderContactSearchUI finderContactSearchUI = this.f27854d;
            finderContactSearchUI.f16433G = 4;
            finderContactSearchUI.mo3874O7(str);
            return C13598b0.f38549a;
        }
        C87412m.m108603p("searchView");
        throw null;
    }
}
