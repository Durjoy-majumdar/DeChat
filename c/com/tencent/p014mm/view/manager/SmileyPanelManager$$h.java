package com.tencent.p014mm.view.manager;

import androidx.recyclerview.widget.RecyclerView;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.view.manager.SmileyPanelManager$$h */
public class SmileyPanelManager$$h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f220879d;

    /* renamed from: e */
    public final /* synthetic */ SmileyPanelManager f220880e;

    public SmileyPanelManager$$h(SmileyPanelManager smileyPanelManager, int i) {
        this.f220880e = smileyPanelManager;
        this.f220879d = i;
    }

    public void run() {
        RecyclerView recyclerView = this.f220880e.f285722m;
        int i = this.f220879d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/view/manager/SmileyPanelManager$4", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(recyclerView, "com/tencent/mm/view/manager/SmileyPanelManager$4", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
