package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.tencent.p014mm.plugin.ipcall.p065ui.C105394b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import t12.C13818a;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.i */
public class C105418i implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ C105394b f313420d;

    public C105418i(C105394b bVar) {
        this.f313420d = bVar;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String trimPhoneNumber = Util.trimPhoneNumber(charSequence.toString());
        if (trimPhoneNumber.contains(" ")) {
            trimPhoneNumber = trimPhoneNumber.replace(" ", "");
            this.f313420d.f313339d.setText(Util.filterNumber(trimPhoneNumber));
        } else if ((!this.f313420d.f313360y.equals(trimPhoneNumber) || i3 > 0) && Util.isNullOrNil(trimPhoneNumber)) {
            C105394b bVar = this.f313420d;
            bVar.f313360y = trimPhoneNumber;
            bVar.f313339d.setText("");
        }
        if (C13818a.m13118n(trimPhoneNumber)) {
            String b = C13818a.m13106b(trimPhoneNumber);
            if (!Util.isNullOrNil(b)) {
                TextView textView = this.f313420d.f313338c;
                textView.setText("+" + b);
                this.f313420d.f313339d.setText(C13818a.m13107c(trimPhoneNumber));
            }
        } else if (!trimPhoneNumber.equals(this.f313420d.f313360y)) {
            C105394b bVar2 = this.f313420d;
            bVar2.f313360y = trimPhoneNumber;
            bVar2.f313339d.setText(trimPhoneNumber);
            if (Util.isNullOrNil(this.f313420d.f313338c.getText().toString())) {
                TextView textView2 = this.f313420d.f313338c;
                textView2.setText("+" + C13818a.m13113i());
            }
        }
        C105394b bVar3 = this.f313420d;
        C105394b.C56829c cVar = bVar3.f313336a;
        if (cVar != null) {
            String obj = bVar3.f313339d.getText().toString();
            IPCallDialUI iPCallDialUI = (IPCallDialUI) cVar;
            Log.m105925i("MicroMsg.IPCallDialUI", "onModifyPhoneNumberByUser:phoneNumber:%s,mPhoneNumber:%s", obj, iPCallDialUI.f313298q);
            int i4 = iPCallDialUI.f313304w;
            if (i4 != 2 && i4 != -1 && !iPCallDialUI.f313298q.equals(obj)) {
                Log.m105924i("MicroMsg.IPCallDialUI", "modifyCountryCodeByUsder");
                iPCallDialUI.f313304w = 2;
                if (iPCallDialUI.f313303v == 1) {
                    iPCallDialUI.f313303v = 2;
                } else {
                    iPCallDialUI.f313303v = 4;
                }
            }
        }
    }
}
