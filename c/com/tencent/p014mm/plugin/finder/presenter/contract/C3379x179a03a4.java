package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderBlockListContract;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback$initView$4$onItemLongClick$1", "Landroid/view/View$OnCreateContextMenuListener;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$initView$4$onItemLongClick$1 */
public final class C3379x179a03a4 implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ FinderBlockListContract.BlockListViewCallback f15918d;

    public C3379x179a03a4(FinderBlockListContract.BlockListViewCallback blockListViewCallback) {
        this.f15918d = blockListViewCallback;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        if (contextMenu != null) {
            this.f15918d.getClass();
            contextMenu.add(0, 0, 0, C0966R.string.ecc);
        }
    }
}
