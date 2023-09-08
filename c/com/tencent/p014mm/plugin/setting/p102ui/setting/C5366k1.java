package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.k1 */
public class C5366k1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SettingsAboutSystemUI f21009d;

    public C5366k1(SettingsAboutSystemUI settingsAboutSystemUI) {
        this.f21009d = settingsAboutSystemUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.SettingsAboutSystemUI", "lo-nfc-goTosetNfcSwitch user go set system nfc switch");
        SettingsAboutSystemUI settingsAboutSystemUI = this.f21009d;
        settingsAboutSystemUI.f205663e = true;
        Intent intent = new Intent("android.settings.NFC_SETTINGS");
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        SettingsAboutSystemUI settingsAboutSystemUI2 = settingsAboutSystemUI;
        C117292a.m165358d(settingsAboutSystemUI2, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI$4", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        settingsAboutSystemUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(settingsAboutSystemUI2, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI$4", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
