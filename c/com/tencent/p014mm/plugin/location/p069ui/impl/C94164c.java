package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.c */
public class C94164c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C94161a f272008d;

    public C94164c(C94161a aVar) {
        this.f272008d = aVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/location/ui/impl/BaseMapUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f272008d.mo129357j();
        this.f272008d.mo129363p();
        this.f272008d.f271948d.finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/location/ui/impl/BaseMapUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
