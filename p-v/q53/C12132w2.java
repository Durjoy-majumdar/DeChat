package q53;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinRechargeView;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p53.C11831b0;
import te3.C51310sx;

/* renamed from: q53.w2 */
public final class C12132w2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WeCoinRechargeView f35234d;

    /* renamed from: e */
    public final /* synthetic */ C51310sx f35235e;

    public C12132w2(WeCoinRechargeView weCoinRechargeView, C51310sx sxVar) {
        this.f35234d = weCoinRechargeView;
        this.f35235e = sxVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView$updateTopBannerView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C11831b0 b0Var = this.f35234d.f21864d;
        if (b0Var != null) {
            b0Var.mo11721d3(3);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f35235e.f141811e);
            C75228t.m90217J(this.f35234d, intent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView$updateTopBannerView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("mViewModel");
        throw null;
    }
}
