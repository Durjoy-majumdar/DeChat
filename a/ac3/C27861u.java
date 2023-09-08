package ac3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: ac3.u */
public final class C27861u extends C87413o implements C32226l<C27848d1, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ int f77000d;

    /* renamed from: e */
    public final /* synthetic */ int f77001e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27861u(int i, int i2) {
        super(1);
        this.f77000d = i;
        this.f77001e = i2;
    }

    public Object invoke(Object obj) {
        C27848d1 d1Var = (C27848d1) obj;
        C87412m.m108594g(d1Var, LocaleUtil.ITALIAN);
        return Boolean.valueOf(d1Var.f76975b == this.f77000d && d1Var.f76976c == this.f77001e);
    }
}
