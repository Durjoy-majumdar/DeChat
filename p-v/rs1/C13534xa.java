package rs1;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gr1.C59670o2;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: rs1.xa */
public final class C13534xa extends C87413o implements C32226l<C59670o2, Boolean> {

    /* renamed from: d */
    public static final C13534xa f38373d = new C13534xa();

    public C13534xa() {
        super(1);
    }

    public Object invoke(Object obj) {
        C59670o2 o2Var = (C59670o2) obj;
        C87412m.m108594g(o2Var, LocaleUtil.ITALIAN);
        if (o2Var.getIsShouldPlayResume()) {
            o2Var.setIsShouldPlayResume(false);
        }
        return Boolean.FALSE;
    }
}
