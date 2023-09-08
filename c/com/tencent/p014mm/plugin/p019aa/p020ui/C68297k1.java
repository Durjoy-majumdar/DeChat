package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.app.Dialog;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import lp3.C88631d;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.aa.ui.k1 */
public class C68297k1 implements C88631d.C76721a {

    /* renamed from: a */
    public final /* synthetic */ PaylistAAUI f196317a;

    public C68297k1(PaylistAAUI paylistAAUI) {
        this.f196317a = paylistAAUI;
    }

    /* renamed from: a */
    public void mo1720a(Object obj) {
        Log.m105925i("MicroMsg.Aa.PaylistAAUI", "close pay list failed: %s", obj);
        this.f196317a.hideLoading();
        Dialog dialog = this.f196317a.f196252n;
        if (dialog != null && dialog.isShowing()) {
            this.f196317a.f196252n.dismiss();
        }
        if (obj instanceof String) {
            C76701a.makeText((Context) this.f196317a, (CharSequence) obj.toString(), 1).show();
        } else {
            C76701a.makeText((Context) this.f196317a, (int) C0966R.string.bfl, 1).show();
        }
    }
}
