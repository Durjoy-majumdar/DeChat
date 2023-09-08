package com.tencent.p014mm.plugin.setting.p102ui.setting;

import com.tencent.p014mm.autogen.mmdata.rpt.QRCodeHelloMsgViewReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.g0 */
public class C5357g0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f20999d;

    public C5357g0(SelfQRCodeUI selfQRCodeUI, long j) {
        this.f20999d = j;
    }

    public void run() {
        QRCodeHelloMsgViewReportStruct qRCodeHelloMsgViewReportStruct = new QRCodeHelloMsgViewReportStruct();
        qRCodeHelloMsgViewReportStruct.f10032d = this.f20999d;
        qRCodeHelloMsgViewReportStruct.mo86054n();
        Log.m105924i("MicroMsg.SelfQRCodeNewUI", "25609 setAction_ = " + this.f20999d);
    }
}
