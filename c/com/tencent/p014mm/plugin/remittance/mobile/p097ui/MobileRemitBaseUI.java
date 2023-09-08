package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitBaseUI */
public abstract class MobileRemitBaseUI extends WalletBaseUI {
    /* renamed from: H7 */
    public void mo97196H7() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(MMApplicationContext.getPackageName(), "com.tencent.mm.ui.LauncherUI"));
        intent.addFlags(67108864);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitBaseUI", "finishMobileRemitProcess", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitBaseUI", "finishMobileRemitProcess", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public boolean needLockPage() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }
}
