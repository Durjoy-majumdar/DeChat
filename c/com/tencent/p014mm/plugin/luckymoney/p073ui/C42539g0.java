package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.app.Dialog;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import lp3.C88631d;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.g0 */
public class C42539g0 implements C88631d.C76721a {

    /* renamed from: a */
    public final /* synthetic */ Dialog f115093a;

    /* renamed from: b */
    public final /* synthetic */ LuckyMoneyDetailUI f115094b;

    public C42539g0(LuckyMoneyDetailUI luckyMoneyDetailUI, Dialog dialog) {
        this.f115094b = luckyMoneyDetailUI;
        this.f115093a = dialog;
    }

    /* renamed from: a */
    public void mo1720a(Object obj) {
        Dialog dialog = this.f115093a;
        if (dialog != null) {
            dialog.dismiss();
        }
        Log.m105925i("MicroMsg.LuckyMoneyDetailUI", "fetch detail failed: %s", obj);
        if (obj != null) {
            C76701a.makeText((Context) this.f115094b.getContext(), (CharSequence) obj instanceof String ? obj.toString() : this.f115094b.getString(C0966R.string.kxh), 1).show();
        }
    }
}
