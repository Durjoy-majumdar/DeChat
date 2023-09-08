package q53;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinRechargeView;
import fy3.C32224a;
import gy3.C87412m;
import p53.C11831b0;
import rx3.C13598b0;

/* renamed from: q53.u2 */
public final class C12125u2 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ WeCoinRechargeView f35223d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f35224e;

    public C12125u2(WeCoinRechargeView weCoinRechargeView, C32224a<C13598b0> aVar) {
        this.f35223d = weCoinRechargeView;
        this.f35224e = aVar;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C11831b0 b0Var = this.f35223d.f21864d;
        if (b0Var != null) {
            b0Var.mo11721d3(1);
            C115669n.INSTANCE.mo160131h(21658, 1);
            this.f35224e.invoke();
            return true;
        }
        C87412m.m108603p("mViewModel");
        throw null;
    }
}
