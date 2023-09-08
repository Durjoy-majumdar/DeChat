package com.tencent.p014mm.plugin.fingerprint.faceid.auth;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82385f3;
import com.tencent.p014mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import v53.C78342e0;
import vt1.C78474b;

/* renamed from: com.tencent.mm.plugin.fingerprint.faceid.auth.b */
public class C68971b implements C78474b {

    /* renamed from: d */
    public final /* synthetic */ WalletFaceIdAuthUI.C68969e f198182d;

    public C68971b(WalletFaceIdAuthUI.C68969e eVar) {
        this.f198182d = eVar;
    }

    /* renamed from: n */
    public void mo94918n(int i, String str) {
        int i2 = 2;
        if (i == 0) {
            Log.m105924i("MicroMsg.WalletFaceIdAuthUI", "open fingerprintpay success");
            this.f198182d.f198179d.doSceneProgress(new C78342e0((String) null, 19), false);
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[1];
            if (this.f198182d.mo94912c() == 1) {
                i2 = 1;
            }
            objArr[0] = Integer.valueOf(i2);
            nVar.mo160131h(15817, objArr);
            nVar.mo175911u(C82385f3.CTRL_INDEX, 1);
            return;
        }
        this.f198182d.f198179d.hideProgress();
        Log.m105920e("MicroMsg.WalletFaceIdAuthUI", "open fingerprintpay failed");
        WalletFaceIdAuthUI walletFaceIdAuthUI = this.f198182d.f198179d;
        walletFaceIdAuthUI.mo94908H7(walletFaceIdAuthUI.getString(C0966R.string.clv));
        C115669n.INSTANCE.mo175911u(C82385f3.CTRL_INDEX, 2);
    }
}
