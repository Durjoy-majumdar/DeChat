package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLikedFeedContract;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import ht1.C8794p5;
import kotlin.Metadata;
import nj3.C76912y0;
import te3.C50542nh0;
import te3.C51954xc1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelinePresenter$getMoreMenuItemSelectedListener$1$onMMMenuItemSelected$3", "Lht1/p5;", "Lte3/xc1;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$getMoreMenuItemSelectedListener$1$onMMMenuItemSelected$3 */
public final class C3403x28461503 implements C8794p5<C51954xc1> {

    /* renamed from: d */
    public final /* synthetic */ FinderLikedFeedContract.LikedTimelinePresenter f16024d;

    public C3403x28461503(FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter) {
        this.f16024d = likedTimelinePresenter;
    }

    /* renamed from: c5 */
    public void mo705c5(Object obj, C50542nh0 nh02) {
        C87412m.m108594g((C51954xc1) obj, "req");
        C87412m.m108594g(nh02, "ret");
        if (nh02.f138603e == 0) {
            C76912y0.makeText(MMApplicationContext.getContext(), (int) C0966R.string.d8t, 0).show();
            return;
        }
        C76912y0.makeText(MMApplicationContext.getContext(), (int) C0966R.string.d8s, 0).show();
        String str = this.f16024d.f15983o;
        Log.m105924i(str, "finder_feed_close_comment_ok " + nh02.f138603e);
    }
}
