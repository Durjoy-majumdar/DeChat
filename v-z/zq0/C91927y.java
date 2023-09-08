package zq0;

import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import te3.C51625v04;

/* renamed from: zq0.y */
public final class C91927y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C51625v04 f263188d;

    /* renamed from: e */
    public final /* synthetic */ C91921x f263189e;

    public C91927y(C51625v04 v042, C91921x xVar) {
        this.f263188d = v042;
        this.f263189e = xVar;
    }

    public final void run() {
        int i = this.f263188d.f143227d;
        Long l = null;
        if (i == 0) {
            C91893l0 l0Var = C91893l0.f263119a;
            C91891k0 a = l0Var.mo125719a(this.f263189e.f263175b);
            if (a != null) {
                C91891k0 a2 = l0Var.mo125719a(this.f263189e.f263175b);
                if (a2 != null) {
                    l = Long.valueOf(a2.f263103m);
                }
                C87412m.m108591d(l);
                a.f263103m = l.longValue() + 1;
            }
        } else if (i == 1) {
            C91893l0 l0Var2 = C91893l0.f263119a;
            C91891k0 a3 = l0Var2.mo125719a(this.f263189e.f263175b);
            if (a3 != null) {
                C91891k0 a4 = l0Var2.mo125719a(this.f263189e.f263175b);
                if (a4 != null) {
                    l = Long.valueOf(a4.f263104n);
                }
                C87412m.m108591d(l);
                a3.f263104n = l.longValue() + 1;
            }
            C91921x xVar = this.f263189e;
            String string = xVar.f263174a.getString(C0966R.string.f7702op);
            C87412m.m108593f(string, "mContext.getString(R.str…er_send_verify_code_fail)");
            xVar.mo125752c(string);
        } else if (i == 2) {
            C91893l0 l0Var3 = C91893l0.f263119a;
            C91891k0 a5 = l0Var3.mo125719a(this.f263189e.f263175b);
            if (a5 != null) {
                C91891k0 a6 = l0Var3.mo125719a(this.f263189e.f263175b);
                if (a6 != null) {
                    l = Long.valueOf(a6.f263104n);
                }
                C87412m.m108591d(l);
                a5.f263104n = l.longValue() + 1;
            }
            C91921x xVar2 = this.f263189e;
            String string2 = xVar2.f263174a.getString(C0966R.string.f7703oq);
            C87412m.m108593f(string2, "mContext.getString(R.str…end_verify_code_frequent)");
            xVar2.mo125752c(string2);
        } else {
            C91893l0 l0Var4 = C91893l0.f263119a;
            C91891k0 a7 = l0Var4.mo125719a(this.f263189e.f263175b);
            if (a7 != null) {
                C91891k0 a8 = l0Var4.mo125719a(this.f263189e.f263175b);
                if (a8 != null) {
                    l = Long.valueOf(a8.f263104n);
                }
                C87412m.m108591d(l);
                a7.f263104n = l.longValue() + 1;
            }
            C91921x xVar3 = this.f263189e;
            String string3 = xVar3.f263174a.getString(C0966R.string.f7702op);
            C87412m.m108593f(string3, "mContext.getString(R.str…er_send_verify_code_fail)");
            xVar3.mo125752c(string3);
        }
    }
}
