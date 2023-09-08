package q53;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinRechargeView;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p53.C11831b0;

/* renamed from: q53.s2 */
public final class C12118s2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WeCoinRechargeView f35215d;

    /* renamed from: e */
    public final /* synthetic */ String f35216e;

    public C12118s2(WeCoinRechargeView weCoinRechargeView, String str) {
        this.f35215d = weCoinRechargeView;
        this.f35216e = str;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView$updateFaqView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C11831b0 b0Var = this.f35215d.f21864d;
        if (b0Var != null) {
            b0Var.mo11721d3(5);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f35216e);
            intent.putExtra("showShare", false);
            intent.putExtra(C74928u.C45093i.f122326r, true);
            C75228t.m90217J(this.f35215d.getContext(), intent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView$updateFaqView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("mViewModel");
        throw null;
    }
}
