package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.app.Dialog;
import com.tencent.p014mm.plugin.wallet.pwd.p122ui.WalletUniversalPayOrderUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import hp3.C87581a;
import ob0.C89132b;
import te3.C51073r83;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.m0 */
public class C57509m0 implements C87581a<Object, C89132b.C89134c<C51073r83>> {

    /* renamed from: a */
    public final /* synthetic */ WalletUniversalPayOrderUI f164744a;

    public C57509m0(WalletUniversalPayOrderUI walletUniversalPayOrderUI) {
        this.f164744a = walletUniversalPayOrderUI;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.WalletUniversalPayOrderUI", "errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        Dialog dialog = this.f164744a.f164724q;
        if (dialog != null) {
            dialog.dismiss();
        }
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C51073r83 r832 = (C51073r83) cVar.f256796d;
            Log.m105925i("MicroMsg.WalletUniversalPayOrderUI", "retcode: %s, retmsg: %s", Integer.valueOf(r832.f140761d), ((C51073r83) cVar.f256796d).f140762e);
            if (r832.f140761d == 0) {
                WalletUniversalPayOrderUI.C57497c cVar2 = this.f164744a.f164715e;
                cVar2.f164728e = r832.f140763f;
                cVar2.notifyDataSetChanged();
                this.f164744a.setResult(-1);
                return null;
            }
            C75228t.m90210C(r832.f140762e);
            this.f164744a.f164721n.setCheck(false);
            return null;
        }
        C75228t.m90209B(this.f164744a.getContext(), "");
        this.f164744a.f164721n.setCheck(false);
        return null;
    }
}
