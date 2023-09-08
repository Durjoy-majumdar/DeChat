package com.tencent.p014mm.plugin.ipcall.p065ui;

import com.tencent.p014mm.plugin.ipcall.p065ui.IPCallShareCouponUI;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C97625j3;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.g1 */
public class C4681g1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ IPCallShareCouponUI.C46661 f19649d;

    public C4681g1(IPCallShareCouponUI.C46661 r1) {
        this.f19649d = r1;
    }

    public void run() {
        if (((Boolean) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_IPCALL_RECHARGE_SHOW_REDDOT_BOOLEAN, Boolean.FALSE)).booleanValue()) {
            IPCallShareCouponUI.this.f19595f.setVisibility(0);
        } else {
            IPCallShareCouponUI.this.f19595f.setVisibility(8);
        }
        IPCallShareCouponUI.this.f19594e.setText((String) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERFINO_IPCALL_RECHARGE_STRING, ""));
        IPCallShareCouponUI.this.f19597h.setText((String) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_IPCALL_PACKAGE_PURCHASE_STRING, ""));
    }
}
