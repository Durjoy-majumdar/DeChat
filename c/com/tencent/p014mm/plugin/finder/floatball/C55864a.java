package com.tencent.p014mm.plugin.finder.floatball;

import com.tencent.p014mm.autogen.events.MultiTalkActionEvent;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.floatball.a */
public final class C55864a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BaseFinderMiniViewHelper f159135d;

    /* renamed from: e */
    public final /* synthetic */ MultiTalkActionEvent f159136e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55864a(BaseFinderMiniViewHelper baseFinderMiniViewHelper, MultiTalkActionEvent multiTalkActionEvent) {
        super(0);
        this.f159135d = baseFinderMiniViewHelper;
        this.f159136e = multiTalkActionEvent;
    }

    public Object invoke() {
        if (C86709a0.m107522a() && this.f159135d.mo90541w() && this.f159136e.f154837d.f107635a == 3) {
            this.f159135d.mo77454E0();
        }
        return C13598b0.f38549a;
    }
}
