package com.tencent.p014mm.plugin.finder.presenter.contract;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContractNew;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fo1.C8178c;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$finishRefresh$1 */
final class FinderNotifyContractNew$NotifyViewCallback$finishRefresh$1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f160562d;

    /* renamed from: e */
    public final /* synthetic */ FinderNotifyContractNew.NotifyViewCallback f160563e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderNotifyContractNew$NotifyViewCallback$finishRefresh$1(boolean z, FinderNotifyContractNew.NotifyViewCallback notifyViewCallback) {
        super(0);
        this.f160562d = z;
        this.f160563e = notifyViewCallback;
    }

    public Object invoke() {
        Integer num = null;
        if (this.f160562d) {
            FinderNotifyContractNew.NotifyViewCallback notifyViewCallback = this.f160563e;
            notifyViewCallback.getClass();
            String string = C8178c.C8179a.m8259a(notifyViewCallback).getString(C0966R.string.ed5);
            FinderNotifyContractNew.NotifyViewCallback notifyViewCallback2 = this.f160563e;
            notifyViewCallback2.getClass();
            notifyViewCallback.mo78504D(string, C8178c.C8179a.m8259a(notifyViewCallback2).getColor(C0966R.color.BW_0_Alpha_0_3), false);
        } else {
            FinderNotifyContractNew.NotifyViewCallback notifyViewCallback3 = this.f160563e;
            String str = FinderNotifyContractNew.NotifyViewCallback.f160541s;
            notifyViewCallback3.mo78504D((String) null, 0, false);
        }
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f160563e.f160545g;
        if (refreshLoadMoreLayout != null) {
            refreshLoadMoreLayout.mo82442H(0);
        }
        String str2 = FinderNotifyContractNew.NotifyViewCallback.f160541s;
        StringBuilder sb = new StringBuilder();
        sb.append("finishRefresh: onFinishRefresh notifyDataSetChanged:");
        sb.append(this.f160563e.f160544f);
        sb.append(" size:");
        RecyclerView recyclerView = this.f160563e.f160551p;
        if (recyclerView != null) {
            RecyclerView.C16613e adapter = recyclerView.getAdapter();
            if (adapter != null) {
                num = Integer.valueOf(adapter.getItemCount());
            }
            sb.append(num);
            Log.m105924i(str2, sb.toString());
            return C13598b0.f38549a;
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }
}
