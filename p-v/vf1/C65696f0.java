package vf1;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderGallerySearchUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import gy3.C87412m;
import hp1.C60055x0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: vf1.f0 */
public final class C65696f0 implements C60055x0.C60059d {

    /* renamed from: a */
    public final /* synthetic */ FinderGallerySearchUI f189041a;

    public C65696f0(FinderGallerySearchUI finderGallerySearchUI) {
        this.f189041a = finderGallerySearchUI;
    }

    /* renamed from: a */
    public void mo9549a(int i) {
        if (i == 0) {
            View view = this.f189041a.f158875C;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI$initSuggestion$2", "onVisibleChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI$initSuggestion$2", "onVisibleChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                TextView textView = this.f189041a.f158874B;
                if (textView != null) {
                    textView.setVisibility(8);
                    RefreshLoadMoreLayout refreshLoadMoreLayout = this.f189041a.f158893z;
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
            FTSSearchView fTSSearchView = this.f189041a.f158884q;
            if (fTSSearchView == null) {
                C87412m.m108603p("searchView");
                throw null;
            } else if (!Util.isNullOrNil(fTSSearchView.getFtsEditText().getEditText().getText().toString())) {
                RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f189041a.f158893z;
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
