package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.h */
public class C70562h implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ MobileRemittanceUI f204023d;

    public C70562h(MobileRemittanceUI mobileRemittanceUI) {
        this.f204023d = mobileRemittanceUI;
    }

    public void afterTextChanged(Editable editable) {
        double d = Util.getDouble(editable.toString(), 0.0d);
        if (!this.f204023d.f203945E.mo105094l() || d < 0.01d) {
            this.f204023d.f203983w.mo104738c(false);
        } else {
            this.f204023d.f203983w.mo104738c(true);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
