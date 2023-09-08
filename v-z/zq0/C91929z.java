package zq0;

import com.tencent.p014mm.C0966R;
import gy3.C87412m;

/* renamed from: zq0.z */
public final class C91929z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91921x f263191d;

    public C91929z(C91921x xVar) {
        this.f263191d = xVar;
    }

    public final void run() {
        C91893l0 l0Var = C91893l0.f263119a;
        C91891k0 a = l0Var.mo125719a(this.f263191d.f263175b);
        if (a != null) {
            C91891k0 a2 = l0Var.mo125719a(this.f263191d.f263175b);
            Long valueOf = a2 != null ? Long.valueOf(a2.f263104n) : null;
            C87412m.m108591d(valueOf);
            a.f263104n = valueOf.longValue() + 1;
        }
        C91921x xVar = this.f263191d;
        String string = xVar.f263174a.getString(C0966R.string.f7702op);
        C87412m.m108593f(string, "mContext.getString(R.str…er_send_verify_code_fail)");
        xVar.mo125752c(string);
    }
}
