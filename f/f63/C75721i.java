package f63;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.WcPayCashierDialog;
import com.tencent.p014mm.wallet_core.p137ui.formview.EditHintPasswdView;

/* renamed from: f63.i */
public class C75721i implements EditHintPasswdView.C75206c {

    /* renamed from: a */
    public final /* synthetic */ WcPayCashierDialog f222319a;

    public C75721i(WcPayCashierDialog wcPayCashierDialog) {
        this.f222319a = wcPayCashierDialog;
    }

    public void onInputValidChange(boolean z) {
        if (z) {
            WcPayCashierDialog wcPayCashierDialog = this.f222319a;
            String text = wcPayCashierDialog.f210443o.getText();
            WcPayCashierDialog wcPayCashierDialog2 = this.f222319a;
            WcPayCashierDialog.m84670d(wcPayCashierDialog, text, wcPayCashierDialog2.f210421L, wcPayCashierDialog2.f210423N);
            C115669n.INSTANCE.mo160131h(11977, 0, 0, 0, 0, 0, 0);
            return;
        }
        String obj = this.f222319a.f210443o.getEditText().getText().toString();
        WcPayCashierDialog wcPayCashierDialog3 = this.f222319a;
        EditHintPasswdView editHintPasswdView = wcPayCashierDialog3.f210443o;
        Context context = wcPayCashierDialog3.f210417H;
        editHintPasswdView.setContentDescription(context.getString(C0966R.string.lcu, new Object[]{obj.length() + ""}));
    }
}
