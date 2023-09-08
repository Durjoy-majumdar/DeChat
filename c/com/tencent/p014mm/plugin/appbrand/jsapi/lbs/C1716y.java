package com.tencent.p014mm.plugin.appbrand.jsapi.lbs;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.y */
public class C1716y implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77407n f11412d;

    public C1716y(C82613z zVar, C77407n nVar) {
        this.f11412d = nVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/lbs/JsApiOpenMapApp$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f11412d.mo107572p();
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/lbs/JsApiOpenMapApp$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
