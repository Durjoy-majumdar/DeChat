package vf1;

import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderGallerySearchUI;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import hp1.C60055x0;
import java.util.List;
import pe3.C89349b;
import rx3.C13598b0;

/* renamed from: vf1.c0 */
public final class C65692c0 extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderGallerySearchUI f189037d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65692c0(FinderGallerySearchUI finderGallerySearchUI) {
        super(1);
        this.f189037d = finderGallerySearchUI;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, LocaleUtil.ITALIAN);
        FinderGallerySearchUI finderGallerySearchUI = this.f189037d;
        C60055x0 x0Var = finderGallerySearchUI.f158877E;
        if (x0Var != null) {
            x0Var.f171399r = str;
            FTSSearchView fTSSearchView = finderGallerySearchUI.f158884q;
            if (fTSSearchView != null) {
                fTSSearchView.getFtsEditText().mo70356l(str, (List<FTSSearchView.C6996f>) null);
                FinderGallerySearchUI finderGallerySearchUI2 = this.f189037d;
                finderGallerySearchUI2.f158891x = 2;
                FinderGallerySearchUI.m63545O7(finderGallerySearchUI2, str, (C89349b) null, 2, (Object) null);
                return C13598b0.f38549a;
            }
            C87412m.m108603p("searchView");
            throw null;
        }
        C87412m.m108603p("searchSuggestionManager");
        throw null;
    }
}
