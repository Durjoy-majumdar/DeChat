package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.os.Bundle;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import ep3.C97688c;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBasePresenterUI */
public abstract class WalletLqtBasePresenterUI extends WalletBaseUI {

    /* renamed from: d */
    public C97688c f207915d = new C97688c();

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return 0;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f207915d.mo136942d(getIntent(), this);
        this.isVKBFirstTimeShown = true;
    }

    public void onDestroy() {
        super.onDestroy();
        C97688c cVar = this.f207915d;
        cVar.f286535g.dead();
        cVar.mo136944f(4);
    }

    public void onPause() {
        super.onPause();
        this.f207915d.mo136944f(3);
    }

    public void onResume() {
        super.onResume();
        this.f207915d.mo136944f(2);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
