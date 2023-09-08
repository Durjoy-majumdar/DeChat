package vf1;

import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveOrderSearchUI;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import rx3.C13598b0;

/* renamed from: vf1.x2 */
public final class C52880x2 extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveOrderSearchUI f147683d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52880x2(FinderLiveOrderSearchUI finderLiveOrderSearchUI) {
        super(1);
        this.f147683d = finderLiveOrderSearchUI;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        FTSSearchView fTSSearchView = this.f147683d.f111532v;
        if (fTSSearchView != null) {
            fTSSearchView.getFtsEditText().mo70356l(str, (List<FTSSearchView.C6996f>) null);
            this.f147683d.mo64511N7(str);
            return C13598b0.f38549a;
        }
        C87412m.m108603p("searchView");
        throw null;
    }
}
