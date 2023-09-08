package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Intent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.h1 */
public class C4682h1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ IPCallShareCouponUI f19650d;

    public C4682h1(IPCallShareCouponUI iPCallShareCouponUI) {
        this.f19650d = iPCallShareCouponUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.setClass(this.f19650d.getContext(), IPCallPackageUI.class);
        IPCallShareCouponUI iPCallShareCouponUI = this.f19650d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        IPCallShareCouponUI iPCallShareCouponUI2 = iPCallShareCouponUI;
        C117292a.m165358d(iPCallShareCouponUI2, aVar.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$10", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        iPCallShareCouponUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(iPCallShareCouponUI2, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$10", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
