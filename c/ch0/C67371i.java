package ch0;

import android.view.WindowManager;
import android.widget.PopupWindow;
import com.tencent.p014mm.plugin.address.p879ui.QrcodeInvoiceUI;

/* renamed from: ch0.i */
public class C67371i implements PopupWindow.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ QrcodeInvoiceUI f193231d;

    public C67371i(QrcodeInvoiceUI qrcodeInvoiceUI) {
        this.f193231d = qrcodeInvoiceUI;
    }

    public void onDismiss() {
        QrcodeInvoiceUI qrcodeInvoiceUI = this.f193231d;
        int i = QrcodeInvoiceUI.f196902x;
        WindowManager.LayoutParams attributes = qrcodeInvoiceUI.getWindow().getAttributes();
        float f = attributes.screenBrightness;
        float f2 = qrcodeInvoiceUI.f196917u;
        if (f > f2) {
            attributes.screenBrightness = f2;
            qrcodeInvoiceUI.getWindow().setAttributes(attributes);
        }
    }
}
