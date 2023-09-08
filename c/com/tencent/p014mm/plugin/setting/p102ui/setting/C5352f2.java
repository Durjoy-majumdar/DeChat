package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.app.ProgressDialog;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import f40.C86709a0;
import j20.C117292a;
import k20.C9556a;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.f2 */
public class C5352f2 implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ SettingsCreateAliasUI f20988d;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.f2$a */
    public class C5353a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C117747y f20989d;

        /* renamed from: e */
        public final /* synthetic */ int f20990e;

        /* renamed from: f */
        public final /* synthetic */ int f20991f;

        public C5353a(C117747y yVar, int i, int i2) {
            this.f20989d = yVar;
            this.f20990e = i;
            this.f20991f = i2;
        }

        public void run() {
            ProgressDialog progressDialog = C5352f2.this.f20988d.f20833e;
            if (progressDialog != null) {
                progressDialog.dismiss();
                C5352f2.this.f20988d.f20833e = null;
            }
            C5352f2.this.f20988d.f20841p = null;
            if (this.f20989d.getType() == 255) {
                boolean z = (this.f20990e == -3 && this.f20991f == 4) ? false : true;
                Intent intent = new Intent(C5352f2.this.f20988d, SettingsAliasResultUI.class);
                intent.putExtra("has_pwd", z);
                SettingsCreateAliasUI settingsCreateAliasUI = C5352f2.this.f20988d;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                SettingsCreateAliasUI settingsCreateAliasUI2 = settingsCreateAliasUI;
                C117292a.m165358d(settingsCreateAliasUI2, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsCreateAliasUI$5$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                settingsCreateAliasUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(settingsCreateAliasUI2, "com/tencent/mm/plugin/setting/ui/setting/SettingsCreateAliasUI$5$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C5352f2.this.f20988d.finish();
            }
        }
    }

    public C5352f2(SettingsCreateAliasUI settingsCreateAliasUI) {
        this.f20988d = settingsCreateAliasUI;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105918d("MicroMsg.SettingsCreateAliasUI", "onSceneEnd " + i + " errCode " + i2 + " errMsg " + str + "  " + yVar.getType());
        C86709a0.m107524d().mo123470p(255, this.f20988d.f20841p);
        MMHandlerThread.postToMainThread(new C5353a(yVar, i2, i));
    }
}
