package com.tencent.p014mm.p136ui.contact;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.autogen.mmdata.rpt.ForwardToWeWorkStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import z04.C112551y;

/* renamed from: com.tencent.mm.ui.contact.b1 */
public final class C19791b1 {
    /* renamed from: a */
    public static final void m21486a(Integer num, String str, Integer num2, Integer num3, String str2, int i) {
        ForwardToWeWorkStruct forwardToWeWorkStruct = new ForwardToWeWorkStruct();
        long j = 0;
        forwardToWeWorkStruct.f48510d = num != null ? (long) num.intValue() : 0;
        if (str == null) {
            str = "";
        }
        forwardToWeWorkStruct.f48511e = forwardToWeWorkStruct.mo86045b("ChatName", str, true);
        forwardToWeWorkStruct.f48512f = num2 != null ? (long) num2.intValue() : 0;
        if (num3 != null) {
            j = (long) num3.intValue();
        }
        forwardToWeWorkStruct.f48513g = j;
        if (str2 == null) {
            str2 = "";
        }
        forwardToWeWorkStruct.f48514h = forwardToWeWorkStruct.mo86045b("MsgTypes", str2, true);
        forwardToWeWorkStruct.f48515i = (long) i;
        forwardToWeWorkStruct.mo86054n();
        String q = forwardToWeWorkStruct.mo1006q();
        C87412m.m108593f(q, "struct.toShowString()");
        Log.m105925i("ForwardReporter", "report%s %s", 27331, C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", false));
    }
}
