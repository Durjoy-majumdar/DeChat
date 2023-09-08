package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import cr3.C75283h;
import lp3.C88631d;
import nj3.C76879j;
import ob0.C117747y;
import te3.C78014xp3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.n2 */
public class C71813n2 implements C88631d.C76721a {

    /* renamed from: a */
    public final /* synthetic */ WalletLqtSaveFetchUI f208351a;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.n2$a */
    public class C71814a implements DialogInterface.OnClickListener {
        public C71814a(C71813n2 n2Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "fetch MMAlert Interrupt click");
        }
    }

    public C71813n2(WalletLqtSaveFetchUI walletLqtSaveFetchUI) {
        this.f208351a = walletLqtSaveFetchUI;
    }

    /* renamed from: a */
    public void mo1720a(Object obj) {
        WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f208351a;
        boolean z = false;
        walletLqtSaveFetchUI.f208172S0 = false;
        walletLqtSaveFetchUI.getClass();
        this.f208351a.hideLoading();
        if (obj != null) {
            boolean z2 = obj instanceof C78014xp3;
            if (z2) {
                C78014xp3 xp32 = (C78014xp3) obj;
                z = C75283h.m90311a(this.f208351a, (C117747y) null, 1000, xp32.f228521d, xp32.f228522e);
            }
            if (!z) {
                C76879j.m92749t(this.f208351a, obj instanceof String ? obj.toString() : z2 ? ((C78014xp3) obj).f228522e : this.f208351a.getString(C0966R.string.kxh), "", new C71814a(this));
            }
        }
    }
}
