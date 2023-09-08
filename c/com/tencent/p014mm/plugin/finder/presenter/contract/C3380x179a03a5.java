package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.view.MenuItem;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderBlockListContract;
import jq3.C60905o;
import kotlin.Metadata;
import nj3.C11184p0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback$initView$4$onItemLongClick$2", "Lnj3/p0;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$initView$4$onItemLongClick$2 */
public final class C3380x179a03a5 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ int f15919d;

    /* renamed from: e */
    public final /* synthetic */ FinderBlockListContract.BlockListViewCallback f15920e;

    /* renamed from: f */
    public final /* synthetic */ RecyclerView.C16613e<C60905o> f15921f;

    public C3380x179a03a5(int i, FinderBlockListContract.BlockListViewCallback blockListViewCallback, RecyclerView.C16613e<C60905o> eVar) {
        this.f15919d = i;
        this.f15920e = blockListViewCallback;
        this.f15921f = eVar;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int i2 = this.f15919d;
        if (i2 >= 0 && i2 < this.f15920e.f15899d.f15897f.size()) {
            FinderBlockListContract.BlockListPresenter blockListPresenter = this.f15920e.f15899d;
            blockListPresenter.f15895d.mo13651m(blockListPresenter.f15897f.get(this.f15919d).f1809d, new C3381x10836d18(this.f15919d, this.f15920e, this.f15921f));
        }
    }
}
