package ch0;

import android.view.View;
import com.tencent.p014mm.plugin.address.p879ui.QrcodeInvoiceUI;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76901s0;

/* renamed from: ch0.h */
public class C67370h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ QrcodeInvoiceUI f193230d;

    public C67370h(QrcodeInvoiceUI qrcodeInvoiceUI) {
        this.f193230d = qrcodeInvoiceUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/address/ui/QrcodeInvoiceUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C76901s0 s0Var = this.f193230d.f196914r;
        if (s0Var != null && s0Var.isShowing()) {
            this.f193230d.f196914r.dismiss();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/address/ui/QrcodeInvoiceUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
