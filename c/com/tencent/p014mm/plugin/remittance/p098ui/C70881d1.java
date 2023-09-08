package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.Intent;
import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.remittance.ui.d1 */
public class C70881d1 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ RemittanceF2fDynamicCodeUI f205294d;

    public C70881d1(RemittanceF2fDynamicCodeUI remittanceF2fDynamicCodeUI) {
        this.f205294d = remittanceF2fDynamicCodeUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        RemittanceF2fDynamicCodeUI remittanceF2fDynamicCodeUI = this.f205294d;
        int i = RemittanceF2fDynamicCodeUI.f204864I;
        if (remittanceF2fDynamicCodeUI.needConfirmFinish()) {
            this.f205294d.hideVKB();
            this.f205294d.showDialog(1000);
            return true;
        }
        this.f205294d.setResult(0, new Intent().putExtra("key_pay_reslut_type", 4));
        this.f205294d.finish();
        return true;
    }
}
