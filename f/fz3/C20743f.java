package fz3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import oz3.C25404v;
import wy3.C26436b;
import wy3.C26520x0;

/* renamed from: fz3.f */
public final class C20743f extends C87413o implements C32226l<C26436b, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C26520x0 f58632d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20743f(C26520x0 x0Var) {
        super(1);
        this.f58632d = x0Var;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g((C26436b) obj, LocaleUtil.ITALIAN);
        return Boolean.valueOf(C20759m0.f58658j.containsKey(C25404v.m32596b(this.f58632d)));
    }
}
