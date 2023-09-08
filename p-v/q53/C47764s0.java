package q53;

import android.content.Intent;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinBalanceDetailView;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinEncashView;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.lang.ref.WeakReference;
import k20.C9556a;
import p53.C11844l;
import te3.C51506u80;

/* renamed from: q53.s0 */
public final class C47764s0<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ WeCoinEncashView f128283d;

    public C47764s0(WeCoinEncashView weCoinEncashView) {
        this.f128283d = weCoinEncashView;
    }

    public void onChanged(Object obj) {
        C51506u80 u802 = (C51506u80) obj;
        WeCoinEncashView weCoinEncashView = this.f128283d;
        WeakReference<C12075h1> weakReference = WeCoinEncashView.f117264v;
        weCoinEncashView.getClass();
        Log.m105924i("MicroMsg.WeCoinEncashView", "gotoWeCoinFetchResultUI, info " + u802);
        if (u802 != null) {
            weCoinEncashView.finish();
            C11844l lVar = weCoinEncashView.f117270i;
            if (lVar != null) {
                lVar.mo11729e3(21);
                Orders orders = new Orders();
                C11844l lVar2 = weCoinEncashView.f117270i;
                if (lVar2 != null) {
                    orders.f209566h = (double) lVar2.f34638j;
                    orders.f209568j = "CNY";
                    orders.f209534E = u802.f142657d;
                    orders.f209535F = u802.f142658e;
                    Intent intent = new Intent(weCoinEncashView.getContext(), WeCoinBalanceDetailView.class);
                    intent.putExtra("key_orders", orders);
                    C11844l lVar3 = weCoinEncashView.f117270i;
                    if (lVar3 != null) {
                        intent.putExtra("wecoin_fetch_result_kv_data", lVar3.f34641p);
                        intent.putExtra("WECOIN_ENCASH_RESULT_PAGE_INFO", u802.toByteArray());
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        C117292a.m165358d(weCoinEncashView, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView", "gotoWeCoinFetchResultUI", "(Lcom/tencent/mm/protocal/protobuf/EncashResultPageInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        weCoinEncashView.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(weCoinEncashView, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView", "gotoWeCoinFetchResultUI", "(Lcom/tencent/mm/protocal/protobuf/EncashResultPageInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } else {
                        C87412m.m108603p("mViewModel");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mViewModel");
                    throw null;
                }
            } else {
                C87412m.m108603p("mViewModel");
                throw null;
            }
        }
        C12075h1 h1Var = WeCoinEncashView.f117264v.get();
        if (h1Var != null) {
            h1Var.mo11384a(weCoinEncashView);
        }
    }
}
