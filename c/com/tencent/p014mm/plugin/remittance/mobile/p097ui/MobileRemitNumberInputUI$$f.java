package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.view.View;
import com.tencent.p014mm.autogen.mmdata.rpt.WCPayTransferToPhoneActionReportStruct;
import com.tencent.p014mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecvInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI$$f */
public class MobileRemitNumberInputUI$$f extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ MobileRemitNumberInputUI f203899g;

    public MobileRemitNumberInputUI$$f(MobileRemitNumberInputUI mobileRemitNumberInputUI) {
        this.f203899g = mobileRemitNumberInputUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105924i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "mSubmitBt click!");
        this.f203899g.doSceneProgress(new NetSceneMobileRemitGetRecvInfo(this.f203899g.f203886j.getText(), "", this.f203899g.f203891r.f136828n, !Util.isNullOrNil(this.f203899g.f203894u) ? 3 : 1), true);
        this.f203899g.getClass();
        WCPayTransferToPhoneActionReportStruct wCPayTransferToPhoneActionReportStruct = new WCPayTransferToPhoneActionReportStruct();
        wCPayTransferToPhoneActionReportStruct.f194684d = (long) 5;
        wCPayTransferToPhoneActionReportStruct.mo86054n();
    }
}
