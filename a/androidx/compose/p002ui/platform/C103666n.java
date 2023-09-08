package androidx.compose.p002ui.platform;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p246u1.C111075k;
import p246u1.C111078m;
import p246u1.C111090t;
import p658q1.C110301j;

/* renamed from: androidx.compose.ui.platform.n */
public final class C103666n extends C87413o implements C32226l<C110301j, Boolean> {

    /* renamed from: d */
    public static final C103666n f306217d = new C103666n();

    public C103666n() {
        super(1);
    }

    public Object invoke(Object obj) {
        C111075k c;
        C110301j jVar = (C110301j) obj;
        C87412m.m108594g(jVar, "parent");
        C111078m d = C111090t.m151491d(jVar);
        boolean z = true;
        if (d == null || (c = d.mo162827c()) == null || !c.f332625e) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
