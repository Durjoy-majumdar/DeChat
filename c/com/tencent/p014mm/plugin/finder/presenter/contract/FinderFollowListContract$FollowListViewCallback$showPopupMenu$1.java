package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderFollowListContract;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0006\u001a\n \u0001*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, mo182094d2 = {"Landroid/view/ContextMenu;", "kotlin.jvm.PlatformType", "menu", "Landroid/view/View;", "v", "Landroid/view/ContextMenu$ContextMenuInfo;", "menuInfo", "Lrx3/b0;", "onCreateContextMenu", "(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$showPopupMenu$1 */
final class FinderFollowListContract$FollowListViewCallback$showPopupMenu$1 implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ FinderFollowListContract.FollowListViewCallback f15962d;

    public FinderFollowListContract$FollowListViewCallback$showPopupMenu$1(FinderFollowListContract.FollowListViewCallback followListViewCallback) {
        this.f15962d = followListViewCallback;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        FinderFollowListContract.FollowListViewCallback followListViewCallback = this.f15962d;
        contextMenu.add(0, followListViewCallback.f15940i, 0, followListViewCallback.f15935d.getString(C0966R.string.esw));
    }
}
