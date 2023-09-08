package com.tencent.p014mm.p136ui.chatting.component;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import gy3.C87412m;
import java.util.HashSet;
import p270xi.C78836g;
import p270xi.C78837h;

/* renamed from: com.tencent.mm.ui.chatting.component.g0 */
public final class C73479g0 implements C78837h {

    /* renamed from: d */
    public final HashSet<C78836g> f215893d = new HashSet<>();

    /* renamed from: T */
    public void mo102438T(C78836g gVar) {
        C87412m.m108594g(gVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f215893d.remove(gVar);
    }

    /* renamed from: h */
    public void mo102439h(int i, boolean z) {
        for (C78836g h : this.f215893d) {
            h.mo102346h(i, z);
        }
    }

    /* renamed from: l */
    public void mo102440l(int i) {
        for (C78836g l : this.f215893d) {
            l.mo102347l(i);
        }
    }

    /* renamed from: y0 */
    public void mo102441y0(C78836g gVar) {
        C87412m.m108594g(gVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f215893d.add(gVar);
    }
}
