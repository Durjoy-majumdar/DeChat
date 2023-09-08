package fz3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import oz3.C25404v;
import sx3.C110818d0;
import wy3.C26436b;
import wy3.C26516w;

/* renamed from: fz3.i */
public final class C20747i extends C87413o implements C32226l<C26436b, Boolean> {

    /* renamed from: d */
    public static final C20747i f58636d = new C20747i();

    public C20747i() {
        super(1);
    }

    public Object invoke(Object obj) {
        boolean z;
        C26436b bVar = (C26436b) obj;
        C87412m.m108594g(bVar, LocaleUtil.ITALIAN);
        if (bVar instanceof C26516w) {
            C20745h hVar = C20745h.f58634m;
            if (C110818d0.m150903D(C20759m0.f58655g, C25404v.m32596b(bVar))) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
