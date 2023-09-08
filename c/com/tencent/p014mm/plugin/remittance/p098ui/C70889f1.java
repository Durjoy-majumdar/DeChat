package com.tencent.p014mm.plugin.remittance.p098ui;

import android.view.MenuItem;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.remittance.ui.f1 */
public class C70889f1 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ RemittanceF2fDynamicCodeUI f205301d;

    public C70889f1(RemittanceF2fDynamicCodeUI remittanceF2fDynamicCodeUI) {
        this.f205301d = remittanceF2fDynamicCodeUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (i == 0) {
            RemittanceF2fDynamicCodeUI.m83278I7(this.f205301d, 1);
        }
    }
}
