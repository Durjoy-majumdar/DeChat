package q53;

import android.content.DialogInterface;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinIncomeDetailView;
import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C89779i0;

/* renamed from: q53.u1 */
public final class C12124u1<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ WeCoinIncomeDetailView f35222d;

    public C12124u1(WeCoinIncomeDetailView weCoinIncomeDetailView) {
        this.f35222d = weCoinIncomeDetailView;
    }

    public void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        WeCoinIncomeDetailView weCoinIncomeDetailView = this.f35222d;
        int i = WeCoinIncomeDetailView.f21840A;
        weCoinIncomeDetailView.getClass();
        Log.m105918d("MicroMsg.WeCoinIncomeDetailView", "showProgressDialog: " + bool);
        if (bool != null) {
            C89779i0 i0Var = null;
            if (bool.booleanValue()) {
                i0Var = C89779i0.m112248e(weCoinIncomeDetailView.getContext(), weCoinIncomeDetailView.getContext().getString(C0966R.string.gas), false, 3, (DialogInterface.OnCancelListener) null);
            } else {
                C89779i0 i0Var2 = weCoinIncomeDetailView.f21853s;
                if (i0Var2 != null) {
                    i0Var2.dismiss();
                }
            }
            weCoinIncomeDetailView.f21853s = i0Var;
        }
    }
}
