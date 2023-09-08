package f63;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.WcPayCashierDialog;

/* renamed from: f63.e */
public class C75717e implements DialogInterface.OnShowListener {

    /* renamed from: d */
    public final /* synthetic */ WcPayCashierDialog f222314d;

    public C75717e(WcPayCashierDialog wcPayCashierDialog) {
        this.f222314d = wcPayCashierDialog;
    }

    public void onShow(DialogInterface dialogInterface) {
        WcPayCashierDialog wcPayCashierDialog = this.f222314d;
        wcPayCashierDialog.mo99697g(false, 0, true, wcPayCashierDialog.f210423N);
        this.f222314d.setOnShowListener((DialogInterface.OnShowListener) null);
    }
}
