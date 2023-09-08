package com.tencent.p014mm.plugin.finder.live.view;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.live.view.o */
public final class C41473o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C56081l f111689d;

    public C41473o(C56081l lVar) {
        this.f111689d = lVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkNewVisitorView$initSearchLogic$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f111689d.mo78171s();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkNewVisitorView$initSearchLogic$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
