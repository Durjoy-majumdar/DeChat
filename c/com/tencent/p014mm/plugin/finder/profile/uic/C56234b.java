package com.tencent.p014mm.plugin.finder.profile.uic;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.model.FinderProfileDraftLoader;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.profile.uic.b */
public final class C56234b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileDraftUIC f160670d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56234b(FinderProfileDraftUIC finderProfileDraftUIC) {
        super(0);
        this.f160670d = finderProfileDraftUIC;
    }

    public Object invoke() {
        FinderProfileDraftUIC finderProfileDraftUIC = this.f160670d;
        finderProfileDraftUIC.getClass();
        Log.m105924i("Finder.FinderProfileDraftUIC", "onFetchEnd : " + finderProfileDraftUIC.mo78511c3().getDataListJustForAdapter().size());
        if (finderProfileDraftUIC.mo78511c3().f158682g == FinderProfileDraftLoader.C55743a.WITH_CACHED) {
            finderProfileDraftUIC.mo78513e3();
        } else {
            View loadMoreFooter = finderProfileDraftUIC.mo78512d3().getLoadMoreFooter();
            if (loadMoreFooter != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(loadMoreFooter, aVar.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                loadMoreFooter.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(loadMoreFooter, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById = loadMoreFooter.findViewById(C0966R.C0970id.g2t);
                if (findViewById != null) {
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(8);
                    View view = findViewById;
                    C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View findViewById2 = loadMoreFooter.findViewById(C0966R.C0970id.g2s);
                if (findViewById2 != null) {
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(8);
                    View view2 = findViewById2;
                    C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        return C13598b0.f38549a;
    }
}
