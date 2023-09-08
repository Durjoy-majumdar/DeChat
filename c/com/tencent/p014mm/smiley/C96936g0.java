package com.tencent.p014mm.smiley;

import com.tencent.p014mm.smiley.C96961p;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.smiley.g0 */
public final class C96936g0 {

    /* renamed from: a */
    public final C96960o0 f283975a = C96961p.C96962a.f284061a.f284060a;

    /* renamed from: b */
    public int f283976b;

    /* renamed from: com.tencent.mm.smiley.g0$a */
    public static final class C96937a extends C87413o implements C32224a<C96976z> {

        /* renamed from: d */
        public static final C96937a f283977d = new C96937a();

        public C96937a() {
            super(0);
        }

        public Object invoke() {
            return new C96934f0();
        }
    }

    /* renamed from: a */
    public final void mo135528a(C96932e0 e0Var) {
        C87412m.m108594g(e0Var, "item");
        this.f283975a.mo135512a(e0Var, 0, C96937a.f283977d);
        this.f283976b = Math.max(this.f283976b, e0Var.f283969e.length);
    }

    /* renamed from: b */
    public void mo135529b(CharSequence charSequence, int i, int i2, C96975y yVar) {
        C87412m.m108594g(yVar, "matchCallback");
        new C96951l(this.f283975a).mo135537a(charSequence, i, i2, yVar);
    }
}
