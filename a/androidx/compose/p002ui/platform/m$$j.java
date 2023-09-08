package androidx.compose.p002ui.platform;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p246u1.C111075k;
import p246u1.C111078m;
import p246u1.C111090t;
import p658q1.C110301j;

/* renamed from: androidx.compose.ui.platform.m$$j */
public final class m$$j extends C87413o implements C32226l<C110301j, Boolean> {

    /* renamed from: d */
    public static final m$$j f306196d = new m$$j();

    public m$$j() {
        super(1);
    }

    public Object invoke(Object obj) {
        C111075k c;
        C110301j jVar = (C110301j) obj;
        C87412m.m108594g(jVar, LocaleUtil.ITALIAN);
        C111078m d = C111090t.m151491d(jVar);
        boolean z = true;
        if (d == null || (c = d.mo162827c()) == null || !c.f332625e) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
