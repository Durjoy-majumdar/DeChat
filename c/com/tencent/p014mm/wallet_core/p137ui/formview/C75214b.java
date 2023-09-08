package com.tencent.p014mm.wallet_core.p137ui.formview;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;

/* renamed from: com.tencent.mm.wallet_core.ui.formview.b */
public class C75214b implements TextWatcher {

    /* renamed from: d */
    public boolean f221312d = false;

    /* renamed from: e */
    public final /* synthetic */ WalletFormView f221313e;

    public C75214b(WalletFormView walletFormView) {
        this.f221313e = walletFormView;
    }

    public void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        if (obj.startsWith(".")) {
            editable.insert(0, "0");
        } else {
            WalletFormView walletFormView = this.f221313e;
            if (walletFormView.f221275Q && WalletFormView.m90176e(obj, walletFormView.f221285g)) {
                return;
            }
        }
        boolean l = this.f221313e.mo105094l();
        WalletFormView.C75209c cVar = this.f221313e.f221288j;
        if (cVar != null) {
            if (l != this.f221312d) {
                cVar.onInputValidChange(l);
                this.f221312d = this.f221313e.mo105094l();
            }
            WalletFormView.C75209c cVar2 = this.f221313e.f221288j;
            if ((cVar2 instanceof WalletFormView.C75210d) && l) {
                ((WalletFormView.C75210d) cVar2).mo105141Z5(true);
            }
        }
        this.f221313e.mo105103p();
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        WalletFormView.C75211e eVar = this.f221313e.f221282d;
        if (eVar != null) {
            eVar.mo93874a(charSequence);
        }
    }
}
