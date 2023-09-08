package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Intent;
import android.net.Uri;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import j20.C117292a;
import k20.C9556a;
import kj2.C117407d;
import nj3.C11184p0;
import nj3.C76912y0;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.b1 */
public class C5339b1 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ SettingsAboutMicroMsgUI f20972d;

    public C5339b1(SettingsAboutMicroMsgUI settingsAboutMicroMsgUI) {
        this.f20972d = settingsAboutMicroMsgUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            ClipboardHelper.setText(this.f20972d.getString(C0966R.string.fmy));
            SettingsAboutMicroMsgUI settingsAboutMicroMsgUI = this.f20972d;
            C76912y0.m92769h(settingsAboutMicroMsgUI, settingsAboutMicroMsgUI.getString(C0966R.string.ipm), C0966R.C0969drawable.icon_toast_ok);
            C117407d.INSTANCE.idkeyStat(250, 32, 1, false);
        } else if (itemId == 1) {
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.setFlags(268435456);
            intent.setData(Uri.parse("tel:" + this.f20972d.getString(C0966R.string.fmy)));
            SettingsAboutMicroMsgUI settingsAboutMicroMsgUI2 = this.f20972d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SettingsAboutMicroMsgUI settingsAboutMicroMsgUI3 = settingsAboutMicroMsgUI2;
            C117292a.m165358d(settingsAboutMicroMsgUI3, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutMicroMsgUI$12", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsAboutMicroMsgUI2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(settingsAboutMicroMsgUI3, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutMicroMsgUI$12", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117407d.INSTANCE.idkeyStat(250, 31, 1, false);
        }
    }
}
