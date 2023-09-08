package q53;

import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinRechargeView;
import gy3.C87412m;
import p53.C11831b0;
import qo3.C101218e0;

/* renamed from: q53.r2 */
public final class C12116r2 implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ WeCoinRechargeView f35212a;

    /* renamed from: b */
    public final /* synthetic */ C101218e0 f35213b;

    public C12116r2(WeCoinRechargeView weCoinRechargeView, C101218e0 e0Var) {
        this.f35212a = weCoinRechargeView;
        this.f35213b = e0Var;
    }

    /* renamed from: a */
    public final void mo2001a() {
        C11831b0 b0Var = this.f35212a.f21864d;
        if (b0Var != null) {
            b0Var.mo11721d3(10);
            this.f35213b.mo140680z();
            return;
        }
        C87412m.m108603p("mViewModel");
        throw null;
    }
}
