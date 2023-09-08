package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import j20.C117292a;
import k20.C9556a;
import nj3.C88990b;
import p214om.C11502f;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.k3 */
public class C5367k3 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ SettingsSwitchAccountUI f21010d;

    public C5367k3(SettingsSwitchAccountUI settingsSwitchAccountUI) {
        this.f21010d = settingsSwitchAccountUI;
    }

    public void onAnimationEnd(Animator animator) {
        Log.m105924i("MicroMsg.SettingsSwitchAccountUI", "up animation end");
        Intent b = ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93169b(this.f21010d);
        b.addFlags(67108864);
        SettingsSwitchAccountUI settingsSwitchAccountUI = this.f21010d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(b);
        SettingsSwitchAccountUI settingsSwitchAccountUI2 = settingsSwitchAccountUI;
        C117292a.m165358d(settingsSwitchAccountUI2, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI$7", "onAnimationEnd", "(Landroid/animation/Animator;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        settingsSwitchAccountUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(settingsSwitchAccountUI2, "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI$7", "onAnimationEnd", "(Landroid/animation/Animator;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f21010d.finish();
        C88990b.m111200i(this.f21010d);
    }
}
