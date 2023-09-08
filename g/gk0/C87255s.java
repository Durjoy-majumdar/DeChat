package gk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C40469j0;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import fy3.C32224a;
import gk0.C87237e;
import gy3.C87412m;
import gy3.C87413o;
import ik0.C87744a;
import rx3.C13598b0;
import te3.C90429p4;
import zq0.C91891k0;

/* renamed from: gk0.s */
public final class C87255s extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C91891k0 f252969d;

    /* renamed from: e */
    public final /* synthetic */ C87744a f252970e;

    /* renamed from: f */
    public final /* synthetic */ C83780d1 f252971f;

    /* renamed from: g */
    public final /* synthetic */ C87237e.C87238a f252972g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87255s(C91891k0 k0Var, C87744a aVar, C83780d1 d1Var, C87237e.C87238a aVar2) {
        super(0);
        this.f252969d = k0Var;
        this.f252970e = aVar;
        this.f252971f = d1Var;
        this.f252972g = aVar2;
    }

    public Object invoke() {
        C90429p4 p4Var;
        C91891k0 k0Var = this.f252969d;
        String str = null;
        if (k0Var != null) {
            Long valueOf = Long.valueOf(k0Var.f263099i);
            C87412m.m108591d(valueOf);
            k0Var.f263099i = valueOf.longValue() + 1;
        }
        C87744a aVar = this.f252970e;
        C83780d1 d1Var = this.f252971f;
        C87237e.C87238a aVar2 = this.f252972g;
        if (!(aVar2 == null || (p4Var = aVar2.f252927b) == null)) {
            str = p4Var.f259730e;
        }
        if (str == null) {
            str = "";
        }
        aVar.mo121450n(d1Var, str, (C40469j0) d1Var.mo109668l(C40469j0.class)).mo121451o(this.f252971f);
        return C13598b0.f38549a;
    }
}
