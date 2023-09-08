package q53;

import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinIncomeDetailView;
import gy3.C87412m;
import p53.C11828a;
import r53.C12953c;

/* renamed from: q53.r1 */
public final class C12115r1<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ WeCoinIncomeDetailView f35211d;

    public C12115r1(WeCoinIncomeDetailView weCoinIncomeDetailView) {
        this.f35211d = weCoinIncomeDetailView;
    }

    public void onChanged(Object obj) {
        WeCoinIncomeDetailView weCoinIncomeDetailView = this.f35211d;
        int i = WeCoinIncomeDetailView.f21840A;
        AppCompatActivity context = weCoinIncomeDetailView.getContext();
        C87412m.m108593f(context, "context");
        C12953c.m12395d(context, (C11828a) obj, (DialogInterface.OnClickListener) null);
    }
}
