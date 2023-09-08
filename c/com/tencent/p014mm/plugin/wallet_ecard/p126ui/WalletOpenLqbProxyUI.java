package com.tencent.p014mm.plugin.wallet_ecard.p126ui;

import android.os.Bundle;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.C43337b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import nj3.C88989a;
import ob0.C117747y;
import yq3.C79148e;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.wallet_ecard.ui.WalletOpenLqbProxyUI */
public class WalletOpenLqbProxyUI extends WalletBaseUI {

    /* renamed from: d */
    public C43337b f210966d;

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentViewVisibility(4);
        this.f210966d = new C43337b(this);
        C79148e process = getProcess();
        if (process != null) {
            int i = getInput().getInt("key_open_scene", 0);
            String string = getInput().getString("key_open_extra_data");
            Log.m105925i("MicroMsg.WalletOpenLqbProxyUI", "WalletOpenLqbProxyUI onCreate, openScene: %s, extraData: %s", Integer.valueOf(i), string);
            if (i == 3) {
                getNetController().mo91271d(Integer.valueOf(i), string);
                return;
            }
            process.mo91259f(this, getInput());
            finish();
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
