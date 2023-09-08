package androidx.compose.p002ui.platform;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p246u1.C111074j;
import p246u1.C111075k;
import p246u1.C111078m;
import p246u1.C111090t;
import p658q1.C110301j;

/* renamed from: androidx.compose.ui.platform.p */
public final class C103674p extends C87413o implements C32226l<C110301j, Boolean> {

    /* renamed from: d */
    public static final C103674p f306231d = new C103674p();

    public C103674p() {
        super(1);
    }

    public Object invoke(Object obj) {
        C110301j jVar = (C110301j) obj;
        C87412m.m108594g(jVar, LocaleUtil.ITALIAN);
        C111078m d = C111090t.m151491d(jVar);
        C111075k c = d != null ? d.mo162827c() : null;
        boolean z = false;
        if ((c != null && c.f332625e) && c.mo162823i(C111074j.f332615h)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
