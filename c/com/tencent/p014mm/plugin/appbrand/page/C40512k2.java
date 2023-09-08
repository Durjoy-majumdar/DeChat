package com.tencent.p014mm.plugin.appbrand.page;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.page.k2 */
public class C40512k2 implements View.OnLongClickListener {
    public C40512k2(C40502j2 j2Var) {
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/page/AppBrandWebView$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/appbrand/page/AppBrandWebView$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
