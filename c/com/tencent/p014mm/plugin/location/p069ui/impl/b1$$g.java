package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C12925w;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.b1$$g */
public final /* synthetic */ class b1$$g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12925w f19892d;

    public /* synthetic */ b1$$g(C12925w wVar) {
        this.f19892d = wVar;
    }

    public final void onClick(View view) {
        C12925w wVar = this.f19892d;
        Object obj = new Object();
        ArrayList arrayList = new ArrayList();
        arrayList.add(wVar);
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/location/ui/impl/ViewMapUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj, array);
        wVar.mo5085n();
        C117292a.m165361g(new Object(), "com/tencent/mm/plugin/location/ui/impl/ViewMapUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
