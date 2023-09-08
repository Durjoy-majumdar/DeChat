package r04;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import n04.C25198y1;
import wy3.C22935h;
import wy3.C26443c1;
import wy3.C26446d1;

/* renamed from: r04.a */
public final class C22195a extends C87413o implements C32226l<C25198y1, Boolean> {

    /* renamed from: d */
    public static final C22195a f62831d = new C22195a();

    public C22195a() {
        super(1);
    }

    public Object invoke(Object obj) {
        C25198y1 y1Var = (C25198y1) obj;
        C87412m.m108594g(y1Var, LocaleUtil.ITALIAN);
        C22935h o = y1Var.mo37081K0().mo37094o();
        boolean z = false;
        if (o != null && (o instanceof C26446d1) && (((C26446d1) o).mo51892b() instanceof C26443c1)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
