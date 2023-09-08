package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.b1$$i */
public class b1$$i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C94163b1 f272004d;

    public b1$$i(C94163b1 b1Var) {
        this.f272004d = b1Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/location/ui/impl/ViewMapUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f272004d.mo129368A();
        this.f272004d.f271980C.mo107573q();
        C117292a.m165361g(this, "com/tencent/mm/plugin/location/ui/impl/ViewMapUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
