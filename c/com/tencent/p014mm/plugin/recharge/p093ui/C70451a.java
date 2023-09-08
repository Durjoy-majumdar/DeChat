package com.tencent.p014mm.plugin.recharge.p093ui;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.tencent.mm.plugin.recharge.ui.a */
public class C70451a implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ MallEditText f203606d;

    public C70451a(MallEditText mallEditText) {
        this.f203606d = mallEditText;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String charSequence2 = charSequence.toString();
        int selectionStart = this.f203606d.f203484g.getSelectionStart();
        String str = "";
        if (charSequence2 != null) {
            StringBuilder sb = new StringBuilder(charSequence2.replaceAll(" ", str));
            int length = sb.length();
            if (length >= 4) {
                sb.insert(3, ' ');
            }
            if (length >= 8) {
                sb.insert(8, ' ');
            }
            str = sb.toString();
            int length2 = str.length();
            MallEditText mallEditText = this.f203606d;
            int i4 = mallEditText.f203480A;
            if (length2 > i4) {
                if ((selectionStart == 4 || selectionStart == 9) && i3 == 1) {
                    selectionStart++;
                } else if ((selectionStart == 4 || selectionStart == 9) && i3 > 1) {
                    selectionStart += i3;
                }
            } else if (length2 < i4 && (selectionStart == 4 || selectionStart == 9)) {
                selectionStart--;
            }
            mallEditText.f203480A = length2;
        }
        if (!charSequence2.equals(str)) {
            this.f203606d.f203484g.setText(str);
            MallEditText mallEditText2 = this.f203606d;
            int i5 = mallEditText2.f203480A;
            if (selectionStart < i5) {
                mallEditText2.f203484g.setSelection(selectionStart);
            } else {
                mallEditText2.f203484g.setSelection(i5);
            }
        } else {
            this.f203606d.mo97004b();
        }
    }
}
