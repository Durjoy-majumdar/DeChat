package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.text.Editable;
import android.text.TextWatcher;
import bl3.C39818r;
import com.tencent.p014mm.sdk.platformtools.Util;
import yf0.C79090a;

/* renamed from: com.tencent.mm.plugin.aa.ui.y */
public class C68352y implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ AARemittanceUI f196383d;

    public C68352y(AARemittanceUI aARemittanceUI) {
        this.f196383d = aARemittanceUI;
    }

    public void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        double d = Util.getDouble(obj, 0.0d);
        if (!this.f196383d.f195971o.mo105094l() || d < 0.01d) {
            this.f196383d.f195968i.mo104738c(false);
            ((C79090a) C39818r.f106831a.mo62444c(this.f196383d.getContext()).mo75002a(C79090a.class)).setValue("REMITTANCE_AA_MONEY_EDIT_FORM_VALUE_KEY", "");
            return;
        }
        this.f196383d.f195968i.mo104738c(true);
        ((C79090a) C39818r.f106831a.mo62444c(this.f196383d.getContext()).mo75002a(C79090a.class)).setValue("REMITTANCE_AA_MONEY_EDIT_FORM_VALUE_KEY", "¥" + obj);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
