package com.tencent.p014mm.plugin.messenger.foundation;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.storage.C44658g2;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C44667s4;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86301e;
import ei3.C86522b;
import f62.C97829l0;
import g62.C75875l;
import g62.C8235p;
import zh3.C91753f;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.messenger.foundation.r */
public class C69842r extends C86301e implements C97829l0 {
    /* renamed from: Ns */
    public C44668u3 mo96088Ns(C91753f fVar) {
        return new C44658g2(fVar);
    }

    /* renamed from: QD */
    public C75875l mo96089QD(C91753f fVar, C44668u3 u3Var, C30783v3 v3Var) {
        return new C72972g4(fVar, u3Var, v3Var);
    }

    /* renamed from: hV */
    public C8235p mo96090hV(C91753f fVar) {
        return new C44667s4(fVar);
    }

    /* renamed from: yt */
    public C30783v3 mo96091yt(C91753f fVar) {
        return new C44660i2(fVar);
    }
}
