package com.tencent.p014mm.plugin.finder.webview;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.webview.q */
public final class C41641q implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderWebViewScrollViewWrapper f112086d;

    public C41641q(FinderWebViewScrollViewWrapper finderWebViewScrollViewWrapper) {
        this.f112086d = finderWebViewScrollViewWrapper;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/webview/FinderWebViewScrollViewWrapper$initDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f112086d.f111993k.reload();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/webview/FinderWebViewScrollViewWrapper$initDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
