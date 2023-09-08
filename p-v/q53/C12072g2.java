package q53;

import android.view.View;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinRechargeView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: q53.g2 */
public final class C12072g2<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ WeCoinRechargeView f35156d;

    public C12072g2(WeCoinRechargeView weCoinRechargeView) {
        this.f35156d = weCoinRechargeView;
    }

    public void onChanged(Object obj) {
        String str = (String) obj;
        WeCoinRechargeView weCoinRechargeView = this.f35156d;
        int i = WeCoinRechargeView.f21863u;
        weCoinRechargeView.getClass();
        Log.m105924i("MicroMsg.WeCoinRechargeView", "updateRightOptionMenu: [url] " + str);
        weCoinRechargeView.removeAllOptionMenu();
        if (str != null) {
            String string = weCoinRechargeView.getString(C0966R.string.ljb);
            C87412m.m108593f(string, "getString(R.string.wecoin_balance_option_detail)");
            weCoinRechargeView.addTextOptionMenu(0, string, new C12125u2(weCoinRechargeView, new C12129v2(weCoinRechargeView, str)), (View.OnLongClickListener) null, MMActivityController.C73075r.TRANSPARENT_BG_BLACK_TEXT);
        }
    }
}
