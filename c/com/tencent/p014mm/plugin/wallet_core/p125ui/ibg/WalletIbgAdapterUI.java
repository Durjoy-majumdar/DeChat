package com.tencent.p014mm.plugin.wallet_core.p125ui.ibg;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import nj3.C88989a;
import ob0.C117747y;
import w53.C53082b;
import yq3.C79143a;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.ibg.WalletIbgAdapterUI */
public class WalletIbgAdapterUI extends WalletBaseUI {
    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentViewVisibility(4);
        this.mNetSceneMgr.mo105624c(1564);
        doSceneForceProgress(new C53082b());
    }

    public void onDestroy() {
        this.mNetSceneMgr.mo105630i(1564);
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i == 0 && i2 == 0 && (yVar instanceof C53082b)) {
            C53082b bVar = (C53082b) yVar;
            int i3 = bVar.f148153g;
            String str2 = bVar.f148152f;
            Log.m105925i("MicroMsg.WalletH5AdapterUI", "hy: get success! url is: %s, download x5 = %b", str2, Integer.valueOf(i3));
            if (i3 != 1) {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", str2);
                intent.putExtra("showShare", false);
                C75228t.m90217J(this, intent);
                finish();
                return false;
            }
        } else {
            C79143a.m95764c(this, (Bundle) null, 0);
        }
        return false;
    }
}
