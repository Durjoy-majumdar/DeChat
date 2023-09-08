package hp1;

import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.finder.search.FinderFeedSearchUI;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import pe3.C89349b;
import rx3.C13598b0;

/* renamed from: hp1.s */
public final class C8689s extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedSearchUI f27897d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8689s(FinderFeedSearchUI finderFeedSearchUI) {
        super(1);
        this.f27897d = finderFeedSearchUI;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, LocaleUtil.ITALIAN);
        FinderFeedSearchUI finderFeedSearchUI = this.f27897d;
        C60055x0 x0Var = finderFeedSearchUI.f16477Q;
        if (x0Var != null) {
            x0Var.f171399r = str;
            FTSSearchView fTSSearchView = finderFeedSearchUI.f16503o;
            if (fTSSearchView != null) {
                fTSSearchView.getFtsEditText().mo70358n(str, (List<FTSSearchView.C6996f>) null, true);
                FinderFeedSearchUI finderFeedSearchUI2 = this.f27897d;
                finderFeedSearchUI2.f16464C = 2;
                finderFeedSearchUI2.f16481S = null;
                finderFeedSearchUI2.f16466E = 0;
                finderFeedSearchUI2.mo3891a8();
                FinderFeedSearchUI.m3651d8(this.f27897d, str, (C89349b) null, false, false, 14, (Object) null);
                return C13598b0.f38549a;
            }
            C87412m.m108603p("searchView");
            throw null;
        }
        C87412m.m108603p("searchSuggestionManager");
        throw null;
    }
}
