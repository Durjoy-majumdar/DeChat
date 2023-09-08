package com.tencent.p014mm.plugin.finder.p056ui;

import androidx.recyclerview.widget.RecyclerView;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.finder.ui.n4 */
public final class C3868n4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView f17416d;

    /* renamed from: e */
    public final /* synthetic */ int f17417e;

    public C3868n4(RecyclerView recyclerView, int i) {
        this.f17416d = recyclerView;
        this.f17417e = i;
    }

    public final void run() {
        RecyclerView recyclerView = this.f17416d;
        int i = this.f17417e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/ShareRelPresenter$smoothScrollToNextPosition$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/finder/ui/ShareRelPresenter$smoothScrollToNextPosition$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
