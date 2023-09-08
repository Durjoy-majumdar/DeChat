package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.view.d */
public final class C41571d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C41569c f111900d;

    public C41571d(C41569c cVar) {
        this.f111900d = cVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/AnnounceWebViewDialogHelper$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        View.OnClickListener onClickListener = this.f111900d.f111897j;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        this.f111900d.mo64656a();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/AnnounceWebViewDialogHelper$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
