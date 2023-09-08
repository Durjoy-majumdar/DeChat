package q53;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.wallet.wecoin.model.WecoinEncashKVData;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinIncomeDetailView;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinRechargeView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import p53.C11831b0;

/* renamed from: q53.t2 */
public final class C12122t2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WeCoinRechargeView f35220d;

    public C12122t2(WeCoinRechargeView weCoinRechargeView) {
        this.f35220d = weCoinRechargeView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView$updateIncomeBalance$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C11831b0 b0Var = this.f35220d.f21864d;
        if (b0Var != null) {
            b0Var.mo11721d3(7);
            Intent intent = new Intent(this.f35220d.getContext(), WeCoinIncomeDetailView.class);
            intent.putExtra("wecoin_enter_encash_business_kv_data", new WecoinEncashKVData(2, "", ""));
            WeCoinRechargeView weCoinRechargeView = this.f35220d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            WeCoinRechargeView weCoinRechargeView2 = weCoinRechargeView;
            C117292a.m165358d(weCoinRechargeView2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView$updateIncomeBalance$1$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            weCoinRechargeView.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(weCoinRechargeView2, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView$updateIncomeBalance$1$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView$updateIncomeBalance$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("mViewModel");
        throw null;
    }
}
