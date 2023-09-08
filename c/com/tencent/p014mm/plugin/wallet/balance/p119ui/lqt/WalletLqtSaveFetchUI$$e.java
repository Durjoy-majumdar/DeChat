package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import java.util.LinkedList;
import k53.C76492a;
import qo3.C101218e0;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$e */
public class WalletLqtSaveFetchUI$$e implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ C76492a f208247a;

    /* renamed from: b */
    public final /* synthetic */ int f208248b;

    /* renamed from: c */
    public final /* synthetic */ String f208249c;

    /* renamed from: d */
    public final /* synthetic */ WalletLqtSaveFetchUI f208250d;

    public WalletLqtSaveFetchUI$$e(WalletLqtSaveFetchUI walletLqtSaveFetchUI, C76492a aVar, int i, String str) {
        this.f208250d = walletLqtSaveFetchUI;
        this.f208247a = aVar;
        this.f208248b = i;
        this.f208249c = str;
    }

    /* renamed from: a */
    public void mo2001a() {
        if (this.f208247a != null) {
            WalletLqtSaveFetchUI.m84234H7(this.f208250d, this.f208248b);
            this.f208247a.mo106728c();
            if (this.f208247a.f223933m < ((LinkedList) this.f208250d.f208219y0).size()) {
                Bankcard bankcard = (Bankcard) ((LinkedList) this.f208250d.f208219y0).get(this.f208247a.f223933m);
                WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f208250d;
                walletLqtSaveFetchUI.f208181X = bankcard.field_bindSerial;
                walletLqtSaveFetchUI.f208183Y = bankcard;
                walletLqtSaveFetchUI.mo98979R7(false);
                WalletLqtSaveFetchUI walletLqtSaveFetchUI2 = this.f208250d;
                if (walletLqtSaveFetchUI2.f208173T != 2) {
                    if (walletLqtSaveFetchUI2.f208158G && !bankcard.mo99388n2()) {
                        WalletLqtSaveFetchUI.m84235I7(this.f208250d);
                    }
                    WalletLqtSaveFetchUI walletLqtSaveFetchUI3 = this.f208250d;
                    walletLqtSaveFetchUI3.mo98990c8(walletLqtSaveFetchUI3.f208199i.getText(), false);
                } else if (TextUtils.isEmpty(this.f208249c) || bankcard.mo99388n2()) {
                    this.f208250d.f208199i.mo105071c();
                } else {
                    this.f208250d.f208199i.setText(this.f208249c);
                    this.f208250d.f208199i.getContentEt().requestFocus();
                    this.f208250d.showWcKb();
                }
            }
        }
    }
}
