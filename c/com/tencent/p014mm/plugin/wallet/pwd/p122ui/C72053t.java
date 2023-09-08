package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.t */
public class C72053t extends Preference {

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.t$a */
    public class C72054a extends C7089c0 {
        public C72054a() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            C72053t.this.f121276f.mo24588a((Preference) null);
        }
    }

    public C72053t(WalletPasswordSettingUI walletPasswordSettingUI, Context context) {
        super(context);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        if (this.f121276f != null) {
            view.setOnClickListener(new C72054a());
        }
    }
}
