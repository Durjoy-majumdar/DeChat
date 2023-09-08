package fz3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import d04.C24442a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import oz3.C25404v;
import sx3.C110818d0;
import vz3.C22830f;
import wy3.C26436b;
import wy3.C26516w;

/* renamed from: fz3.h */
public final class C20745h extends C20759m0 {

    /* renamed from: m */
    public static final C20745h f58634m = new C20745h();

    /* renamed from: fz3.h$a */
    public static final class C20746a extends C87413o implements C32226l<C26436b, Boolean> {

        /* renamed from: d */
        public static final C20746a f58635d = new C20746a();

        public C20746a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C26436b bVar = (C26436b) obj;
            C87412m.m108594g(bVar, LocaleUtil.ITALIAN);
            C20745h hVar = C20745h.f58634m;
            return Boolean.valueOf(C110818d0.m150903D(C20759m0.f58655g, C25404v.m32596b(bVar)));
        }
    }

    /* renamed from: a */
    public static final C26516w m22700a(C26516w wVar) {
        C87412m.m108594g(wVar, "functionDescriptor");
        C20745h hVar = f58634m;
        C22830f name = wVar.getName();
        C87412m.m108593f(name, "functionDescriptor.name");
        if (!hVar.mo32446b(name)) {
            return null;
        }
        return (C26516w) C24442a.m30535b(wVar, false, C20746a.f58635d, 1, (Object) null);
    }

    /* renamed from: b */
    public final boolean mo32446b(C22830f fVar) {
        C87412m.m108594g(fVar, "<this>");
        return C20759m0.f58654f.contains(fVar);
    }
}
