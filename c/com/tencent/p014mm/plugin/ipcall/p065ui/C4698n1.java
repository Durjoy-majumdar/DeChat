package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.n1 */
public class C4698n1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ IPCallShareCouponUI f19688d;

    public C4698n1(IPCallShareCouponUI iPCallShareCouponUI) {
        this.f19688d = iPCallShareCouponUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        IPCallShareCouponUI.m4929H7(this.f19688d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
