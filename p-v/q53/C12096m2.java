package q53;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinRechargeView;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: q53.m2 */
public final class C12096m2 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ WeCoinRechargeView f35183d;

    public C12096m2(WeCoinRechargeView weCoinRechargeView) {
        this.f35183d = weCoinRechargeView;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107140d(1, this.f35183d.getResources().getColor(C0966R.color.a_0), this.f35183d.getString(C0966R.string.m0m));
    }
}
