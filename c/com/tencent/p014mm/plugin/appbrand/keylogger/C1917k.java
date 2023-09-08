package com.tencent.p014mm.plugin.appbrand.keylogger;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.keylogger.k */
public class C1917k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ KeyStepBaseActivity f11790d;

    public C1917k(KeyStepBaseActivity keyStepBaseActivity) {
        this.f11790d = keyStepBaseActivity;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/keylogger/KeyStepBaseActivity$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f11790d.finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/keylogger/KeyStepBaseActivity$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
