package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.p */
public final class C30618p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ HalfScreenWebView f82439d;

    public C30618p(HalfScreenWebView halfScreenWebView) {
        this.f82439d = halfScreenWebView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/widget/HalfScreenWebView$initActionBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f82439d.f119789J.mo68951k();
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/widget/HalfScreenWebView$initActionBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
