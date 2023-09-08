package com.tencent.p014mm.plugin.finder.replay;

import fy3.C32224a;
import gy3.C87413o;
import java.util.LinkedList;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C52013xs0;
import te3.C64674r41;
import vo1.C65824u;
import y50.C53496k;

/* renamed from: com.tencent.mm.plugin.finder.replay.a */
public final class C56259a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveReplayPluginLayout f160791d;

    /* renamed from: e */
    public final /* synthetic */ C13604l<LinkedList<C64674r41>, LinkedList<C52013xs0>> f160792e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56259a(FinderLiveReplayPluginLayout finderLiveReplayPluginLayout, C13604l<? extends LinkedList<C64674r41>, ? extends LinkedList<C52013xs0>> lVar) {
        super(0);
        this.f160791d = finderLiveReplayPluginLayout;
        this.f160792e = lVar;
    }

    public Object invoke() {
        C13604l<LinkedList<C64674r41>, LinkedList<C52013xs0>> lVar = this.f160792e;
        ((C65824u) this.f160791d.business(C65824u.class)).mo90687d3((LinkedList) lVar.f38555d, (LinkedList) lVar.f38556e);
        C53496k.f150436a.mo74170c();
        return C13598b0.f38549a;
    }
}
