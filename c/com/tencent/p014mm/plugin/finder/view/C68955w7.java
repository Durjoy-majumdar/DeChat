package com.tencent.p014mm.plugin.finder.view;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.Iterator;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.finder.view.w7 */
public final class C68955w7 implements TextWatcher {

    /* renamed from: d */
    public int f198156d;

    /* renamed from: e */
    public final /* synthetic */ SignatureEditText f198157e;

    public C68955w7(SignatureEditText signatureEditText) {
        this.f198157e = signatureEditText;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f198156d = charSequence != null ? charSequence.length() : 0;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String str;
        if (!this.f198157e.getAllowEmptyLine()) {
            SignatureEditText signatureEditText = this.f198157e;
            int i4 = 0;
            if ((charSequence != null ? charSequence.length() : 0) < this.f198156d) {
                int selectionEnd = signatureEditText.getSelectionEnd() - 1 > 0 ? signatureEditText.getSelectionEnd() : 0;
                Editable s = signatureEditText.getOriginText();
                if (selectionEnd < s.length()) {
                    Iterator<String> it = C112550d0.m153773I(s).iterator();
                    int i5 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            str = "";
                            break;
                        }
                        str = it.next();
                        if (i5 <= selectionEnd && selectionEnd <= str.length() + i5) {
                            break;
                        }
                        i5 += str.length() + 1;
                    }
                    if (i5 < s.length()) {
                        int length = str.length() + i5;
                        int length2 = s.length() - 1;
                        if (length > length2) {
                            length = length2;
                        }
                        if (C112550d0.m153799i0(str).toString().length() == 0) {
                            signatureEditText.setText(C112550d0.m153778N(signatureEditText.getOriginText(), i5, length + 1));
                            int i6 = i5 - 1;
                            if (i6 > 0) {
                                i4 = i6;
                            }
                            signatureEditText.setSelection(i4);
                        }
                    }
                }
            }
        }
    }
}
