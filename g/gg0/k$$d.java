package gg0;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindMobilePolicyUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import hg0.C76170j0;

public final /* synthetic */ class k$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f350521d;

    public /* synthetic */ k$$d(String str) {
        this.f350521d = str;
    }

    public final void run() {
        String str = this.f350521d;
        int i = BindMobilePolicyUI.f344310C;
        Intent intent = new Intent(MMApplicationContext.getContext(), BindMobilePolicyUI.class);
        intent.addFlags(67108864);
        intent.putExtra("key_upload_scene", 9);
        intent.putExtra("key_wording_cfg", str);
        MMWizardActivity.m7017L7(MMApplicationContext.getContext(), intent);
        C76170j0.f223160i = 1;
        Log.m105924i("MicroMsg.BindMobilePolicyUI", "realStartBindPhoneGuidanceUI");
    }
}
