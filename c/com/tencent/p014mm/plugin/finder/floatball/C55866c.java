package com.tencent.p014mm.plugin.finder.floatball;

import com.tencent.p014mm.autogen.events.VoipEvent;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.floatball.c */
public final class C55866c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BaseFinderMiniViewHelper f159139d;

    /* renamed from: e */
    public final /* synthetic */ VoipEvent f159140e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55866c(BaseFinderMiniViewHelper baseFinderMiniViewHelper, VoipEvent voipEvent) {
        super(0);
        this.f159139d = baseFinderMiniViewHelper;
        this.f159140e = voipEvent;
    }

    public Object invoke() {
        int i;
        if (C86709a0.m107522a() && this.f159139d.mo90541w() && ((i = this.f159140e.f194019d.f194022b) == 3 || i == 7)) {
            this.f159139d.mo77454E0();
        }
        return C13598b0.f38549a;
    }
}
