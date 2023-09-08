package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.app.Dialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import hp3.C87581a;
import ob0.C89132b;
import te3.bm4;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.g0 */
public class C57499g0 implements C87581a<Object, C89132b.C89134c<bm4>> {

    /* renamed from: a */
    public final /* synthetic */ int f164732a;

    /* renamed from: b */
    public final /* synthetic */ int f164733b;

    /* renamed from: c */
    public final /* synthetic */ WalletUniversalPayOrderUI f164734c;

    public C57499g0(WalletUniversalPayOrderUI walletUniversalPayOrderUI, int i, int i2) {
        this.f164734c = walletUniversalPayOrderUI;
        this.f164732a = i;
        this.f164733b = i2;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.WalletUniversalPayOrderUI", "errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        Dialog dialog = this.f164734c.f164724q;
        if (dialog != null) {
            dialog.dismiss();
        }
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            bm4 bm4 = (bm4) cVar.f256796d;
            Log.m105925i("MicroMsg.WalletUniversalPayOrderUI", "retcode: %s, retmsg: %s", Integer.valueOf(bm4.f131209d), ((bm4) cVar.f256796d).f131210e);
            if (bm4.f131209d == 0) {
                this.f164734c.setResult(-1);
                return null;
            }
            C75228t.m90210C(bm4.f131210e);
            this.f164734c.f164715e.mo81250a(this.f164732a, this.f164733b);
            this.f164734c.f164715e.notifyDataSetChanged();
            return null;
        }
        C75228t.m90209B(this.f164734c.getContext(), "");
        this.f164734c.f164715e.mo81250a(this.f164732a, this.f164733b);
        this.f164734c.f164715e.notifyDataSetChanged();
        return null;
    }
}
