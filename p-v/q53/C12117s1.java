package q53;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinIncomeDetailView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: q53.s1 */
public final class C12117s1<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ WeCoinIncomeDetailView f35214d;

    public C12117s1(WeCoinIncomeDetailView weCoinIncomeDetailView) {
        this.f35214d = weCoinIncomeDetailView;
    }

    public void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        WeCoinIncomeDetailView weCoinIncomeDetailView = this.f35214d;
        int i = WeCoinIncomeDetailView.f21840A;
        weCoinIncomeDetailView.getClass();
        Log.m105918d("MicroMsg.WeCoinIncomeDetailView", "updateAuthored: " + bool);
        if (bool != null && bool.booleanValue()) {
            weCoinIncomeDetailView.mo6819I7();
        }
    }
}
