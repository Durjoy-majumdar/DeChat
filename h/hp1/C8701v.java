package hp1;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.finder.search.FinderFeedSearchUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import gy3.C87412m;
import hp1.C60055x0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: hp1.v */
public final class C8701v implements C60055x0.C60059d {

    /* renamed from: a */
    public final /* synthetic */ FinderFeedSearchUI f27925a;

    public C8701v(FinderFeedSearchUI finderFeedSearchUI) {
        this.f27925a = finderFeedSearchUI;
    }

    /* renamed from: a */
    public void mo9549a(int i) {
        if (i == 0) {
            View view = this.f27925a.f16472K;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI$initSuggestion$2", "onVisibleChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI$initSuggestion$2", "onVisibleChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                TextView textView = this.f27925a.f16471J;
                if (textView != null) {
                    textView.setVisibility(8);
                    RefreshLoadMoreLayout refreshLoadMoreLayout = this.f27925a.f16469H;
                    if (refreshLoadMoreLayout != null) {
                        refreshLoadMoreLayout.setVisibility(8);
                    } else {
                        C87412m.m108603p("rlLayout");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("noResultView");
                    throw null;
                }
            } else {
                C87412m.m108603p("loadingView");
                throw null;
            }
        } else {
            FTSSearchView fTSSearchView = this.f27925a.f16503o;
            if (fTSSearchView == null) {
                C87412m.m108603p("searchView");
                throw null;
            } else if (!Util.isNullOrNil(fTSSearchView.getFtsEditText().getEditText().getText().toString())) {
                RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f27925a.f16469H;
                if (refreshLoadMoreLayout2 != null) {
                    refreshLoadMoreLayout2.setVisibility(0);
                } else {
                    C87412m.m108603p("rlLayout");
                    throw null;
                }
            }
        }
    }
}
