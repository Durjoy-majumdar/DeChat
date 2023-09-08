package com.tencent.p014mm.plugin.wallet.bind.p120ui;

import android.view.MenuItem;
import b63.C67205s0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import java.util.ArrayList;
import nj3.C76879j;
import w43.C78513a;
import y43.C79029b0;

/* renamed from: com.tencent.mm.plugin.wallet.bind.ui.d */
public class C71885d implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletBankcardDetailUI f208523d;

    /* renamed from: com.tencent.mm.plugin.wallet.bind.ui.d$a */
    public class C71886a implements C76879j.C11180n {
        public C71886a() {
        }

        /* renamed from: j */
        public void mo782j(int i) {
            if (i == 0) {
                WalletBankcardDetailUI walletBankcardDetailUI = C71885d.this.f208523d;
                int i2 = WalletBankcardDetailUI.f208429n;
                walletBankcardDetailUI.getClass();
                Bankcard bankcard = walletBankcardDetailUI.f208430d;
                walletBankcardDetailUI.doSceneProgress(new C78513a(bankcard.field_bankcardType, bankcard.field_bindSerial), true);
            }
        }
    }

    public C71885d(WalletBankcardDetailUI walletBankcardDetailUI) {
        this.f208523d = walletBankcardDetailUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        ArrayList<Bankcard> h = C79029b0.vx0().wx0().mo91326h();
        if (h != null && h.size() > 1) {
            C67205s0 wx02 = C79029b0.vx0().wx0();
            String str = this.f208523d.f208430d.field_bindSerial;
            wx02.getClass();
        }
        ArrayList arrayList = new ArrayList();
        C76879j.m92737h(this.f208523d, (String) null, (String[]) arrayList.toArray(new String[arrayList.size()]), this.f208523d.getString(C0966R.string.kuh), false, new C71886a());
        return true;
    }
}
