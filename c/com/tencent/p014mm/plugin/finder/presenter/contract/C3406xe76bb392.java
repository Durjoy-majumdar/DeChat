package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLikedFeedContract;
import er1.C58736i1;
import gy3.C87412m;
import kotlin.Metadata;
import nj3.C11183n0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n \u0001*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, mo182094d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "menuView", "", "position", "Landroid/view/MenuItem;", "menuItem", "Lrx3/b0;", "OnMMMenuItemGetView", "(Landroid/view/View;ILandroid/view/MenuItem;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$getOnMenuItemGetViewListener$1 */
public final class C3406xe76bb392 implements C11183n0 {

    /* renamed from: a */
    public final /* synthetic */ FinderLikedFeedContract.LikedTimelinePresenter f16031a;

    /* renamed from: b */
    public final /* synthetic */ BaseFinderFeed f16032b;

    public C3406xe76bb392(FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter, BaseFinderFeed baseFinderFeed) {
        this.f16031a = likedTimelinePresenter;
        this.f16032b = baseFinderFeed;
    }

    /* renamed from: a */
    public final void mo2585a(View view, int i, MenuItem menuItem) {
        C58736i1 i1Var = C58736i1.f168173a;
        MMActivity mMActivity = this.f16031a.f15975d;
        C87412m.m108593f(view, "menuView");
        C87412m.m108593f(menuItem, "menuItem");
        i1Var.mo83667m(mMActivity, view, i, menuItem, this.f16032b);
    }
}
