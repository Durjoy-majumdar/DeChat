package com.tencent.p014mm.plugin.remittance.p098ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import ie3.C76324c;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceHKUI$$a */
public final /* synthetic */ class RemittanceHKUI$$a implements C76324c.C76326b {

    /* renamed from: a */
    public final /* synthetic */ RemittanceHKUI f204925a;

    public /* synthetic */ RemittanceHKUI$$a(RemittanceHKUI remittanceHKUI) {
        this.f204925a = remittanceHKUI;
    }

    /* renamed from: a */
    public final void mo97424a(int i) {
        RemittanceHKUI remittanceHKUI = this.f204925a;
        int i2 = RemittanceHKUI.f204920k1;
        remittanceHKUI.getClass();
        Log.m105925i("MicroMsg.RemittanceHKUI", "hkcashier callback, retcode is %s", Integer.valueOf(i));
        if (i == 1) {
            C119179t tVar = C119157j.f356862d;
            RemittanceHKUI$$b remittanceHKUI$$b = new RemittanceHKUI$$b(remittanceHKUI);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(remittanceHKUI$$b, 200, false);
        }
    }
}
