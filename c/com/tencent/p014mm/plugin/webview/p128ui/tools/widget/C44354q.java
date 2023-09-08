package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.view.View;
import e00.C45520t;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.q */
public final class C44354q implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ HalfScreenWebView f120210d;

    public C44354q(HalfScreenWebView halfScreenWebView) {
        this.f120210d = halfScreenWebView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/widget/HalfScreenWebView$initActionBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C45520t u = this.f120210d.f119789J.mo68956u();
        if (u != null) {
            u.reload();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/widget/HalfScreenWebView$initActionBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
