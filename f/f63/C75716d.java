package f63;

import android.text.Layout;
import com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.WcPayCashierDetailItemLayout;

/* renamed from: f63.d */
public class C75716d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WcPayCashierDetailItemLayout f222313d;

    public C75716d(WcPayCashierDetailItemLayout wcPayCashierDetailItemLayout) {
        this.f222313d = wcPayCashierDetailItemLayout;
    }

    public void run() {
        Layout layout = this.f222313d.f210403f.getLayout();
        if (layout != null && layout.getLineCount() > 1) {
            this.f222313d.f210403f.setMaxWidth((int) layout.getLineWidth(0));
        }
    }
}
