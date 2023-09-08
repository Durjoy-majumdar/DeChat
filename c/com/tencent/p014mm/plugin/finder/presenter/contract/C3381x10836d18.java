package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderBlockListContract;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import jq3.C60898l;
import jq3.C60905o;
import kotlin.Metadata;
import nj3.C76912y0;
import up1.C14364t0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback$initView$4$onItemLongClick$2$onMMMenuItemSelected$1", "Lup1/t0$b;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$initView$4$onItemLongClick$2$onMMMenuItemSelected$1 */
public final class C3381x10836d18 implements C14364t0.C14366b {

    /* renamed from: a */
    public final /* synthetic */ int f15922a;

    /* renamed from: b */
    public final /* synthetic */ FinderBlockListContract.BlockListViewCallback f15923b;

    /* renamed from: c */
    public final /* synthetic */ RecyclerView.C16613e<C60905o> f15924c;

    public C3381x10836d18(int i, FinderBlockListContract.BlockListViewCallback blockListViewCallback, RecyclerView.C16613e<C60905o> eVar) {
        this.f15922a = i;
        this.f15923b = blockListViewCallback;
        this.f15924c = eVar;
    }

    /* renamed from: a */
    public void mo3725a(boolean z) {
        int i;
        if (z) {
            if (this.f15922a < this.f15923b.f15899d.f15897f.size() && (i = this.f15922a) >= 0) {
                this.f15923b.f15899d.f15897f.remove(i);
            }
            RecyclerView.C16613e<C60905o> eVar = this.f15924c;
            eVar.notifyItemRemoved(((C60898l) eVar).mo85796c6() + this.f15922a);
        } else {
            C76912y0.makeText((Context) this.f15923b.f15900e, (CharSequence) StateEvent.ProcessResult.FAILED, 0).show();
        }
        this.f15923b.mo3716D();
    }
}
