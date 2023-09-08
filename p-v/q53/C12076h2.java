package q53;

import android.widget.LinearLayout;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinRechargeView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: q53.h2 */
public final class C12076h2<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ WeCoinRechargeView f35160d;

    public C12076h2(WeCoinRechargeView weCoinRechargeView) {
        this.f35160d = weCoinRechargeView;
    }

    public void onChanged(Object obj) {
        String str = (String) obj;
        WeCoinRechargeView weCoinRechargeView = this.f35160d;
        int i = WeCoinRechargeView.f21863u;
        weCoinRechargeView.getClass();
        Log.m105924i("MicroMsg.WeCoinRechargeView", "updateFaqView: [url] " + str);
        if (str != null) {
            LinearLayout linearLayout = weCoinRechargeView.f21868h;
            if (linearLayout != null) {
                linearLayout.setOnClickListener(new C12118s2(weCoinRechargeView, str));
            } else {
                C87412m.m108603p("mFaqLinearLayout");
                throw null;
            }
        }
    }
}
