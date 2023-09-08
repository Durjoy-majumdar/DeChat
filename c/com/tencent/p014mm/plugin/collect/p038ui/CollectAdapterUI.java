package com.tencent.p014mm.plugin.collect.p038ui;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import ke3.C88144b;
import nj3.C88989a;
import ob0.C117747y;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.collect.ui.CollectAdapterUI */
public class CollectAdapterUI extends WalletBaseUI {
    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentViewVisibility(8);
        C86709a0.m107528h();
        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        Log.m105925i("MicroMsg.CollectAdapterUI", "walletRegion: %s", Integer.valueOf(intValue));
        if (intValue == 8) {
            C88144b.m109791i(this, "collect", ".ui.CollectHKMainUI", getIntent(), (Bundle) null);
        } else {
            boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_collect_qrcode_new_style_open_config, false);
            Log.m105925i("MicroMsg.CollectAdapterUI", "openNewStyleConfig ：%s ", Boolean.valueOf(wf));
            if (wf) {
                C88144b.m109791i(this, "collect", ".ui.WalletCollectQrCodeUI", getIntent(), (Bundle) null);
            } else {
                C88144b.m109791i(this, "collect", ".ui.CollectMainUI", getIntent(), (Bundle) null);
            }
        }
        finish();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
