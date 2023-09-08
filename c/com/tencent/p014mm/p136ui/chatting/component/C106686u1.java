package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.p136ui.chatting.component.C106673s1;
import fy3.C32226l;
import gy3.C87413o;

/* renamed from: com.tencent.mm.ui.chatting.component.u1 */
public final class C106686u1 extends C87413o implements C32226l<Long, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C106673s1 f318939d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106686u1(C106673s1 s1Var) {
        super(1);
        this.f318939d = s1Var;
    }

    public Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        return Boolean.valueOf((longValue == 0 || ((C106673s1.C106684l) this.f318939d.f318922w).mo124818v(longValue) == null) ? false : true);
    }
}
