package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import q12.C12033h;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.t1 */
public class C4719t1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ IPCallShareCouponUI f19725d;

    public C4719t1(IPCallShareCouponUI iPCallShareCouponUI) {
        this.f19725d = iPCallShareCouponUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C85801v1 u = C97625j3.m125812b().mo105906u();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_IPCALL_RECHARGE_SHOW_REDDOT_BOOLEAN;
        Boolean bool = Boolean.FALSE;
        if (((Boolean) u.mo119685f(aVar, bool)).booleanValue()) {
            C12033h.m11735a(3, -1, -1);
        }
        C97625j3.m125812b().mo105906u().mo119677K(aVar, bool);
        this.f19725d.f19595f.setVisibility(8);
        Intent intent = new Intent();
        intent.setClass(this.f19725d.getContext(), IPCallRechargeUI.class);
        IPCallShareCouponUI iPCallShareCouponUI = this.f19725d;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(intent);
        IPCallShareCouponUI iPCallShareCouponUI2 = iPCallShareCouponUI;
        C117292a.m165358d(iPCallShareCouponUI2, aVar2.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        iPCallShareCouponUI.startActivity((Intent) aVar2.mo10231a(0));
        C117292a.m165359e(iPCallShareCouponUI2, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
