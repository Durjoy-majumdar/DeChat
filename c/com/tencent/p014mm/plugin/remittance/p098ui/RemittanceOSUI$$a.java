package com.tencent.p014mm.plugin.remittance.p098ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import ie3.C76324c;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceOSUI$$a */
public final /* synthetic */ class RemittanceOSUI$$a implements C76324c.C76326b {

    /* renamed from: a */
    public final /* synthetic */ RemittanceOSUI f205111a;

    public /* synthetic */ RemittanceOSUI$$a(RemittanceOSUI remittanceOSUI) {
        this.f205111a = remittanceOSUI;
    }

    /* renamed from: a */
    public final void mo97424a(int i) {
        RemittanceOSUI remittanceOSUI = this.f205111a;
        int i2 = RemittanceOSUI.f205103m1;
        remittanceOSUI.getClass();
        Log.m105925i("MicroMsg.RemittanceOSUI", "hkcashier callback, retcode is %s", Integer.valueOf(i));
        if (i == 1) {
            C119179t tVar = C119157j.f356862d;
            RemittanceOSUI$$b remittanceOSUI$$b = new RemittanceOSUI$$b(remittanceOSUI);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(remittanceOSUI$$b, 200, false);
        }
    }
}
