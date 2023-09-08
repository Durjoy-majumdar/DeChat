package jj3;

import bj3.C54476c;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import my3.C34688d;
import rx3.C13598b0;

/* renamed from: jj3.b */
public final class C60876b {

    /* renamed from: jj3.b$a */
    public static final class C60877a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60875a f173438d;

        /* renamed from: e */
        public final /* synthetic */ int f173439e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60877a(C60875a aVar, int i) {
            super(0);
            this.f173438d = aVar;
            this.f173439e = i;
        }

        public Object invoke() {
            this.f173438d.mo82004l(this.f173439e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m71283a(C60875a aVar, int i) {
        C87412m.m108594g(aVar, "<this>");
        int visibility = aVar.getView().getVisibility();
        if (i == visibility) {
            return;
        }
        if (visibility == 4 && i == 0) {
            aVar.mo82004l(i);
            C54476c.m61195a(aVar.getView(), new C34688d(0.0d, 1.0d), false, (C32224a) null, 6, (Object) null);
        } else if (visibility == 8 && i == 0) {
            aVar.mo82004l(i);
            C54476c.m61195a(aVar.getView(), new C34688d(0.0d, 1.0d), false, (C32224a) null, 6, (Object) null);
        } else if (visibility == 0) {
            C54476c.m61195a(aVar.getView(), new C34688d(1.0d, 0.0d), false, new C60877a(aVar, i), 2, (Object) null);
        }
    }
}
