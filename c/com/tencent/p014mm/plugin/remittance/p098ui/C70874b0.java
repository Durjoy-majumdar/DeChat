package com.tencent.p014mm.plugin.remittance.p098ui;

import com.tencent.p014mm.autogen.events.F2fDynamicStartPayEvent;
import com.tencent.p014mm.plugin.remittance.p098ui.C70900k;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.remittance.ui.b0 */
public class C70874b0 implements C70900k.C70904d {

    /* renamed from: a */
    public final /* synthetic */ RemittanceBaseUI f205283a;

    public C70874b0(RemittanceBaseUI remittanceBaseUI) {
        this.f205283a = remittanceBaseUI;
    }

    /* renamed from: a */
    public void mo97226a(String str) {
        Log.m105925i("MicroMsg.RemittanceBaseUI", "onDialogClick  %s", str);
        this.f205283a.getClass();
        RemittanceBaseUI remittanceBaseUI = this.f205283a;
        if (remittanceBaseUI.f204389n == 33) {
            remittanceBaseUI.mo97273M7(remittanceBaseUI.f204349H, remittanceBaseUI.f204390o, remittanceBaseUI.f204350I, remittanceBaseUI.f204351J, remittanceBaseUI.f204352K, remittanceBaseUI.f204354M, "", (F2fDynamicStartPayEvent) null);
        } else {
            remittanceBaseUI.mo97273M7(remittanceBaseUI.f204349H, remittanceBaseUI.f204390o, remittanceBaseUI.f204350I, remittanceBaseUI.f204351J, remittanceBaseUI.f204352K, (String) null, "", (F2fDynamicStartPayEvent) null);
        }
    }

    public void onCancel() {
        this.f205283a.getClass();
        this.f205283a.showNormalStWcKb();
    }
}
