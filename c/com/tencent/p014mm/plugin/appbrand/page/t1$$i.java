package com.tencent.p014mm.plugin.appbrand.page;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.menu.C83699y;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.appbrand.page.t1$$i */
public class t1$$i implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C83928t1 f245040d;

    public t1$$i(C83928t1 t1Var) {
        this.f245040d = t1Var;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C83928t1 t1Var = this.f245040d;
        t1Var.mo116154I0();
        List<C83699y> list = t1Var.f245021e1;
        if (list == null || ((LinkedList) list).size() <= 0) {
            Log.m105929w("MicroMsg.AppBrandPageViewWC", "showPageActionSheet appId[%s], url[%s], empty list skip", t1Var.getAppId(), t1Var.mo116162Q0());
        } else {
            t1Var.mo116181i1(t1Var.f245021e1, (Runnable) null, (Runnable) null);
        }
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
