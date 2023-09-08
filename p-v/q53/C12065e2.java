package q53;

import android.widget.LinearLayout;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinRechargeView;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.WcPayMoneyLoadingView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import gy3.C87412m;
import java.math.RoundingMode;
import p53.C11831b0;
import p53.C11842j;

/* renamed from: q53.e2 */
public final class C12065e2<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ WeCoinRechargeView f35148d;

    public C12065e2(WeCoinRechargeView weCoinRechargeView) {
        this.f35148d = weCoinRechargeView;
    }

    public void onChanged(Object obj) {
        C11842j jVar = (C11842j) obj;
        WeCoinRechargeView weCoinRechargeView = this.f35148d;
        int i = WeCoinRechargeView.f21863u;
        weCoinRechargeView.getClass();
        Log.m105924i("MicroMsg.WeCoinRechargeView", "updateIncomeBalance: [blance] " + jVar);
        LinearLayout linearLayout = (LinearLayout) weCoinRechargeView.findViewById(C0966R.C0970id.loa);
        linearLayout.setVisibility(8);
        if (jVar != null && jVar.f34625a) {
            C11831b0 b0Var = weCoinRechargeView.f21864d;
            if (b0Var != null) {
                b0Var.mo11721d3(6);
                linearLayout.setOnClickListener(new C12122t2(weCoinRechargeView));
                String n = C75228t.m90260n(C75228t.m90248h("" + jVar.f34626b, "100", 2, RoundingMode.HALF_UP).doubleValue());
                WcPayMoneyLoadingView wcPayMoneyLoadingView = weCoinRechargeView.f21873p;
                if (wcPayMoneyLoadingView != null) {
                    wcPayMoneyLoadingView.mo99856e(n, false, false);
                    linearLayout.setVisibility(0);
                    return;
                }
                C87412m.m108603p("mBalanceView");
                throw null;
            }
            C87412m.m108603p("mViewModel");
            throw null;
        }
    }
}
