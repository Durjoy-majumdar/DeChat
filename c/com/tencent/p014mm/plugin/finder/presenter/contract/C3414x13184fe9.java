package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderLivePurchaseListContract$PurchaseListViewCallback$initView$1$1", "Landroidx/recyclerview/widget/RecyclerView$l;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListViewCallback$initView$1$1 */
public final class C3414x13184fe9 extends RecyclerView.C0129l {

    /* renamed from: d */
    public final /* synthetic */ FinderLivePurchaseListContract.PurchaseListViewCallback f16078d;

    public C3414x13184fe9(FinderLivePurchaseListContract.PurchaseListViewCallback purchaseListViewCallback) {
        this.f16078d = purchaseListViewCallback;
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = this.f16078d.f16068a.getResources().getDimensionPixelOffset(C0966R.dimen.f3736cp);
    }
}
