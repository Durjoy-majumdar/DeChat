package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.a$$a */
public final /* synthetic */ class a$$a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C94161a f19891d;

    public /* synthetic */ a$$a(C94161a aVar) {
        this.f19891d = aVar;
    }

    public final void onClick(View view) {
        C94161a aVar = this.f19891d;
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/location/ui/impl/BaseMapUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", aVar, array);
        aVar.mo129359l();
        C117292a.m165361g(aVar, "com/tencent/mm/plugin/location/ui/impl/BaseMapUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
