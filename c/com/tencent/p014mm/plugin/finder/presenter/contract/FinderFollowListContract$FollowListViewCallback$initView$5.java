package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderFollowListContract;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo182094d2 = {"<anonymous>", "", "it", "Landroid/view/MenuItem;", "kotlin.jvm.PlatformType", "onMenuItemClick"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$initView$5 */
public final class FinderFollowListContract$FollowListViewCallback$initView$5 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderFollowListContract.FollowListViewCallback f15960d;

    public FinderFollowListContract$FollowListViewCallback$initView$5(FinderFollowListContract.FollowListViewCallback followListViewCallback) {
        this.f15960d = followListViewCallback;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f15960d.f15935d.finish();
        return true;
    }
}
