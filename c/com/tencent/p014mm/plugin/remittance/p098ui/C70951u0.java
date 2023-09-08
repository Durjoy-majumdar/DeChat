package com.tencent.p014mm.plugin.remittance.p098ui;

import android.app.Dialog;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import lp3.C88631d;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.remittance.ui.u0 */
public class C70951u0 implements C88631d.C76721a {

    /* renamed from: a */
    public final /* synthetic */ Dialog f205397a;

    /* renamed from: b */
    public final /* synthetic */ RemittanceDetailUI f205398b;

    public C70951u0(RemittanceDetailUI remittanceDetailUI, Dialog dialog) {
        this.f205398b = remittanceDetailUI;
        this.f205397a = dialog;
    }

    /* renamed from: a */
    public void mo1720a(Object obj) {
        Dialog dialog = this.f205397a;
        if (dialog != null) {
            dialog.dismiss();
        }
        Log.m105925i("MicroMsg.RemittanceDetailUI", "fetch detail failed: %s", obj);
        if (obj != null) {
            C76701a.makeText((Context) this.f205398b, (CharSequence) obj instanceof String ? obj.toString() : this.f205398b.getString(C0966R.string.kxh), 1).show();
        }
    }
}
