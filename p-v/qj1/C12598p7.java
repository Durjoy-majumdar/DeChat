package qj1;

import cj1.C54795n5;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qj1.p7 */
public final class C12598p7 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12282d7 f36124d;

    /* renamed from: e */
    public final /* synthetic */ long f36125e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12598p7(C12282d7 d7Var, long j) {
        super(0);
        this.f36124d = d7Var;
        this.f36125e = j;
    }

    public Object invoke() {
        String str = this.f36124d.f35417r;
        Log.m105924i(str, "setBalance: balance:" + this.f36125e);
        long j = this.f36125e;
        if (j < 0) {
            String str2 = this.f36124d.f35417r;
            Log.m105924i(str2, "setBalance: invalid balance:" + this.f36125e);
            C12282d7 d7Var = this.f36124d;
            C54795n5 D0 = d7Var.mo14476D0();
            Long valueOf = D0 != null ? Long.valueOf(D0.mo75718V()) : null;
            String str3 = d7Var.f35417r;
            Log.m105924i(str3, "getBalanceFromCache: balance:" + valueOf);
            if (valueOf != null) {
                valueOf.longValue();
                if (valueOf.longValue() >= 0) {
                    d7Var.f35386B.setText(String.valueOf(valueOf));
                    if (!d7Var.f35392H) {
                        d7Var.f35392H = true;
                        d7Var.mo11993m1();
                    }
                }
            }
        } else {
            this.f36124d.f35386B.setText(String.valueOf(j));
            C12282d7 d7Var2 = this.f36124d;
            if (!d7Var2.f35392H) {
                d7Var2.f35392H = true;
                d7Var2.mo11993m1();
            }
        }
        return C13598b0.f38549a;
    }
}
