package com.tencent.p014mm.plugin.finder.floatball;

import com.tencent.p014mm.autogen.events.MultiTalkStatusEvent;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.floatball.b */
public final class C55865b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BaseFinderMiniViewHelper f159137d;

    /* renamed from: e */
    public final /* synthetic */ MultiTalkStatusEvent f159138e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55865b(BaseFinderMiniViewHelper baseFinderMiniViewHelper, MultiTalkStatusEvent multiTalkStatusEvent) {
        super(0);
        this.f159137d = baseFinderMiniViewHelper;
        this.f159138e = multiTalkStatusEvent;
    }

    public Object invoke() {
        if (C86709a0.m107522a() && this.f159137d.mo90541w() && this.f159138e.f154840d.f154841a) {
            this.f159137d.mo77454E0();
        }
        return C13598b0.f38549a;
    }
}
