package q53;

import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinRechargeView;
import gy3.C87412m;
import m53.C10762h;
import p53.C11831b0;

/* renamed from: q53.q2 */
public final class C12112q2 implements C10762h<Void> {

    /* renamed from: a */
    public final /* synthetic */ WeCoinRechargeView f35206a;

    public C12112q2(WeCoinRechargeView weCoinRechargeView) {
        this.f35206a = weCoinRechargeView;
    }

    /* renamed from: a */
    public void mo605a(int i, int i2, String str) {
        C11831b0 b0Var = this.f35206a.f21864d;
        if (b0Var != null) {
            b0Var.mo11722e3();
        } else {
            C87412m.m108603p("mViewModel");
            throw null;
        }
    }

    public void onSuccess(Object obj) {
        Void voidR = (Void) obj;
        C11831b0 b0Var = this.f35206a.f21864d;
        if (b0Var != null) {
            b0Var.mo11722e3();
        } else {
            C87412m.m108603p("mViewModel");
            throw null;
        }
    }
}
