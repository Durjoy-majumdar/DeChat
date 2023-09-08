package vf1;

import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderGallerySearchUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import hp1.C46091u0;
import java.util.List;
import pe3.C89349b;
import rx3.C13598b0;

/* renamed from: vf1.e0 */
public final class C65695e0 extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderGallerySearchUI f189040d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65695e0(FinderGallerySearchUI finderGallerySearchUI) {
        super(1);
        this.f189040d = finderGallerySearchUI;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, "suggestion");
        String str2 = this.f189040d.f158882o;
        Log.m105924i(str2, "onSuggestion Click :" + str);
        FTSSearchView fTSSearchView = this.f189040d.f158884q;
        if (fTSSearchView != null) {
            fTSSearchView.getFtsEditText().mo70356l(str, (List<FTSSearchView.C6996f>) null);
            C46091u0 u0Var = this.f189040d.f158876D;
            if (u0Var != null) {
                u0Var.mo71529c(str);
                FinderGallerySearchUI finderGallerySearchUI = this.f189040d;
                finderGallerySearchUI.f158891x = 4;
                FinderGallerySearchUI.m63545O7(finderGallerySearchUI, str, (C89349b) null, 2, (Object) null);
                return C13598b0.f38549a;
            }
            C87412m.m108603p("historyLogic");
            throw null;
        }
        C87412m.m108603p("searchView");
        throw null;
    }
}
