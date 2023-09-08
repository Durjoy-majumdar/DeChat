package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.o1 */
public class C4701o1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ IPCallShareCouponUI f19691d;

    public C4701o1(IPCallShareCouponUI iPCallShareCouponUI) {
        this.f19691d = iPCallShareCouponUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        IPCallShareCouponUI.m4930I7(this.f19691d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
