package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.text.TextUtils;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import java.util.LinkedList;
import k53.C76492a;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$d */
public class WalletLqtSaveFetchUI$$d implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C76492a f208243d;

    /* renamed from: e */
    public final /* synthetic */ int f208244e;

    /* renamed from: f */
    public final /* synthetic */ String f208245f;

    /* renamed from: g */
    public final /* synthetic */ WalletLqtSaveFetchUI f208246g;

    public WalletLqtSaveFetchUI$$d(WalletLqtSaveFetchUI walletLqtSaveFetchUI, C76492a aVar, int i, String str) {
        this.f208246g = walletLqtSaveFetchUI;
        this.f208243d = aVar;
        this.f208244e = i;
        this.f208245f = str;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (this.f208243d != null) {
            WalletLqtSaveFetchUI.m84234H7(this.f208246g, this.f208244e);
            this.f208243d.mo106728c();
            if (i < ((LinkedList) this.f208246g.f208219y0).size()) {
                Bankcard bankcard = (Bankcard) ((LinkedList) this.f208246g.f208219y0).get(i);
                WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f208246g;
                walletLqtSaveFetchUI.f208181X = bankcard.field_bindSerial;
                walletLqtSaveFetchUI.f208183Y = bankcard;
                walletLqtSaveFetchUI.mo98979R7(false);
                WalletLqtSaveFetchUI walletLqtSaveFetchUI2 = this.f208246g;
                if (walletLqtSaveFetchUI2.f208173T != 2) {
                    if (walletLqtSaveFetchUI2.f208158G && !bankcard.mo99388n2()) {
                        WalletLqtSaveFetchUI.m84235I7(this.f208246g);
                    }
                    WalletLqtSaveFetchUI walletLqtSaveFetchUI3 = this.f208246g;
                    walletLqtSaveFetchUI3.mo98990c8(walletLqtSaveFetchUI3.f208199i.getText(), false);
                } else if (TextUtils.isEmpty(this.f208245f) || bankcard.mo99388n2()) {
                    this.f208246g.f208199i.mo105071c();
                } else {
                    this.f208246g.f208199i.setText(this.f208245f);
                    this.f208246g.f208199i.getContentEt().requestFocus();
                    this.f208246g.showWcKb();
                }
            }
        }
    }
}
