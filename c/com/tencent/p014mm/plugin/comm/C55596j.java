package com.tencent.p014mm.plugin.comm;

import com.tencent.p014mm.app.C80625v0;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import i21.C33192f;
import i21.C60242i;
import k21.C60960c;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.comm.j */
public final class C55596j extends C86301e implements C33192f {
    public void Zr0(String str, String str2, Object obj, C60242i iVar) {
        C87412m.m108594g(str, "sessionId");
        C87412m.m108594g(str2, "key");
        C87412m.m108594g(obj, "value");
        C87412m.m108594g(iVar, "opeartionState");
        C60960c.f173618a.mo85927k(str, str2, obj, iVar);
    }

    /* renamed from: j8 */
    public void mo59013j8(String str, String str2, Object obj) {
        C87412m.m108594g(str, "sessionId");
        C87412m.m108594g(str2, "key");
        C87412m.m108594g(obj, "value");
        C60960c.f173618a.mo85926j(str, str2, obj);
    }
}
