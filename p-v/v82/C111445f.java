package v82;

import fy3.C32224a;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: v82.f */
public final class C111445f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C111433e f333669d;

    /* renamed from: v82.f$a */
    public static final class C111446a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C111433e f333670d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111446a(C111433e eVar) {
            super(0);
            this.f333670d = eVar;
        }

        public Object invoke() {
            this.f333670d.mo163113y();
            return C13598b0.f38549a;
        }
    }

    public C111445f(C111433e eVar) {
        this.f333669d = eVar;
    }

    public final void run() {
        C111433e eVar = this.f333669d;
        if (eVar.f333621S == 4) {
            C61926c.m72668M(new C111446a(eVar));
        }
    }
}
