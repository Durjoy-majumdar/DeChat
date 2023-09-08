package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.res.Resources;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import lg3.C88496e;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.j2 */
public class C85446j2 implements MMApplicationContext.IResourceProvider {

    /* renamed from: a */
    public final /* synthetic */ SettingsLanguageUI f249034a;

    public C85446j2(SettingsLanguageUI settingsLanguageUI) {
        this.f249034a = settingsLanguageUI;
    }

    public Resources getResources() {
        return C88496e.m110361d(this.f249034a.getApplication().getResources(), this.f249034a.getApplication(), false);
    }
}
