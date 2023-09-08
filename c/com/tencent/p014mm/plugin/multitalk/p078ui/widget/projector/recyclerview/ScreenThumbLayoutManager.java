package com.tencent.p014mm.plugin.multitalk.p078ui.widget.projector.recyclerview;

import a92.C53987a;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenThumbLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-multitalk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.projector.recyclerview.ScreenThumbLayoutManager */
public final class ScreenThumbLayoutManager extends LinearLayoutManager {

    /* renamed from: v */
    public int f162952v;

    /* renamed from: w */
    public int f162953w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScreenThumbLayoutManager(RecyclerView recyclerView, Context context, int i) {
        super(context, i, false);
        C87412m.m108594g(context, "context");
    }

    public void onLayoutChildren(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rVar, "recycler");
        C87412m.m108594g(wVar, "state");
        super.onLayoutChildren(rVar, wVar);
    }

    public int scrollHorizontallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rVar, "recycler");
        C87412m.m108594g(wVar, "state");
        return super.scrollHorizontallyBy(i, rVar, wVar);
    }

    public void scrollToPosition(int i) {
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf((this.f162953w - this.f162952v) / 2));
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenThumbLayoutManager", "scrollToPosition", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
        C117292a.m165359e(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenThumbLayoutManager", "scrollToPosition", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C16628w wVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(wVar, "state");
        if (i != -1) {
            Context context = recyclerView.getContext();
            C87412m.m108593f(context, "recyclerView.context");
            C53987a aVar = new C53987a(context);
            aVar.f44872a = i;
            startSmoothScroll(aVar);
        }
    }
}
