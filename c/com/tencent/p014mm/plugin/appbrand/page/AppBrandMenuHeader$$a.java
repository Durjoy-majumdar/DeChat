package com.tencent.p014mm.plugin.appbrand.page;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader$$a */
public final /* synthetic */ class AppBrandMenuHeader$$a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Runnable f197145d;

    public /* synthetic */ AppBrandMenuHeader$$a(Runnable runnable) {
        this.f197145d = runnable;
    }

    public final void onClick(View view) {
        Runnable runnable = this.f197145d;
        int i = AppBrandMenuHeader.f244378q;
        Object obj = new Object();
        ArrayList arrayList = new ArrayList();
        arrayList.add(runnable);
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj, array);
        runnable.run();
        C117292a.m165361g(new Object(), "com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
