package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.app.Dialog;
import android.text.SpannableString;
import com.tencent.p014mm.plugin.wallet.pwd.p122ui.WalletUniversalPayOrderUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import de3.C75355a0;
import hp3.C87581a;
import ob0.C89132b;
import te3.C50701ol3;
import te3.C64861yn2;
import te3.wk4;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.k0 */
public class C57507k0 implements C87581a<Object, C89132b.C89134c<C50701ol3>> {

    /* renamed from: a */
    public final /* synthetic */ WalletUniversalPayOrderUI f164743a;

    public C57507k0(WalletUniversalPayOrderUI walletUniversalPayOrderUI) {
        this.f164743a = walletUniversalPayOrderUI;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.WalletUniversalPayOrderUI", "errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        Dialog dialog = this.f164743a.f164724q;
        if (dialog != null) {
            dialog.dismiss();
        }
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C50701ol3 ol32 = (C50701ol3) cVar.f256796d;
            Log.m105925i("MicroMsg.WalletUniversalPayOrderUI", "retcode: %s, retmsg: %s", Integer.valueOf(ol32.f139251d), ((C50701ol3) cVar.f256796d).f139252e);
            if (ol32.f139251d == 0) {
                wk4 wk4 = ol32.f139253f;
                WalletUniversalPayOrderUI walletUniversalPayOrderUI = this.f164743a;
                walletUniversalPayOrderUI.getClass();
                if (!Util.isNullOrNil(wk4.f186134d)) {
                    walletUniversalPayOrderUI.f164718h.setText(wk4.f186134d);
                }
                if (!Util.isNullOrNil(wk4.f186135e)) {
                    walletUniversalPayOrderUI.f164719i.setText(wk4.f186135e);
                }
                if (!Util.isNullOrNil(wk4.f186136f)) {
                    walletUniversalPayOrderUI.f164720j.setText(wk4.f186136f);
                }
                if (!Util.isNullOrNil(wk4.f186137g)) {
                    walletUniversalPayOrderUI.f164722o.setText(wk4.f186137g);
                }
                walletUniversalPayOrderUI.f164721n.setCheck(wk4.f186140j == 1);
                walletUniversalPayOrderUI.f164721n.setSwitchListener(new C57500h0(walletUniversalPayOrderUI, wk4));
                C64861yn2 yn22 = wk4.f186138h;
                if (yn22 == null || Util.isNullOrNil(yn22.f186577d)) {
                    walletUniversalPayOrderUI.f164723p.setVisibility(8);
                } else {
                    C72476y0 y0Var = new C72476y0(2, (C72476y0.C72477a) new C57505i0(walletUniversalPayOrderUI, wk4));
                    SpannableString spannableString = new SpannableString(wk4.f186138h.f186577d);
                    spannableString.setSpan(y0Var, 0, spannableString.length(), 18);
                    walletUniversalPayOrderUI.f164723p.setOnTouchListener(new C75355a0(walletUniversalPayOrderUI.getContext()));
                    walletUniversalPayOrderUI.f164723p.setClickable(true);
                    walletUniversalPayOrderUI.f164723p.setText(spannableString);
                    walletUniversalPayOrderUI.f164723p.setVisibility(0);
                }
                WalletUniversalPayOrderUI.C57497c cVar2 = this.f164743a.f164715e;
                cVar2.f164728e = wk4.f186139i;
                cVar2.notifyDataSetChanged();
                return null;
            }
            C75228t.m90210C(ol32.f139252e);
            return null;
        }
        C75228t.m90209B(this.f164743a.getContext(), "");
        return null;
    }
}
