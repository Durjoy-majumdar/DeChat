package ch0;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.address.p879ui.InvoiceListUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ch0.e */
public class C67364e implements DialogInterface.OnClickListener {
    public C67364e(InvoiceListUI invoiceListUI) {
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.InvoiceListUI", "dismiss DisclaimerDailog...");
        dialogInterface.dismiss();
    }
}
