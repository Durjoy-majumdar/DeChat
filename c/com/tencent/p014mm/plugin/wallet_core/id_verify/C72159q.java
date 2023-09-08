package com.tencent.p014mm.plugin.wallet_core.id_verify;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.q */
public class C72159q implements C0120a0<String> {

    /* renamed from: d */
    public final /* synthetic */ WcPayRealnameVerifyIdInputUI f209325d;

    public C72159q(WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI) {
        this.f209325d = wcPayRealnameVerifyIdInputUI;
    }

    public void onChanged(Object obj) {
        String str = (String) obj;
        if ("9999/12/31".equals(str)) {
            WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = this.f209325d;
            wcPayRealnameVerifyIdInputUI.f209187j.setText(wcPayRealnameVerifyIdInputUI.getString(C0966R.string.ldg));
            return;
        }
        this.f209325d.f209187j.setText(str);
    }
}
