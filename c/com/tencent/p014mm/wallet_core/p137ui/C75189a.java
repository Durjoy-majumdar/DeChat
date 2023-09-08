package com.tencent.p014mm.wallet_core.p137ui;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.tencent.mm.wallet_core.ui.a */
public class C75189a implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ EditHintView f221223d;

    public C75189a(EditHintView editHintView) {
        this.f221223d = editHintView;
    }

    public void afterTextChanged(Editable editable) {
        boolean a = this.f221223d.mo104896a();
        EditHintView editHintView = this.f221223d;
        if (a != editHintView.f221166v) {
            editHintView.getClass();
        }
        this.f221223d.mo104897b();
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditHintView editHintView = this.f221223d;
        if (editHintView.f221145E == 4 && editHintView.mo104896a()) {
            EditHintView editHintView2 = this.f221223d;
            editHintView2.f221145E = 0;
            editHintView2.f221154g.ClearInput();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
