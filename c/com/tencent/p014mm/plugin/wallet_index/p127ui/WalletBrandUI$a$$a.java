package com.tencent.p014mm.plugin.wallet_index.p127ui;

import android.content.Intent;
import com.tencent.p014mm.plugin.wallet_index.p127ui.WalletBrandUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import ie3.C76324c;

/* renamed from: com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI$a$$a */
public final /* synthetic */ class WalletBrandUI$a$$a implements C76324c.C76326b {

    /* renamed from: a */
    public final /* synthetic */ WalletBrandUI.C72536a f211026a;

    public /* synthetic */ WalletBrandUI$a$$a(WalletBrandUI.C72536a aVar) {
        this.f211026a = aVar;
    }

    /* renamed from: a */
    public final void mo97424a(int i) {
        WalletBrandUI.C72536a aVar = this.f211026a;
        aVar.getClass();
        Log.m105925i("MicroMsg.WalletBrandUI", "hkcashier callback, retcode is %s", Integer.valueOf(i));
        Intent intent = new Intent();
        intent.putExtra("is_from_native", "1");
        if (i == 1) {
            WalletBrandUI.this.setResult(-1, intent);
        } else if (i == -1 || i == -2) {
            WalletBrandUI.this.setResult(0, intent);
        }
        WalletBrandUI.this.finish();
    }
}
