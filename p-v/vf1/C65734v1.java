package vf1;

import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveBizSearchUI;
import gy3.C87412m;
import qq3.C63318b;
import z04.C112550d0;

/* renamed from: vf1.v1 */
public final class C65734v1 implements C63318b {

    /* renamed from: a */
    public final /* synthetic */ FinderLiveBizSearchUI f189099a;

    public C65734v1(FinderLiveBizSearchUI finderLiveBizSearchUI) {
        this.f189099a = finderLiveBizSearchUI;
    }

    /* renamed from: a */
    public void mo3374a(boolean z) {
    }

    public void onLoadMore() {
        FinderLiveBizSearchUI finderLiveBizSearchUI = this.f189099a;
        FTSSearchView fTSSearchView = finderLiveBizSearchUI.f158972q;
        if (fTSSearchView != null) {
            finderLiveBizSearchUI.mo77424N7(C112550d0.m153799i0(fTSSearchView.getFtsEditText().getEditText().getText().toString()).toString(), new C65738x1(finderLiveBizSearchUI));
        } else {
            C87412m.m108603p("searchView");
            throw null;
        }
    }
}
