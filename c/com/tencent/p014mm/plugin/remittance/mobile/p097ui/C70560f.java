package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.f */
public class C70560f implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MobileRemitWelcomeUI f204020d;

    public C70560f(MobileRemitWelcomeUI mobileRemitWelcomeUI) {
        this.f204020d = mobileRemitWelcomeUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.mobileRemit.MobileRemitWelcomeUI", "click AlertDialog");
        this.f204020d.finish();
    }
}
