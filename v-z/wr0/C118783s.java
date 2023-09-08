package wr0;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.AppBrandIDCardVerifyPwdFrag;

/* renamed from: wr0.s */
public class C118783s implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ AppBrandIDCardVerifyPwdFrag f355369d;

    public C118783s(AppBrandIDCardVerifyPwdFrag appBrandIDCardVerifyPwdFrag) {
        this.f355369d = appBrandIDCardVerifyPwdFrag;
    }

    public void afterTextChanged(Editable editable) {
        if (this.f355369d.f345477q.getText().toString().length() > 0) {
            this.f355369d.f345476p.setEnabled(true);
        } else {
            this.f355369d.f345476p.setEnabled(false);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
