package com.tencent.p014mm.plugin.mall.p075ui;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.autogen.events.WalletGetBulletinEvent;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import te3.C77933g43;

/* renamed from: com.tencent.mm.plugin.mall.ui.d0 */
public class C69784d0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WalletGetBulletinEvent f201388d;

    /* renamed from: e */
    public final /* synthetic */ MallWalletUI f201389e;

    public C69784d0(MallWalletUI mallWalletUI, WalletGetBulletinEvent walletGetBulletinEvent) {
        this.f201389e = mallWalletUI;
        this.f201388d = walletGetBulletinEvent;
    }

    public void run() {
        C77933g43 g432;
        WalletGetBulletinEvent.C28848b bVar = this.f201388d.f79043e;
        if (bVar.f79049d == 2 && (g432 = bVar.f79050e) != null) {
            this.f201389e.f115144e.setBannerData(g432);
        } else if (!Util.isNullOrNil(bVar.f79046a)) {
            TextView textView = this.f201389e.f115143d;
            WalletGetBulletinEvent.C28848b bVar2 = this.f201388d.f79043e;
            C75228t.m90247g0((View) null, textView, bVar2.f79046a, bVar2.f79047b, bVar2.f79048c);
        }
    }
}
