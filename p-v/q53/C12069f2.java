package q53;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinRechargeView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: q53.f2 */
public final class C12069f2<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ WeCoinRechargeView f35153d;

    public C12069f2(WeCoinRechargeView weCoinRechargeView) {
        this.f35153d = weCoinRechargeView;
    }

    public void onChanged(Object obj) {
        Long l = (Long) obj;
        WeCoinRechargeView weCoinRechargeView = this.f35153d;
        int i = WeCoinRechargeView.f21863u;
        weCoinRechargeView.getClass();
        Log.m105924i("MicroMsg.WeCoinRechargeView", "updateTotalBalance: [blance] " + l);
        TextView textView = weCoinRechargeView.f21866f;
        if (textView != null) {
            textView.setVisibility(0);
            LinearLayout linearLayout = weCoinRechargeView.f21865e;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                long longValue = l != null ? l.longValue() : 0;
                if (longValue > 0) {
                    TextView textView2 = weCoinRechargeView.f21874q;
                    if (textView2 != null) {
                        textView2.setText("" + longValue);
                        TextView textView3 = weCoinRechargeView.f21866f;
                        if (textView3 != null) {
                            textView3.setVisibility(8);
                            LinearLayout linearLayout2 = weCoinRechargeView.f21865e;
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(0);
                            } else {
                                C87412m.m108603p("mTotalBalanceLl");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("mNoBalanceTipsTv");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("mWeCoinBalanceView");
                        throw null;
                    }
                }
            } else {
                C87412m.m108603p("mTotalBalanceLl");
                throw null;
            }
        } else {
            C87412m.m108603p("mNoBalanceTipsTv");
            throw null;
        }
    }
}
