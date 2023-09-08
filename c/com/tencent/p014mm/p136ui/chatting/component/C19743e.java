package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.p136ui.chatting.component.C19729d;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.ui.chatting.component.e */
public final class C19743e extends C87413o implements C32227p<Long, C19729d.C19730a.C19741k, Boolean> {

    /* renamed from: d */
    public static final C19743e f56161d = new C19743e();

    public C19743e() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        ((Number) obj).longValue();
        C19729d.C19730a.C19741k kVar = (C19729d.C19730a.C19741k) obj2;
        C87412m.m108594g(kVar, "statefulStatInfo");
        C19729d.C19730a.C19732b bVar = kVar.f56157a;
        return Boolean.valueOf(bVar.f56126l || 0 < bVar.mo26200a());
    }
}
