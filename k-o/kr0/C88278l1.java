package kr0;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: kr0.l1 */
public final class C88278l1 extends C87413o implements C32224a<AppBrandRuntime> {

    /* renamed from: d */
    public final /* synthetic */ C88279m1 f255185d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88278l1(C88279m1 m1Var) {
        super(0);
        this.f255185d = m1Var;
    }

    public Object invoke() {
        C81925i2 i2Var = this.f255185d.f255186a;
        if (i2Var != null) {
            return i2Var.getRuntime();
        }
        return null;
    }
}
