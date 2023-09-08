package com.tencent.p014mm.view.manager;

import androidx.recyclerview.widget.RecyclerView;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.view.manager.SmileyPanelManager$$a */
public final /* synthetic */ class SmileyPanelManager$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SmileyPanelManager f220877d;

    /* renamed from: e */
    public final /* synthetic */ int f220878e;

    public /* synthetic */ SmileyPanelManager$$a(SmileyPanelManager smileyPanelManager, int i) {
        this.f220877d = smileyPanelManager;
        this.f220878e = i;
    }

    public final void run() {
        SmileyPanelManager smileyPanelManager = this.f220877d;
        int i = this.f220878e;
        RecyclerView recyclerView = smileyPanelManager.f285722m;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        RecyclerView recyclerView2 = recyclerView;
        C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/view/manager/SmileyPanelManager", "lambda$checkTabSelected$1", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(recyclerView2, "com/tencent/mm/view/manager/SmileyPanelManager", "lambda$checkTabSelected$1", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
