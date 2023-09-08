package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderFollowListContract;
import di3.C86312j;
import er1.C58684b;
import hp1.C8703w0;
import kotlin.Metadata;
import te3.C50972qk0;

@Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo182094d2 = {"<anonymous>", "", "it", "Landroid/view/MenuItem;", "kotlin.jvm.PlatformType", "onMenuItemClick"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$initView$6 */
public final class FinderFollowListContract$FollowListViewCallback$initView$6 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderFollowListContract.FollowListViewCallback f15961d;

    public FinderFollowListContract$FollowListViewCallback$initView$6(FinderFollowListContract.FollowListViewCallback followListViewCallback) {
        this.f15961d = followListViewCallback;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C8703w0 w0Var = C8703w0.f27927a;
        C8703w0.f27929c = null;
        Intent intent = new Intent();
        intent.putExtra("request_type", 3);
        intent.putExtra("need_history", false);
        ((C58684b) C86312j.m106911c(C58684b.class)).Dx0(this.f15961d.f15935d, (C50972qk0) null, intent);
        return true;
    }
}
