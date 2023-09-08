package com.tencent.matrix.lifecycle;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.matrix.lifecycle.h0 */
public enum C80408h0 {
    INIT((String) null),
    ON(C80409a.f235343d),
    OFF(C80410b.f235344d);
    

    /* renamed from: d */
    public final C32226l<C80407h, C13598b0> f235342d;

    /* renamed from: com.tencent.matrix.lifecycle.h0$a */
    public static final class C80409a extends C87413o implements C32226l<C80407h, C13598b0> {

        /* renamed from: d */
        public static final C80409a f235343d = null;

        static {
            f235343d = new C80409a();
        }

        public C80409a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C80407h hVar = (C80407h) obj;
            C87412m.m108594g(hVar, "observer");
            hVar.mo60742on();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.matrix.lifecycle.h0$b */
    public static final class C80410b extends C87413o implements C32226l<C80407h, C13598b0> {

        /* renamed from: d */
        public static final C80410b f235344d = null;

        static {
            f235344d = new C80410b();
        }

        public C80410b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C80407h hVar = (C80407h) obj;
            C87412m.m108594g(hVar, "observer");
            hVar.off();
            return C13598b0.f38549a;
        }
    }

    /* access modifiers changed from: public */
    C80408h0(C32226l<? super C80407h, C13598b0> lVar) {
        this.f235342d = lVar;
    }
}
