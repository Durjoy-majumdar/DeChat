package com.tencent.p014mm.plugin.finder.live.view;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.live.view.p */
public final class C56092p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C56081l f159954d;

    public C56092p(C56081l lVar) {
        this.f159954d = lVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkNewVisitorView$initSearchLogic$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f159954d.f159925g.setText("");
        this.f159954d.f159919B.mo88151O4(new ArrayList(), "");
        this.f159954d.f159919B.notifyDataSetChanged();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkNewVisitorView$initSearchLogic$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
