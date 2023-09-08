package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.y */
public class C2260y implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceProfileAffectedUserView f12345d;

    public C2260y(ExdeviceProfileAffectedUserView exdeviceProfileAffectedUserView) {
        this.f12345d = exdeviceProfileAffectedUserView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileAffectedUserView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f12345d.f12322e.performClick();
        C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileAffectedUserView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
