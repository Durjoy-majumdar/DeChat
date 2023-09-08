package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.d */
public class C4822d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C94161a f19894d;

    public C4822d(C94161a aVar) {
        this.f19894d = aVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/location/ui/impl/BaseMapUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f19894d.mo129358k();
        C117292a.m165361g(this, "com/tencent/mm/plugin/location/ui/impl/BaseMapUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
