package com.tencent.p014mm.plugin.finder.webview;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.webview.a */
public final class C105340a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BaseBoxDialogView f313111d;

    public C105340a(BaseBoxDialogView baseBoxDialogView) {
        this.f313111d = baseBoxDialogView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/webview/BaseBoxDialogView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f313111d.mo149897c(4);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/webview/BaseBoxDialogView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
