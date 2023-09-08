package com.tencent.p014mm.plugin.finder.presenter.contract;

import androidx.recyclerview.widget.RecyclerView;
import cm1.C55011a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContract;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fo1.C8178c;
import fy3.C32224a;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import kotlin.Metadata;
import o40.C61926c;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$finishLoadMore$1 */
final class FinderNotifyContract$NotifyViewCallback$finishLoadMore$1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderNotifyContract.NotifyViewCallback f160486d;

    /* renamed from: e */
    public final /* synthetic */ boolean f160487e;

    /* renamed from: f */
    public final /* synthetic */ C8478d0 f160488f;

    /* renamed from: g */
    public final /* synthetic */ List<C55011a> f160489g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderNotifyContract$NotifyViewCallback$finishLoadMore$1(FinderNotifyContract.NotifyViewCallback notifyViewCallback, boolean z, C8478d0 d0Var, List<? extends C55011a> list) {
        super(0);
        this.f160486d = notifyViewCallback;
        this.f160487e = z;
        this.f160488f = d0Var;
        this.f160489g = list;
    }

    public Object invoke() {
        FinderNotifyContract.NotifyViewCallback notifyViewCallback = this.f160486d;
        if (notifyViewCallback.f160455g.mo78485n(notifyViewCallback.f160452d).isEmpty()) {
            FinderNotifyContract.NotifyViewCallback notifyViewCallback2 = this.f160486d;
            notifyViewCallback2.getClass();
            String string = C8178c.C8179a.m8259a(notifyViewCallback2).getString(C0966R.string.ed5);
            FinderNotifyContract.NotifyViewCallback notifyViewCallback3 = this.f160486d;
            notifyViewCallback3.getClass();
            C61926c.m72668M(new FinderNotifyContract$NotifyViewCallback$showRefreshTip$1(string, notifyViewCallback2, false, C8178c.C8179a.m8259a(notifyViewCallback3).getColor(C0966R.color.BW_0_Alpha_0_3)));
        } else {
            FinderNotifyContract.NotifyViewCallback notifyViewCallback4 = this.f160486d;
            notifyViewCallback4.getClass();
            C61926c.m72668M(new FinderNotifyContract$NotifyViewCallback$showRefreshTip$1((String) null, notifyViewCallback4, false, 0));
        }
        if (this.f160487e) {
            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f160486d.f160460o;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.mo82442H(0);
            }
            String str = this.f160486d.f160453e;
            StringBuilder sb = new StringBuilder();
            sb.append("finishLoadMore: onFinishRefresh notifyDataSetChanged:");
            sb.append(this.f160486d.f160452d);
            sb.append(" size:");
            RecyclerView recyclerView = this.f160486d.f160459n;
            if (recyclerView != null) {
                RecyclerView.C16613e adapter = recyclerView.getAdapter();
                sb.append(adapter != null ? Integer.valueOf(adapter.getItemCount()) : null);
                Log.m105924i(str, sb.toString());
                RecyclerView recyclerView2 = this.f160486d.f160459n;
                if (recyclerView2 != null) {
                    RecyclerView.C16613e adapter2 = recyclerView2.getAdapter();
                    if (adapter2 != null) {
                        adapter2.notifyDataSetChanged();
                    }
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            } else {
                C87412m.m108603p("recyclerView");
                throw null;
            }
        } else {
            RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(1);
            List<C55011a> list = this.f160489g;
            cVar.f24952g = false;
            cVar.f24951f = !list.isEmpty();
            cVar.f24953h = list.size();
            RecyclerView recyclerView3 = this.f160486d.f160459n;
            if (recyclerView3 != null) {
                RecyclerView.C16613e adapter3 = recyclerView3.getAdapter();
                if (adapter3 != null) {
                    adapter3.notifyItemRangeInserted(this.f160488f.f27483d, this.f160489g.size());
                }
                RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f160486d.f160460o;
                if (refreshLoadMoreLayout2 != null) {
                    refreshLoadMoreLayout2.onPreFinishLoadMoreSmooth(cVar);
                }
            } else {
                C87412m.m108603p("recyclerView");
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}
