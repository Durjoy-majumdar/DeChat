package com.tencent.p014mm.plugin.location.p069ui.impl;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.s0$$e */
public final /* synthetic */ class s0$$e implements C32227p {

    /* renamed from: d */
    public final /* synthetic */ C94167s0 f272030d;

    public /* synthetic */ s0$$e(C94167s0 s0Var) {
        this.f272030d = s0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        C94167s0 s0Var = this.f272030d;
        float floatValue = ((Float) obj).floatValue();
        float floatValue2 = ((Float) obj2).floatValue();
        if (!s0Var.f272025y0) {
            return C13598b0.f38549a;
        }
        Log.m105918d("MicroMsg.TrackMapUI", "peek height change peekHeight " + floatValue2);
        if (floatValue2 < 0.0f) {
            return C13598b0.f38549a;
        }
        if (!s0Var.f272013R0) {
            s0Var.f271961t.setTranslationY((-Math.abs(floatValue2 - floatValue)) / 2.0f);
        }
        if (floatValue >= floatValue2) {
            s0Var.f272013R0 = true;
            s0Var.f271961t.setTranslationY(0.0f);
        }
        return C13598b0.f38549a;
    }
}
