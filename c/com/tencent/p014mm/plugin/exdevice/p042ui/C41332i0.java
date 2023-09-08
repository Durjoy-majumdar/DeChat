package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import t71.C48540e;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.i0 */
public class C41332i0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceProfileUI f111306d;

    public C41332i0(ExdeviceProfileUI exdeviceProfileUI) {
        this.f111306d = exdeviceProfileUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C48540e.m53922d(this.f111306d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
