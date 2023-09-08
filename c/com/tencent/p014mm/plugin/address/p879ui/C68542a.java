package com.tencent.p014mm.plugin.address.p879ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.address.ui.a */
public class C68542a implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ AddrEditView f196932d;

    public C68542a(AddrEditView addrEditView) {
        this.f196932d = addrEditView;
    }

    public void afterTextChanged(Editable editable) {
        boolean d = this.f196932d.mo94078d();
        AddrEditView addrEditView = this.f196932d;
        if (!(d == addrEditView.f196834w || addrEditView.f196819e == null)) {
            Log.m105918d("MicroMsg.AddrEditView", "View:" + this.f196932d.f196825n + ", editType:" + this.f196932d.f196828q + " inputValid change to " + d);
            AddrEditView addrEditView2 = this.f196932d;
            addrEditView2.f196834w = d;
            ((WalletAddAddressUI) addrEditView2.f196819e).mo174965H7();
        }
        AddrEditView addrEditView3 = this.f196932d;
        addrEditView3.mo94080f(addrEditView3.f196822h.isFocused());
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
