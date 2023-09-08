package com.tencent.p014mm.p136ui.chatting.viewitems;

import com.tencent.p014mm.autogen.mmdata.rpt.SendFileActionReportStruct;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import gy3.C87412m;
import t90.C77878b;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.i1 */
public final class C97184i1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C68070l.C68072b f285172d;

    /* renamed from: e */
    public final /* synthetic */ C72963f4 f285173e;

    /* renamed from: f */
    public final /* synthetic */ int f285174f;

    public C97184i1(C68070l.C68072b bVar, C72963f4 f4Var, int i) {
        this.f285172d = bVar;
        this.f285173e = f4Var;
        this.f285174f = i;
    }

    public final void run() {
        C68070l.C68072b bVar = this.f285172d;
        Long l = null;
        if (bVar == null) {
            bVar = C68070l.C68072b.m80422u(this.f285173e.getContent(), (String) null);
        }
        SendFileActionReportStruct sendFileActionReportStruct = new SendFileActionReportStruct();
        sendFileActionReportStruct.f265841d = (long) this.f285174f;
        sendFileActionReportStruct.f265842e = bVar != null ? (long) bVar.f195594l : 0;
        String nullAsNil = Util.nullAsNil(bVar != null ? bVar.f195602n : null);
        C87412m.m108593f(nullAsNil, "nullAsNil(amc?.fileext)");
        String lowerCase = nullAsNil.toLowerCase();
        C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase()");
        sendFileActionReportStruct.f265843f = sendFileActionReportStruct.mo86045b("FileExt", lowerCase, true);
        sendFileActionReportStruct.f265844g = sendFileActionReportStruct.mo86045b("ChatName", this.f285173e.mo108768t(), true);
        C77878b bVar2 = bVar != null ? (C77878b) bVar.mo93555w(C77878b.class) : null;
        if (bVar2 != null) {
            l = Long.valueOf(bVar2.f226901b);
        }
        sendFileActionReportStruct.f265845h = sendFileActionReportStruct.mo86045b("MsgSvrId", String.valueOf(l), true);
        sendFileActionReportStruct.f265846i = 1;
        sendFileActionReportStruct.mo86054n();
    }
}
