package com.tencent.p014mm.plugin.address.p879ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.address.ui.b */
public class C68543b implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ InvoiceEditView f196933d;

    public C68543b(InvoiceEditView invoiceEditView) {
        this.f196933d = invoiceEditView;
    }

    public void afterTextChanged(Editable editable) {
        InvoiceEditView invoiceEditView = this.f196933d;
        if (invoiceEditView.f196851q == 5 && invoiceEditView.f196850p != editable.toString().length()) {
            this.f196933d.f196850p = editable.toString().length();
            this.f196933d.setBankNumberValStr(editable.toString());
        }
        boolean b = this.f196933d.mo94100b();
        InvoiceEditView invoiceEditView2 = this.f196933d;
        if (!(b == invoiceEditView2.f196858x || invoiceEditView2.f196842e == null)) {
            Log.m105918d("MicroMsg.InvoiceEditView", "View:" + this.f196933d.f196848n + ", editType:" + this.f196933d.f196851q + " inputValid change to " + b);
            InvoiceEditView invoiceEditView3 = this.f196933d;
            invoiceEditView3.f196858x = b;
            ((AddInvoiceUI) invoiceEditView3.f196842e).mo94067H7();
        }
        InvoiceEditView invoiceEditView4 = this.f196933d;
        boolean z = invoiceEditView4.f196841d;
        if ((!z || invoiceEditView4.f196858x) && z && invoiceEditView4.f196858x) {
            invoiceEditView4.f196845h.setTextColor(invoiceEditView4.getResources().getColor(C0966R.color.a7f));
        }
        InvoiceEditView invoiceEditView5 = this.f196933d;
        invoiceEditView5.mo94102d(invoiceEditView5.f196845h.isFocused());
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
