package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI$$h */
public class MobileRemitNumberInputUI$$h implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ MobileRemitNumberInputUI f203901d;

    public MobileRemitNumberInputUI$$h(MobileRemitNumberInputUI mobileRemitNumberInputUI) {
        this.f203901d = mobileRemitNumberInputUI;
    }

    public void afterTextChanged(Editable editable) {
        if (this.f203901d.f203886j.getInputLength() > 0) {
            this.f203901d.f203887n.setEnabled(true);
        } else {
            this.f203901d.f203887n.setEnabled(false);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
