package hp1;

import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.finder.search.FinderContactSearchIncludeFollowUI;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import rx3.C13598b0;

/* renamed from: hp1.c */
public final class C8654c extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderContactSearchIncludeFollowUI f27811d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8654c(FinderContactSearchIncludeFollowUI finderContactSearchIncludeFollowUI) {
        super(1);
        this.f27811d = finderContactSearchIncludeFollowUI;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, LocaleUtil.ITALIAN);
        FTSSearchView fTSSearchView = this.f27811d.f16402d;
        if (fTSSearchView != null) {
            fTSSearchView.getFtsEditText().mo70356l(str, (List<FTSSearchView.C6996f>) null);
            this.f27811d.mo3872K7(str);
            return C13598b0.f38549a;
        }
        C87412m.m108603p("searchView");
        throw null;
    }
}
