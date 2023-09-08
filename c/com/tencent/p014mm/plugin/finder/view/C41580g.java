package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.view.g */
public final class C41580g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C41592j f111922d;

    public C41580g(C41592j jVar) {
        this.f111922d = jVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/AnnounceWebViewDialogWrapper$initDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f111922d.f111960h.reload();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/AnnounceWebViewDialogWrapper$initDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
