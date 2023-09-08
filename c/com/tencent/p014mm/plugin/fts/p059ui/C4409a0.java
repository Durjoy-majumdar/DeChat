package com.tencent.p014mm.plugin.fts.p059ui;

import com.tencent.p014mm.autogen.mmdata.rpt.MultiDeleteContactsReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.fts.ui.a0 */
public class C4409a0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f19090d;

    /* renamed from: e */
    public final /* synthetic */ String f19091e;

    public C4409a0(int i, String str) {
        this.f19090d = i;
        this.f19091e = str;
    }

    public void run() {
        MultiDeleteContactsReportStruct multiDeleteContactsReportStruct = new MultiDeleteContactsReportStruct();
        multiDeleteContactsReportStruct.f10007d = (long) this.f19090d;
        multiDeleteContactsReportStruct.f10008e = multiDeleteContactsReportStruct.mo86045b("actionInfo", this.f19091e, true);
        multiDeleteContactsReportStruct.mo86054n();
        Log.m105924i("MicroMsg.FTS.FTSReportLogic", "24832 ,action = " + multiDeleteContactsReportStruct.f10007d + ",actionInfo = " + multiDeleteContactsReportStruct.f10008e);
    }
}
