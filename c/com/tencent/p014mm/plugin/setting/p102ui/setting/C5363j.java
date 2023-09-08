package com.tencent.p014mm.plugin.setting.p102ui.setting;

import com.tencent.p014mm.autogen.mmdata.rpt.QRCodeHelloMsgViewReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.j */
public final class C5363j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f21006d;

    public C5363j(long j) {
        this.f21006d = j;
    }

    public final void run() {
        QRCodeHelloMsgViewReportStruct qRCodeHelloMsgViewReportStruct = new QRCodeHelloMsgViewReportStruct();
        qRCodeHelloMsgViewReportStruct.f10032d = this.f21006d;
        qRCodeHelloMsgViewReportStruct.mo86054n();
        Log.m105924i("MicroMsg.Setting.ColorfulSelfQRCodeUI", "25609 setAction_ = " + this.f21006d);
    }
}
