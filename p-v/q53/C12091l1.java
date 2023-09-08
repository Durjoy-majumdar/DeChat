package q53;

import android.view.View;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinIncomeDetailView;
import gy3.C87412m;

/* renamed from: q53.l1 */
public final class C12091l1<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ WeCoinIncomeDetailView f35178d;

    public C12091l1(WeCoinIncomeDetailView weCoinIncomeDetailView) {
        this.f35178d = weCoinIncomeDetailView;
    }

    public void onChanged(Object obj) {
        String str = (String) obj;
        WeCoinIncomeDetailView weCoinIncomeDetailView = this.f35178d;
        int i = WeCoinIncomeDetailView.f21840A;
        weCoinIncomeDetailView.removeAllOptionMenu();
        if (str != null) {
            String string = weCoinIncomeDetailView.getString(C0966R.string.ljt);
            C87412m.m108593f(string, "getString(R.string.wecoi…tax_income_option_detail)");
            weCoinIncomeDetailView.addTextOptionMenu(0, string, new C12047a2(weCoinIncomeDetailView, str), (View.OnLongClickListener) null, MMActivityController.C73075r.TRANSPARENT_BG_BLACK_TEXT);
        }
    }
}
