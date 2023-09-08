package com.tencent.p014mm.plugin.finder.presenter.contract;

import androidx.recyclerview.widget.RecyclerView;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelineViewCallback$smoothScrollToNextPosition$1 */
final class C3411x4f12938 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView f16045d;

    /* renamed from: e */
    public final /* synthetic */ int f16046e;

    public C3411x4f12938(RecyclerView recyclerView, int i) {
        this.f16045d = recyclerView;
        this.f16046e = i;
    }

    public final void run() {
        RecyclerView recyclerView = this.f16045d;
        int i = this.f16046e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelineViewCallback$smoothScrollToNextPosition$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelineViewCallback$smoothScrollToNextPosition$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
