package com.tencent.p014mm.p136ui.base;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.ui.base.b */
public class C6757b implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ MMFormMobileInputView f24209d;

    public C6757b(MMFormMobileInputView mMFormMobileInputView) {
        this.f24209d = mMFormMobileInputView;
    }

    public void afterTextChanged(Editable editable) {
        String obj = this.f24209d.f24184e.getText().toString();
        if (Util.isNullOrNil(obj)) {
            this.f24209d.f24184e.setText("+");
            EditText editText = this.f24209d.f24184e;
            editText.setSelection(editText.getText().toString().length());
        } else if (!obj.contains("+")) {
            this.f24209d.f24184e.setText("+" + obj);
            EditText editText2 = this.f24209d.f24184e;
            editText2.setSelection(editText2.getText().toString().length());
        } else if (obj.length() > 1) {
            String substring = obj.substring(1);
            if (substring.length() > 4) {
                this.f24209d.f24184e.setText(substring.substring(0, 4));
                return;
            }
        }
        this.f24209d.getClass();
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
