package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.view.View;
import com.tencent.p014mm.autogen.mmdata.rpt.WCPayTransferToPhoneActionReportStruct;
import com.tencent.p014mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecord;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI$$g */
public class MobileRemitNumberInputUI$$g extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ MobileRemitNumberInputUI f203900g;

    public MobileRemitNumberInputUI$$g(MobileRemitNumberInputUI mobileRemitNumberInputUI) {
        this.f203900g = mobileRemitNumberInputUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105924i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "history click!");
        MobileRemitNumberInputUI mobileRemitNumberInputUI = this.f203900g;
        int i = MobileRemitNumberInputUI.f203879v;
        mobileRemitNumberInputUI.getClass();
        mobileRemitNumberInputUI.doSceneProgress(new NetSceneMobileRemitGetRecord("", mobileRemitNumberInputUI.f203891r.f136828n), true);
        this.f203900g.getClass();
        WCPayTransferToPhoneActionReportStruct wCPayTransferToPhoneActionReportStruct = new WCPayTransferToPhoneActionReportStruct();
        wCPayTransferToPhoneActionReportStruct.f194684d = (long) 12;
        wCPayTransferToPhoneActionReportStruct.mo86054n();
    }
}
