package v60;

import gy3.C24560g0;
import gy3.C87412m;
import rx3.C13598b0;
import u60.C65220d;
import u60.C65222f;

/* renamed from: v60.e */
public final class C102155e {

    /* renamed from: a */
    public static final C102155e f300813a = new C102155e();

    /* renamed from: b */
    public static volatile C65222f<C65220d> f300814b;

    /* renamed from: a */
    public final C65222f<C65220d> mo141704a() {
        if (f300814b == null) {
            synchronized (C24560g0.m30725a(C65222f.class)) {
                f300814b = new C65222f<>(new C102156f(new C102152a(Integer.MAX_VALUE, Integer.MAX_VALUE), new C102157g(3, 5), new C102157g(3, 5), new C102157g(3, 5), 3, "imageLoader"));
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        C65222f<C65220d> fVar = f300814b;
        C87412m.m108591d(fVar);
        return fVar;
    }
}
