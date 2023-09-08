package q53;

import android.content.DialogInterface;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinRechargeView;
import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C89779i0;

/* renamed from: q53.c2 */
public final class C12055c2<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ WeCoinRechargeView f35128d;

    public C12055c2(WeCoinRechargeView weCoinRechargeView) {
        this.f35128d = weCoinRechargeView;
    }

    public void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        WeCoinRechargeView weCoinRechargeView = this.f35128d;
        int i = WeCoinRechargeView.f21863u;
        weCoinRechargeView.getClass();
        Log.m105918d("MicroMsg.WeCoinRechargeView", "showProgressDialog: " + bool);
        if (bool != null) {
            C89779i0 i0Var = null;
            if (bool.booleanValue()) {
                i0Var = C89779i0.m112248e(weCoinRechargeView.getContext(), weCoinRechargeView.getContext().getString(C0966R.string.gas), false, 3, (DialogInterface.OnCancelListener) null);
            } else {
                C89779i0 i0Var2 = weCoinRechargeView.f21877t;
                if (i0Var2 != null) {
                    i0Var2.dismiss();
                }
            }
            weCoinRechargeView.f21877t = i0Var;
        }
    }
}
