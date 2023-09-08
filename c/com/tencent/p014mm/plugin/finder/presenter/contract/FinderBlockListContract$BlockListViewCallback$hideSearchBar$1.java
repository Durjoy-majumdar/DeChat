package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.graphics.Rect;
import androidx.recyclerview.widget.LinearLayoutManager;
import cm1.C0738i;
import cm1.C0767q;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderBlockListContract;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C87412m;
import j20.C117292a;
import jq3.C60898l;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$hideSearchBar$1 */
final class FinderBlockListContract$BlockListViewCallback$hideSearchBar$1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderBlockListContract.BlockListViewCallback f15911d;

    /* renamed from: e */
    public final /* synthetic */ boolean f15912e;

    /* renamed from: f */
    public final /* synthetic */ LinearLayoutManager f15913f;

    /* renamed from: g */
    public final /* synthetic */ long f15914g;

    public FinderBlockListContract$BlockListViewCallback$hideSearchBar$1(FinderBlockListContract.BlockListViewCallback blockListViewCallback, boolean z, LinearLayoutManager linearLayoutManager, long j) {
        this.f15911d = blockListViewCallback;
        this.f15912e = z;
        this.f15913f = linearLayoutManager;
        this.f15914g = j;
    }

    public final void run() {
        FinderBlockListContract.BlockListViewCallback blockListViewCallback = this.f15911d;
        WxRecyclerAdapter<C0767q> wxRecyclerAdapter = blockListViewCallback.f15905j;
        if (wxRecyclerAdapter != null) {
            C0738i iVar = blockListViewCallback.f15904i;
            C87412m.m108591d(iVar);
            C60905o oVar = (C60905o) C60898l.m71330b6(wxRecyclerAdapter, (long) iVar.hashCode(), false, 2, (Object) null);
            if (oVar != null) {
                boolean z = this.f15912e;
                LinearLayoutManager linearLayoutManager = this.f15913f;
                long j = this.f15914g;
                Rect rect = new Rect();
                if (oVar.f44854d.getGlobalVisibleRect(rect) && rect.height() > 0) {
                    if (z) {
                        oVar.mo85811C().smoothScrollBy(0, rect.height());
                    } else if (linearLayoutManager != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        aVar.mo10233c(1);
                        C117292a.m165358d(linearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback$hideSearchBar$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                        linearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                        C117292a.m165359e(linearLayoutManager, "com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback$hideSearchBar$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    }
                    String str = FinderBlockListContract.f15893a;
                    Log.m105924i(str, "[hideSearchBar] to hide search bar. delay=" + j + " isSmooth=" + z + " height=" + rect.height());
                }
            }
        }
    }
}
