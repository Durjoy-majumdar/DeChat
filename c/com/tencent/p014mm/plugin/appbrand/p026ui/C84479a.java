package com.tencent.p014mm.plugin.appbrand.p026ui;

import ai0.C79575q;
import ai0.C79579t;
import ai0.C79580u;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C81112d;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.a */
public class C84479a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C84518d f246583d;

    public C84479a(C84518d dVar) {
        this.f246583d = dVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/AppBrandAdLoadingSplash$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C79580u uVar = this.f246583d.f246659g;
        if (uVar != null) {
            C79575q qVar = (C79575q) uVar;
            C81112d dVar = new C81112d();
            dVar.f238382i = "launch";
            dVar.f238383j = "close";
            dVar.mo113279s(qVar.mo109687e());
            qVar.f233331b.mo113024P0(new C79579t(qVar, true, "launch"));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandAdLoadingSplash$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
