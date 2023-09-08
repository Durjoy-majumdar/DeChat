package q53;

import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinRechargeView;
import gy3.C87412m;
import p53.C11828a;
import r53.C12953c;

/* renamed from: q53.i2 */
public final class C12080i2<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ WeCoinRechargeView f35164d;

    public C12080i2(WeCoinRechargeView weCoinRechargeView) {
        this.f35164d = weCoinRechargeView;
    }

    public void onChanged(Object obj) {
        WeCoinRechargeView weCoinRechargeView = this.f35164d;
        int i = WeCoinRechargeView.f21863u;
        AppCompatActivity context = weCoinRechargeView.getContext();
        C87412m.m108593f(context, "context");
        C12953c.m12395d(context, (C11828a) obj, (DialogInterface.OnClickListener) null);
    }
}
