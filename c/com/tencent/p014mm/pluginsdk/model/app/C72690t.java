package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.p136ui.chatting.component.C73521l0;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86301e;
import eb0.C31478i2;
import ei3.C86522b;
import gy3.C87412m;
import th0.C101888l;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.pluginsdk.model.app.t */
public final class C72690t extends C86301e implements C31478i2 {
    /* renamed from: Kb */
    public long mo58193Kb(C72963f4 f4Var) {
        return C73521l0.m86926c(f4Var);
    }

    /* renamed from: ih */
    public int mo58194ih(int i) {
        return C72695v.m85061c(i);
    }

    /* renamed from: pu */
    public boolean mo58195pu(String str) {
        C87412m.m108594g(str, "talker");
        return C101888l.f300029a.mo141352a(str);
    }
}
