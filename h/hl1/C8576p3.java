package hl1;

import cj1.C54795n5;
import fy3.C32229r;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;
import te3.C49585go0;

/* renamed from: hl1.p3 */
public final class C8576p3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C59988k f27662d;

    /* renamed from: hl1.p3$a */
    public static final class C8577a extends C87413o implements C32229r<Integer, Integer, String, C49585go0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59988k f27663d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8577a(C59988k kVar) {
            super(4);
            this.f27663d = kVar;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            int intValue = ((Number) obj).intValue();
            String str = (String) obj3;
            C49585go0 go02 = (C49585go0) obj4;
            C61926c.m72668M(new C8573o3(this.f27663d, ((Number) obj2).intValue(), intValue));
            return C13598b0.f38549a;
        }
    }

    public C8576p3(C59988k kVar) {
        this.f27662d = kVar;
    }

    public final void run() {
        C54795n5 k = this.f27662d.mo83048k();
        if (k != null) {
            k.mo75756x(2, new C8577a(this.f27662d));
        }
    }
}
