package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.os.Bundle;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75122k;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.e */
public class C70559e implements C75122k {

    /* renamed from: a */
    public final /* synthetic */ MobileRemitWelcomeUI f204019a;

    public C70559e(MobileRemitWelcomeUI mobileRemitWelcomeUI) {
        this.f204019a = mobileRemitWelcomeUI;
    }

    /* renamed from: a */
    public void mo95653a(int i, String str) {
        Log.m105924i("MicroMsg.mobileRemit.MobileRemitWelcomeUI", "showProtocalBottomDialog click next");
        C115669n.INSTANCE.mo160131h(24835, 1, 2);
        C88144b.m109791i(this.f204019a.getContext(), "remittance", ".mobile.ui.MobileRemitNumberInputUI", this.f204019a.getIntent(), (Bundle) null);
        this.f204019a.finish();
    }

    public void onCancel() {
        C115669n.INSTANCE.mo160131h(24835, 1, 3);
        Log.m105924i("MicroMsg.mobileRemit.MobileRemitWelcomeUI", "showProtocalBottomDialog click cancel");
    }
}
